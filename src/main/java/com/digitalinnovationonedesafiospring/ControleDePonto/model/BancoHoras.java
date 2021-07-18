package com.digitalinnovationonedesafiospring.ControleDePonto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable

    public class BancoHorasId implements Serializable{
        private long idBanco;
        private long idMovimentacao;
        private long idUsuario;
    }
    @EmbeddedId
    @GeneratedValue
    private BancoHorasId id;
    private LocalDateTime dataT;
    private BigDecimal horasT;
    private BigDecimal saldoHoras;
}
