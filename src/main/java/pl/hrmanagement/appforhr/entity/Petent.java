package pl.hrmanagement.appforhr.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "petent")
public class Petent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_petent", nullable = false)
    private Integer id;

    @Column(name = "petent_imie", nullable = false, length = 20)
    private String petentImie;

    @Column(name = "petent_nazwisko", nullable = false, length = 20)
    private String petentNazwisko;

    @Column(name = "petent_data_urodzenia", nullable = false)
    private LocalDate petentDataUrodzenia;

    @Column(name = "petent_pesel", nullable = false, length = 11)
    private String petentPesel;

    @Column(name = "petent_nr_telefonu", nullable = false, length = 9)
    private String petentNrTelefonu;

    @Column(name = "petent_mail", length = 20)
    private String petentMail;

    @Column(name = "petent_ulica", nullable = false, length = 30)
    private String petentUlica;

    @Column(name = "petent_nr_domu", nullable = false)
    private Integer petentNrDomu;

    @Column(name = "petent_nr_mieszkania")
    private Integer petentNrMieszkania;

    @Column(name = "petent_miasto", nullable = false, length = 30)
    private String petentMiasto;

    @Column(name = "petent_kraj", nullable = false, length = 20)
    private String petentKraj;

    @Column(name = "petent_wojewodztwo", nullable = false, length = 30)
    private String petentWojewodztwo;

    @Column(name = "petent_kod_pocztowy", nullable = false, length = 10)
    private String petentKodPocztowy;

    @OneToMany(mappedBy = "idPetent")
    private Set<Rekrutacja> rekrutacjas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idPetent")
    private Set<Podanie> podanies = new LinkedHashSet<>();


}