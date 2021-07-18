package com.digitalinnovationonedesafiospring.ControleDePonto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Company {
    @Id
    @GeneratedValue
    private long id;
    private String description;
    private String cnpj;
    private String address;
    private String city;
    private String state;
    private String number;
    private String telepfone;
}
