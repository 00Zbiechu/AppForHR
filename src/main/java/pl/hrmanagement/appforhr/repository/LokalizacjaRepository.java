package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Lokalizacja;

@Repository
public interface LokalizacjaRepository extends JpaRepository<Lokalizacja, Integer> {
}