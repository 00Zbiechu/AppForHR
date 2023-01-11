package pl.hrmanagement.appforhr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.hrmanagement.appforhr.dto.LoginDto;
import pl.hrmanagement.appforhr.repository.LoginRepository;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public boolean loginIntoAccount(LoginDto loginDto) {

        String hashedPass = loginRepository.getPasswordForGivenEmail(loginDto.getEmail());

        return passwordEncoder.matches(loginDto.getPassword(), hashedPass);


    }

}
