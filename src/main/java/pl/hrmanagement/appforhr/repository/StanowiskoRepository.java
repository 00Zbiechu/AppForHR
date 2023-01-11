package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Stanowisko;

@Repository
public interface StanowiskoRepository extends JpaRepository<Stanowisko, Integer> {

    @Query("SELECT DISTINCT s FROM Stanowisko s WHERE s.id=:id")
    Stanowisko findStanowiskoById(Integer id);


}