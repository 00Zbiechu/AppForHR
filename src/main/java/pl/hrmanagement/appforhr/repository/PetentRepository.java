package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Petent;

@Repository
public interface PetentRepository extends JpaRepository<Petent, Integer> {
}