package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Oferta;
import pl.hrmanagement.appforhr.projections.ListOfOffers;

import java.util.List;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Integer> {

    @Query("SELECT o.tytul as title, s.nazwaStanowiska as position, o.opisOferty as desc, o.wymagania as req," +
            " o.lokalizacja as loc, o.dataWystawieniaOferty as date " +
            "FROM Oferta o JOIN o.idStanowisko s")
    List<ListOfOffers> getListOfOffers();

}