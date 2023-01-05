package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pracownik")
public class Pracownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pracownik", nullable = false)
    private Integer id;

    @Column(name = "pracownik_imie", nullable = false, length = 20)
    private String pracownikImie;

    @Column(name = "pracownik_nazwisko", nullable = false, length = 20)
    private String pracownikNazwisko;

    @Column(name = "pracownik_data_urodzenia", nullable = false)
    private LocalDate pracownikDataUrodzenia;

    @Column(name = "pracownik_pesel", nullable = false, length = 11)
    private String pracownikPesel;

    @Column(name = "pracownik_nr_telefonu", nullable = false, length = 9)
    private String pracownikNrTelefonu;

    @Column(name = "pracownik_mail", length = 20)
    private String pracownikMail;

    @Column(name = "pracownik_ulica", nullable = false, length = 30)
    private String pracownikUlica;

    @Column(name = "pracownik_nr_domu", nullable = false)
    private Integer pracownikNrDomu;

    @Column(name = "pracownik_nr_mieszkania")
    private Integer pracownikNrMieszkania;

    @Column(name = "pracownik_miasto", nullable = false, length = 30)
    private String pracownikMiasto;

    @Column(name = "pracownik_kraj", nullable = false, length = 20)
    private String pracownikKraj;

    @Column(name = "pracownik_wojewodztwo", nullable = false, length = 30)
    private String pracownikWojewodztwo;

    @Column(name = "pracownik_kod_pocztowy", nullable = false, length = 10)
    private String pracownikKodPocztowy;

    @Column(name = "pracownik_zarobki", nullable = false)
    private BigDecimal pracownikZarobki;

    @Column(name = "pracownik_status_zatrudnienia", nullable = false)
    private Boolean pracownikStatusZatrudnienia = false;

    @OneToMany(mappedBy = "idPracownik")
    private Set<HistoriaPracy> historiaPracies = new LinkedHashSet<>();

}