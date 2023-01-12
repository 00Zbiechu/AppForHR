package pl.hrmanagement.appforhr.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "rekrutacja", indexes = {
        @Index(name = "rekrutacja_petent_fk", columnList = "id_petent"),
        @Index(name = "rekrutacja_oferta_fk", columnList = "id_oferta"),
        @Index(name = "headhunter_rekrutacja_fk", columnList = "id_headhunter")
})
public class Rekrutacja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rekrutacja", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_petent", nullable = false)
    private Petent idPetent;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_headhunter", nullable = false)
    private Headhunter idHeadhunter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_oferta")
    private Oferta idOferta;

    @Column(name = "data_rozmowy_kwalifikacyjnej", nullable = false)
    private LocalDate dataRozmowyKwalifikacyjnej;

}