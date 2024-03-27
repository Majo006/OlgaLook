package com.BaiOlgaLook.Bai.service;

import com.BaiOlgaLook.Bai.DTO.HistorialTratamientoDTO;

import java.util.List;

public interface HistorialTratamiendoService {

    HistorialTratamientoDTO CreateHistorialTratamiento(HistorialTratamientoDTO historialTratamientoDTO);
    HistorialTratamientoDTO GetHistorialTratamientoById(Long Id);
    List<HistorialTratamientoDTO> getAllHistorialTratamiento();

    HistorialTratamientoDTO updateHistorial(Long id, HistorialTratamientoDTO updatedHistorial);
}
