package com.cars.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Car {
    private Long id;
    
    @Column(length = 15, nullable = false)
    private String modelo;

    @Column(length = 20, nullable = false)
    private String fabricante;

    @Column(length = 10, nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private int anoModelo;
}
