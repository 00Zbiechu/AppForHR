package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "stanowisko")
public class Stanowisko {
    @Id
    @Column(name = "id_stanowisko", nullable = false)
    private Integer id;

    @Column(name = "nazwa_stanowiska", nullable = false, length = 20)
    private String nazwaStanowiska;

    @Column(name = "opis_stanowiska", nullable = false, length = 100)
    private String opisStanowiska;

    @Column(name = "minimalne_zarobki", nullable = false)
    private BigDecimal minimalneZarobki;

    @Column(name = "maksymalne_zarobki", nullable = false)
    private BigDecimal maksymalneZarobki;

}