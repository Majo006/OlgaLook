package com.BaiOlgaLook.Bai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora", nullable = false, unique = true)
    private Time hora;
    @Column(name = "confirmacion", nullable = true,unique = false)
    private Boolean confirmacion;
    @Column(name = "cliente", nullable = false, unique = false)
    private String cliente;
    @Column(name = "empleado", nullable = false)
    private String empleado;
    @Column(name = "Servicio", nullable = false)
    private String Servicio;
    @Column(name = "Estado",nullable = false)
    private String Estado;
}
