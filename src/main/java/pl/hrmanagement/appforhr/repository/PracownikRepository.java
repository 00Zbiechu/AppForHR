package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Pracownik;

@Repository
public interface PracownikRepository extends JpaRepository<Pracownik, Integer> {
}