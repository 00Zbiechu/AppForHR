package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "kierownik", indexes = {
        @Index(name = "dzial_kierownik_fk", columnList = "id_dzial")
})
public class Kierownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kierownik", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_dzial", nullable = false)
    private Dzial idDzial;

    @Column(name = "kierownik_imie", nullable = false, length = 20)
    private String kierownikImie;

    @Column(name = "kierownik_nazwisko", nullable = false, length = 20)
    private String kierownikNazwisko;

    @Column(name = "kierownik_data_urodzenia", nullable = false)
    private LocalDate kierownikDataUrodzenia;

    @Column(name = "kierownik_pesel", nullable = false, length = 11)
    private String kierownikPesel;

    @Column(name = "kierownik_nr_telefonu", nullable = false, length = 9)
    private String kierownikNrTelefonu;

    @Column(name = "kierownik_mail", length = 20)
    private String kierownikMail;

    @Column(name = "kierownik_ulica", nullable = false, length = 30)
    private String kierownikUlica;

    @Column(name = "kierownik_nr_domu", nullable = false)
    private Integer kierownikNrDomu;

    @Column(name = "kierownik_nr_mieszkania")
    private Integer kierownikNrMieszkania;

    @Column(name = "kierownik_miasto", nullable = false, length = 30)
    private String kierownikMiasto;

    @Column(name = "kierownik_kraj", nullable = false, length = 20)
    private String kierownikKraj;

    @Column(name = "kierownik_wojewodztwo", nullable = false, length = 30)
    private String kierownikWojewodztwo;

    @Column(name = "kierownik_kod_pocztowy", nullable = false, length = 10)
    private String kierownikKodPocztowy;

    @Column(name = "kierownik_zarobki", nullable = false)
    private BigDecimal kierownikZarobki;

    @Column(name = "kierownik_data_zatrudnienia", nullable = false)
    private LocalDate kierownikDataZatrudnienia;

    @Column(name = "kierownik_status_zatrudnienia", nullable = false)
    private Boolean kierownikStatusZatrudnienia = false;

    @Column(name = "obowiazki", nullable = false, length = 100)
    private String obowiazki;

}