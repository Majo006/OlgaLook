package com.BaiOlgaLook.Bai.service;

import com.BaiOlgaLook.Bai.DTO.ServicioDTO;

import java.util.List;

public interface ServicioService {

    ServicioDTO CreateServicio(ServicioDTO servicioDTO);

    ServicioDTO getServicioById(Long Id);

    ServicioDTO updateServicio(Long servicioId, ServicioDTO updatedServicio);

    List<ServicioDTO> getAllServicio();
}
