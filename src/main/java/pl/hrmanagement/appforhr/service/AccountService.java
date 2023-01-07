package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.dto.AccountDto;
import pl.hrmanagement.appforhr.dto.LoginDto;
import pl.hrmanagement.appforhr.entity.Account;
import pl.hrmanagement.appforhr.mapper.AccountMapper;
import pl.hrmanagement.appforhr.repository.AccountRepository;



@Service
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public String hashPassword(String password){

        String encodedPassword = passwordEncoder.encode(password);
        return encodedPassword;


    }


    public boolean isEmailUnique(Account account){

        if(accountRepository.isEmailUnique(account.getEmail().toLowerCase()).isPresent()){

            return false;

        }else {

            return true;

        }

    }

    public void saveAccount(AccountDto accountDto){

            Account account = accountMapper.toEntity(accountDto);

            //Lowercase email
            account.setEmail(account.getEmail().toLowerCase());

            //Check if email is unique
            System.out.println(isEmailUnique(account));

            //Hashowanie hasła
            String newPassword = this.hashPassword(account.getPassword());
            account.setPassword(newPassword);



            accountRepository.save(account);


    }








    public boolean loginIntoAccount(LoginDto loginDto){

        String hashedPass = accountRepository.getPasswordForGivenEmail(loginDto.getEmail());

        if(passwordEncoder.matches(loginDto.getPassword(),hashedPass)){

            return true;

        }else{

            return false;

        }


    }





}
