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
@Table(name = "headhunter", indexes = {
        @Index(name = "dzial_headhunter_fk", columnList = "id_dzial")
})
public class Headhunter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_headhunter", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_dzial", nullable = false)
    private Dzial idDzial;

    @Column(name = "headhunter_imie", nullable = false, length = 20)
    private String headhunterImie;

    @Column(name = "headhunter_nazwisko", nullable = false, length = 20)
    private String headhunterNazwisko;

    @Column(name = "headhunter_data_urodzenia", nullable = false)
    private LocalDate headhunterDataUrodzenia;

    @Column(name = "headhunter_pesel", nullable = false, length = 11)
    private String headhunterPesel;

    @Column(name = "headhunter_nr_telefonu", nullable = false, length = 9)
    private String headhunterNrTelefonu;

    @Column(name = "headhunter_mail", length = 20)
    private String headhunterMail;

    @Column(name = "headhunter_ulica", nullable = false, length = 30)
    private String headhunterUlica;

    @Column(name = "headhunter_nr_domu", nullable = false)
    private Integer headhunterNrDomu;

    @Column(name = "headhunter_nr_mieszkania")
    private Integer headhunterNrMieszkania;

    @Column(name = "headhunter_miasto", nullable = false, length = 30)
    private String headhunterMiasto;

    @Column(name = "headhinter_kraj", nullable = false, length = 20)
    private String headhinterKraj;

    @Column(name = "headhunter_wojewodztwo", nullable = false, length = 30)
    private String headhunterWojewodztwo;

    @Column(name = "headhunter_kod_pocztowy", nullable = false, length = 10)
    private String headhunterKodPocztowy;

    @Column(name = "headhunter_zarobki", nullable = false)
    private BigDecimal headhunterZarobki;

    @Column(name = "headhunter_data_zatrudnienia", nullable = false)
    private LocalDate headhunterDataZatrudnienia;

    @Column(name = "headhunter_status_zatrudnienia", nullable = false)
    private Boolean headhunterStatusZatrudnienia = false;

    @OneToMany(mappedBy = "idHeadhunter")
    private Set<Rekrutacja> rekrutacjas = new LinkedHashSet<>();

}