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
@Table(name = "kraj")
public class Kraj {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kraj", nullable = false)
    private Integer id;

    @Column(name = "kraj_nazwa", nullable = false, length = 30)
    private String krajNazwa;

    @OneToMany(mappedBy = "idKraj")
    private Set<Lokalizacja> lokalizacjas = new LinkedHashSet<>();

}