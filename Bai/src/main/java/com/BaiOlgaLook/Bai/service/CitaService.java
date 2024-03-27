package com.BaiOlgaLook.Bai.service;

import com.BaiOlgaLook.Bai.DTO.CitaDTO;

import java.util.List;

public interface CitaService {
    CitaDTO CreateCita(CitaDTO citaDTO);
    CitaDTO GetCitaById(Long Id);

    CitaDTO updateCita(Long id, CitaDTO updatedCita);

    List<CitaDTO> getAllCita();
}
