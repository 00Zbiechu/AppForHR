package pl.hrmanagement.appforhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hrmanagement.appforhr.entity.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Integer> {
}