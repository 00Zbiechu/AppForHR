package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Rekrutacja;

@Repository
public interface RekrutacjaRepository extends JpaRepository<Rekrutacja, Integer> {
}