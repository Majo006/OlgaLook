package com.BaiOlgaLook.Bai.DTO;

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
public class RecordatorioDTO {
    private Long id;
    private Date fecha;
    private Time hora;
    private String mensaje;
    private String estado;
}
