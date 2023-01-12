package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.dto.AccountDto;
import pl.hrmanagement.appforhr.entity.Account;
import pl.hrmanagement.appforhr.mapper.AccountMapper;
import pl.hrmanagement.appforhr.repository.RegisterRepository;

@Service
@RequiredArgsConstructor
public class RegisterService {


    private final RegisterRepository registerRepository;
    private final AccountMapper accountMapper;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();



    public String hashPassword(String password){

        String encodedPassword = passwordEncoder.encode(password);
        return encodedPassword;


    }


    public boolean isEmailUnique(Account account){

        if(registerRepository.isEmailUnique(account.getEmail().toLowerCase()).isPresent()){

            return false;

        }else {

            return true;

        }

    }

    public boolean saveAccount(AccountDto accountDto){

        Account account = accountMapper.toEntity(accountDto);

        //Lowercase email
        account.setEmail(account.getEmail().toLowerCase());

        //Check if email is unique
        if(isEmailUnique(account)){

            //Hashowanie hasła
            String newPassword = this.hashPassword(account.getPassword());
            account.setPassword(newPassword);

            registerRepository.save(account);

            return true;

        }else{

            return false;

        }




    }


}
