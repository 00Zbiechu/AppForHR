package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Account;

import java.util.Optional;


@Repository
public interface LoginRepository extends JpaRepository<Account, Integer> {




    @Query("SELECT a.password FROM Account a WHERE a.email=:email")
    String getPasswordForGivenEmail(String email);


}