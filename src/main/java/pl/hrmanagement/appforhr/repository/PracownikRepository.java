package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Pracownik;
import pl.hrmanagement.appforhr.projections.ListActiveEmployee;

import java.util.List;

@Repository
public interface PracownikRepository extends JpaRepository<Pracownik, Integer> {

    @Query("select p.id as id, p.pracownikImie as name, p.pracownikNazwisko as surname, s.nazwaStanowiska as position," +
            " d.nazwaDzialu as department, p.pracownikZarobki as salary, p.pracownikNrTelefonu as phoneNumber, " +
            " p.pracownikMail as mail, p.pracownikDataUrodzenia as birthDate, p.pracownikPesel as idNumber," +
            " p.pracownikUlica as street,p.pracownikMiasto as city, p.pracownikKraj as country, p.pracownikWojewodztwo as state," +
            " p.pracownikKodPocztowy as postcode " +
            "from Pracownik p join p.historiaPracies hp join hp.idDzial d join hp.idStanowisko s " +
            "WHERE p.pracownikStatusZatrudnienia = true")
    List<ListActiveEmployee> getListOfActiveEmployee();







}