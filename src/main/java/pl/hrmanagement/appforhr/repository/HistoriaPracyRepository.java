package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.HistoriaPracy;

@Repository
public interface HistoriaPracyRepository extends JpaRepository<HistoriaPracy, Integer> {
}