package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lokalizacja")
public class Lokalizacja {
    @Id
    @Column(name = "id_lokalizacja", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_kraj", nullable = false)
    private Kraj idKraj;

    @Column(name = "ulica", nullable = false, length = 30)
    private String ulica;

    @Column(name = "kod_pocztowy", nullable = false, length = 10)
    private String kodPocztowy;

    @Column(name = "miasto", nullable = false, length = 30)
    private String miasto;

    @Column(name = "wojewodztwo", nullable = false, length = 30)
    private String wojewodztwo;


}