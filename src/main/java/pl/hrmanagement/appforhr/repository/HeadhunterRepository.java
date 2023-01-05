package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Headhunter;

@Repository
public interface HeadhunterRepository extends JpaRepository<Headhunter, Integer> {
}