package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Kierownik;
import pl.hrmanagement.appforhr.projections.ListActiveManagers;

import java.util.List;

@Repository
public interface KierownikRepository extends JpaRepository<Kierownik, Integer> {

    @Query("select k.id as id, k.kierownikImie as name, k.kierownikNazwisko as surname," +
            " d.nazwaDzialu as department, k.kierownikZarobki as salary, k.kierownikNrTelefonu as phoneNumber, " +
            " k.kierownikMail as mail, k.kierownikDataUrodzenia as birthDate, k.kierownikPesel as idNumber," +
            " k.kierownikUlica as street, k.kierownikMiasto as city, k.kierownikKraj as country, k.kierownikWojewodztwo as state," +
            " k.kierownikKodPocztowy as postcode " +
            "from Kierownik k join k.idDzial d " +
            "WHERE k.kierownikStatusZatrudnienia = true")
    List<ListActiveManagers> getListOfActiveManagers();

}