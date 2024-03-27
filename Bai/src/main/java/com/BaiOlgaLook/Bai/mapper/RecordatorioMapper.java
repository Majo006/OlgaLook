package com.BaiOlgaLook.Bai.mapper;

import com.BaiOlgaLook.Bai.DTO.RecordatorioDTO;
import com.BaiOlgaLook.Bai.entity.Recordatorio;

public class RecordatorioMapper {
    public static RecordatorioDTO mapToRecordatorioDTO(Recordatorio recordatorio){
        return new RecordatorioDTO(
                recordatorio.getId(),
                recordatorio.getFecha(),
                recordatorio.getHora(),
                recordatorio.getMensaje(),
                recordatorio.getEstado()
        );
    }
    public static Recordatorio mapToRecordatorio(RecordatorioDTO recordatorioDTO){
        return new Recordatorio(
                recordatorioDTO.getId(),
                recordatorioDTO.getFecha(),
                recordatorioDTO.getHora(),
                recordatorioDTO.getMensaje(),
                recordatorioDTO.getEstado()
        );
    }
}
