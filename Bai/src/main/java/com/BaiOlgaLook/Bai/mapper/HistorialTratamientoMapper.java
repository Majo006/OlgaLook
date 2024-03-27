package com.BaiOlgaLook.Bai.mapper;

import com.BaiOlgaLook.Bai.DTO.HistorialTratamientoDTO;
import com.BaiOlgaLook.Bai.entity.HistorialTratamiento;

public class HistorialTratamientoMapper {
    public static HistorialTratamientoDTO mapToHistorialTratamientoDTO(HistorialTratamiento historialTratamiento){
        return new HistorialTratamientoDTO(
                historialTratamiento.getId(),
                historialTratamiento.getCita(),
                historialTratamiento.getUsuario(),
                historialTratamiento.getEmpleado()
        );
    }
    public static HistorialTratamiento mapToHistorialTratamiento(HistorialTratamientoDTO historialTratamientoDTO){
        return new HistorialTratamiento(
                historialTratamientoDTO.getId(),
                historialTratamientoDTO.getCita(),
                historialTratamientoDTO.getUsuario(),
                historialTratamientoDTO.getEmpleado()
        );
    }
}
