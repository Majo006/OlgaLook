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
@Table(name= "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, unique = false, length = 50)
    private String nombre;
    @Column (name = "apellido", nullable = false, unique = false, length = 50)
    private String aprellido;
    @Column(name = "correoelectronico", nullable = false, unique = true, length = 100)
    private String correoelectronico;
    @Column(name = "telefono", nullable = false, unique = true, length = 10)
    private Long telefono;
    @Column(name = "contraseña", nullable = false,unique = false,length = 16)
    private String contraseña;
    @Column(name = "verificacioncorreo", nullable = true,unique = false)
    private Boolean verificacioncorreo;
    @Column(name = "aceptaciondatos", nullable = true,unique = false)
    private Boolean aceptaciondatos;
    @Column(name = "tipousuario", nullable = false, unique = false, length = 13)
    private String tipousuario;


}
