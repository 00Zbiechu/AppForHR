package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.dto.LoginDto;
import pl.hrmanagement.appforhr.entity.Account;
import pl.hrmanagement.appforhr.projections.Password;

import java.util.Optional;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


    @Query("SELECT a FROM Account a WHERE a.email=:email")
    Optional<Account> isEmailUnique(String email);

    @Query("SELECT a.password FROM Account a WHERE a.email=:email")
    String getPasswordForGivenEmail(String email);

    @Query("SELECT a FROM Account a WHERE a.email=:email AND a.password=:password")
    Optional<LoginDto> getAccountForGivenEmailAndPassword(String email, String password);


}