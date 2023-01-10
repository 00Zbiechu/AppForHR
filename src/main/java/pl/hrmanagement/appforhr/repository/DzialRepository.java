package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Dzial;
import pl.hrmanagement.appforhr.projections.ListOfDepartments;

import java.util.List;

@Repository
public interface DzialRepository extends JpaRepository<Dzial, Integer> {

    @Query("SELECT d.nazwaDzialu as name, d.opisDzialu as desc, d.liczbaWolnychStanowisk as count , l.miasto as city," +
            " l.ulica as street, l.wojewodztwo as state,l.kodPocztowy as postcode, k.krajNazwa as country" +
            " FROM Dzial d JOIN d.idLokalizacja l JOIN l.idKraj k")
    List<ListOfDepartments> getListOfDepartments();


}