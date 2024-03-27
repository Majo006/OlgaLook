package com.BaiOlgaLook.Bai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Time;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "descripción", nullable = false, length = 100)
    private String descripcion;
    @Column(name = "duracionaprox", nullable = false)
    private Time duracionaprox;
    @Column(name = "precioaprox", nullable = false)
    private BigDecimal precioaprox;

}
