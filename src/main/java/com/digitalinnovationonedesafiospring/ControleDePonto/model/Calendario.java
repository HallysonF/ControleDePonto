package com.digitalinnovationonedesafiospring.ControleDePonto.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private TipoData tipoData;
    private String description;
    private LocalDateTime date;
}
