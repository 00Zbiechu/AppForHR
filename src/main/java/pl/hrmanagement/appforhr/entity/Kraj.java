package pl.hrmanagement.appforhr.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "kraj")
public class Kraj {
    @Id
    @Column(name = "id_kraj", nullable = false)
    private Integer id;

    @Column(name = "kraj_nazwa", nullable = false, length = 30)
    private String krajNazwa;



}