package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.hrmanagement.appforhr.entity.Account;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository<Account,Integer> {

    @Query("SELECT a FROM Account a WHERE a.email=:email")
    Optional<Account> isEmailUnique(String email);

}
