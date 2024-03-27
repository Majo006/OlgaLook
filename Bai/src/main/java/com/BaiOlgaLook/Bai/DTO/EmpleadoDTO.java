package com.BaiOlgaLook.Bai.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String habilidades;
    private String telefono;
    private String correo;
    private String contraseña;
    private Long usuario;
}
