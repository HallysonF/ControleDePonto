package com.digitalinnovationonedesafiospring.ControleDePonto.model;

import lombok.*;
import org.springframework.core.SpringVersion;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String nome;
    @ManyToOne
    private Company company;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private Workday workday;
    private BigDecimal tolerancia;
    private LocalDate initWorkday;
    private LocalDate finalWorday;
}
