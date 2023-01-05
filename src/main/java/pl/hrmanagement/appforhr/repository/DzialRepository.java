package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Dzial;

@Repository
public interface DzialRepository extends JpaRepository<Dzial, Integer> {
}