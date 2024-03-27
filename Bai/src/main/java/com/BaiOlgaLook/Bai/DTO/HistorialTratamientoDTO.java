package com.BaiOlgaLook.Bai.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistorialTratamientoDTO {
    private Long id;
    private String cita;
    private String Usuario;
    private String Empleado;
}
