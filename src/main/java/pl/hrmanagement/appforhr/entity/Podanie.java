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
@Table(name = "podanie")
public class Podanie {
    @Id
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