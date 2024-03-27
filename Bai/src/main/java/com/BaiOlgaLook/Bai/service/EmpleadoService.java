package com.BaiOlgaLook.Bai.service;

import com.BaiOlgaLook.Bai.DTO.EmpleadoDTO;

import java.util.List;

public interface EmpleadoService {
    EmpleadoDTO CreateEmpleado(EmpleadoDTO empleadoDTO);

    EmpleadoDTO GetEmpeladoById(Long Id);

    List<EmpleadoDTO> getAllEmpleado();

    EmpleadoDTO updateEmpleado(Long id, EmpleadoDTO updatedEmepleado);
}
