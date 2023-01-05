package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Kierownik;

@Repository
public interface KierownikRepository extends JpaRepository<Kierownik, Integer> {
}