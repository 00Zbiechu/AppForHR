package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Podanie;

@Repository
public interface PodanieRepository extends JpaRepository<Podanie, Integer> {
}