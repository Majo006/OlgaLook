package com.BaiOlgaLook.Bai.mapper;

import com.BaiOlgaLook.Bai.DTO.ServicioDTO;
import com.BaiOlgaLook.Bai.entity.Servicio;

public class ServicioMapper {
    public static ServicioDTO mapToServicioDTO(Servicio servicio){
        return new ServicioDTO(
                servicio.getId(),
                servicio.getNombre(),
                servicio.getDescripcion(),
                servicio.getDuracionaprox(),
                servicio.getPrecioaprox()
        );
    }
    public static Servicio mapToServicio(ServicioDTO servicioDTO){
        return new Servicio(
                servicioDTO.getId(),
                servicioDTO.getNombre(),
                servicioDTO.getDescripcion(),
                servicioDTO.getDuracionaprox(),
                servicioDTO.getPrecioaprox()
        );
    }
}
