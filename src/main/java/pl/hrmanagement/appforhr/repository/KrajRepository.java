package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Kraj;

@Repository
public interface KrajRepository extends JpaRepository<Kraj, Integer> {
}