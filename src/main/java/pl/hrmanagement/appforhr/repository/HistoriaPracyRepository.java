package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.HistoriaPracy;
import pl.hrmanagement.appforhr.projections.ListEmployeeJobStory;

import java.util.List;

@Repository
public interface HistoriaPracyRepository extends JpaRepository<HistoriaPracy, Integer> {

    @Query("SELECT p.pracownikImie as name, p.pracownikNazwisko as surname, d.nazwaDzialu as department," +
            " s.nazwaStanowiska as position, h.rozpoczeciePracy as start, h.zakonczeniePracy as end " +
            "FROM HistoriaPracy h JOIN h.idDzial d JOIN h.idStanowisko s" +
            " JOIN h.idPracownik p")
    List<ListEmployeeJobStory> whenEmployeeStartAndEndJob();

}