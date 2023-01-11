package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "oferta", indexes = {
        @Index(name = "oferta_stanowisko_fk", columnList = "id_stanowisko")
})
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oferta", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_stanowisko", nullable = false)
    private Stanowisko idStanowisko;

    @Column(name = "tytul", nullable = false, length = 30)
    private String tytul;

    @Column(name = "opis_oferty", nullable = false, length = 100)
    private String opisOferty;

    @Column(name = "wymagania", nullable = false, length = 100)
    private String wymagania;

    @Column(name = "lokalizacja", nullable = false, length = 20)
    private String lokalizacja;

    @Column(name = "data_wystawienia_oferty", nullable = false)
    private LocalDate dataWystawieniaOferty;

    @OneToMany(mappedBy = "idOferta")
    private Set<Rekrutacja> rekrutacjas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idOferta")
    private Set<Podanie> podanies = new LinkedHashSet<>();


}