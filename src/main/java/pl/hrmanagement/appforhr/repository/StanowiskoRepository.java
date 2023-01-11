package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Stanowisko;

@Repository
public interface StanowiskoRepository extends JpaRepository<Stanowisko, Integer> {

    Stanowisko findStanowiskoById(Integer id);


}