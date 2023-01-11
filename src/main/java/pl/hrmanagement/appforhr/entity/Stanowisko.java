package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "stanowisko")
public class Stanowisko {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stanowisko", nullable = false)
    private Integer id;

    @Column(name = "nazwa_stanowiska", nullable = false, length = 20)
    private String nazwaStanowiska;

    @Column(name = "opis_stanowiska", nullable = false, length = 100)
    private String opisStanowiska;

    @Column(name = "minimalne_zarobki", nullable = false)
    private BigDecimal minimalneZarobki;

    @Column(name = "maksymalne_zarobki", nullable = false)
    private BigDecimal maksymalneZarobki;

    @OneToMany(mappedBy = "idStanowisko")
    private Set<Oferta> ofertas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idStanowisko")
    private Set<HistoriaPracy> historiaPracies = new LinkedHashSet<>();

}