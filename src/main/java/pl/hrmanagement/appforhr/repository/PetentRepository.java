package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Petent;
import pl.hrmanagement.appforhr.projections.ListApplicationForJob;

import java.util.List;

@Repository
public interface PetentRepository extends JpaRepository<Petent, Integer> {

    @Query("SELECT COUNT(p.id) as count, o.tytul as title FROM Petent p JOIN p.podanies pod " +
            "JOIN pod.idOferta o GROUP BY title")
    List<ListApplicationForJob> getApplicationForEachPosition();

}