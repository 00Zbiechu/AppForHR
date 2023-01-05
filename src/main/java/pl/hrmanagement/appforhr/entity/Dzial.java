package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "dzial", indexes = {
        @Index(name = "lokalizacja_dzial_fk", columnList = "id_lokalizacja")
})
public class Dzial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dzial", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_lokalizacja", nullable = false)
    private Lokalizacja idLokalizacja;

    @Column(name = "nazwa_dzialu", nullable = false, length = 30)
    private String nazwaDzialu;

    @Column(name = "opis_dzialu", nullable = false, length = 100)
    private String opisDzialu;

    @Column(name = "liczba_wolnych_stanowisk", nullable = false)
    private Integer liczbaWolnychStanowisk;

    @OneToMany(mappedBy = "idDzial")
    private Set<Kierownik> kierowniks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idDzial")
    private Set<HistoriaPracy> historiaPracies = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idDzial")
    private Set<Headhunter> headhunters = new LinkedHashSet<>();

}