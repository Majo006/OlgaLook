package com.BaiOlgaLook.Bai.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitaDTO {
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
    private Time hora;
    private Boolean confirmación;
    private String empleado;
    private String cliente;
    private String Servicio;
    private String Estado;
}
