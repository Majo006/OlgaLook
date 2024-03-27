package com.BaiOlgaLook.Bai.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String correoelectronico;
    private Long telefono;
    private String contraseña;
    private Boolean verificacioncorreo;
    private Boolean aceptaciondatos;
    private String tipousuario;
}
