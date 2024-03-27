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
@Table(name= "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "habilidades", nullable = false, length = 200)
    private String habilidades;
    @Column(name = "telefono", nullable = false, unique = true, length = 10)
    private String telefono;
    @Column(name = "correo", nullable = false, unique = true, length = 100)
    private String correo;
    @Column(name = "contraseña", nullable = false, unique = false, length = 16)
    private String contraseña;
    @Column (name = "IDusuario", nullable = false)
    private Long usuario;
}
