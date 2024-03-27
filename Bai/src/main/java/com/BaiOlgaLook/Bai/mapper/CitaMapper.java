package com.BaiOlgaLook.Bai.mapper;

import com.BaiOlgaLook.Bai.DTO.CitaDTO;
import com.BaiOlgaLook.Bai.entity.Cita;

import java.util.Date;

public class CitaMapper {
    public static CitaDTO mapToCitaDTO(Cita cita){
        return new CitaDTO(
                cita.getId(),
                cita.getFecha(),
                cita.getHora(),
                cita.getConfirmacion(),
                cita.getCliente(),
                cita.getEmpleado(),
                cita.getEstado(),
                cita.getServicio()
        );
    }
    public static Cita mapToCita(CitaDTO citaDTO){
        return new Cita(
                citaDTO.getId(),
                citaDTO.getFecha(),
                citaDTO.getHora(),
                citaDTO.getConfirmación(),
                citaDTO.getCliente(),
                citaDTO.getEmpleado(),
                citaDTO.getEstado(),
                citaDTO.getServicio()
        );
    }
}
