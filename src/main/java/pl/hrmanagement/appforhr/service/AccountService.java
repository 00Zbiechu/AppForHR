package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.entity.Account;
import pl.hrmanagement.appforhr.repository.AccountRepository;



@Service
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository accountRepository;



    public String hashPassword(String password){

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(password);
        return encodedPassword;


    }

    public void saveAccount(Account account){

            Account accountWithNewPassword = account;
            String newPassword = this.hashPassword(accountWithNewPassword.getPassword());
            accountWithNewPassword.setPassword(newPassword);
            accountRepository.save(accountWithNewPassword);


    }




}
