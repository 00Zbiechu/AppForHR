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
@Table(name = "podanie", indexes = {
        @Index(name = "oferta_podanie_fk", columnList = "id_oferta"),
        @Index(name = "petent_podanie_fk", columnList = "id_petent")
})
public class Podanie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_podanie", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_oferta", nullable = false)
    private Oferta idOferta;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_petent", nullable = false)
    private Petent idPetent;

    @Column(name = "kwalifikacje", nullable = false, length = 100)
    private String kwalifikacje;

    @Column(name = "cv", nullable = false, length = 20)
    private String cv;

    @Column(name = "data_zlozenia_podania", nullable = false)
    private LocalDate dataZlozeniaPodania;

}