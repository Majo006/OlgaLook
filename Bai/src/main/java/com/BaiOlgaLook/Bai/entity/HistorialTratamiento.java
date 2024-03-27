package com.BaiOlgaLook.Bai.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "HistorialTratamientos")
public class HistorialTratamiento {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column (name = "cita", nullable = false)
    private String cita;
    @Column(name = "usuario", nullable = false)
    private String Usuario;
    @Column(name = "empleado", nullable = false)
    private String Empleado;
}
