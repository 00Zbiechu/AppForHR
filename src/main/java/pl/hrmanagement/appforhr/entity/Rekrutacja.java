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
@Table(name = "rekrutacja")
public class Rekrutacja {
    @Id
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