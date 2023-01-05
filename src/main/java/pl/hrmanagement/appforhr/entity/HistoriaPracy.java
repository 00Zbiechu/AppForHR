package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "historia_pracy", indexes = {
        @Index(name = "dzial_historia_pracy_fk", columnList = "id_dzial"),
        @Index(name = "stanowisko_historia_pracy_fk", columnList = "id_stanowisko"),
        @Index(name = "pracownik_historia_pracy_fk", columnList = "id_pracownik")
})
public class HistoriaPracy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historia_pracy", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_stanowisko", nullable = false)
    private Stanowisko idStanowisko;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_dzial", nullable = false)
    private Dzial idDzial;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pracownik", nullable = false)
    private Pracownik idPracownik;

    @Column(name = "rozpoczecie_pracy", nullable = false)
    private LocalDate rozpoczeciePracy;

    @Column(name = "zakonczenie_pracy", nullable = false)
    private LocalDate zakonczeniePracy;

}