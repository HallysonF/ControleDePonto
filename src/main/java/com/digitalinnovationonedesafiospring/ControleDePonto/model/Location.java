package com.digitalinnovationonedesafiospring.ControleDePonto.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Location {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String description;

}
