package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Headhunter;
import pl.hrmanagement.appforhr.projections.ListActiveHeadhunter;
import pl.hrmanagement.appforhr.projections.ListActiveManagers;

import java.util.List;

@Repository
public interface HeadhunterRepository extends JpaRepository<Headhunter, Integer> {

    @Query("select h.id as id, h.headhunterImie as name, h.headhunterNazwisko as surname," +
            "d.nazwaDzialu as department, h.headhunterZarobki as salary, h.headhunterNrTelefonu as phoneNumber, " +
            " h.headhunterMail as mail, h.headhunterDataUrodzenia as birthDate, h.headhunterPesel as idNumber," +
            " h.headhunterUlica as street, h.headhunterMiasto as city, h.headhinterKraj as country, h.headhunterWojewodztwo as state," +
            " h.headhunterKodPocztowy as postcode " +
            "from Headhunter h join h.idDzial d " +
            "WHERE h.headhunterStatusZatrudnienia = true")
    List<ListActiveHeadhunter> getListOfActiveHeadhunters();

}