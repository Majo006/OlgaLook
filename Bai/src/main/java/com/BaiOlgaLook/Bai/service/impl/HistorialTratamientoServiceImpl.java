package com.BaiOlgaLook.Bai.service.impl;

import com.BaiOlgaLook.Bai.DTO.HistorialTratamientoDTO;
import com.BaiOlgaLook.Bai.entity.HistorialTratamiento;
import com.BaiOlgaLook.Bai.mapper.HistorialTratamientoMapper;
import com.BaiOlgaLook.Bai.repository.HistorialTratamientoRepository;
import com.BaiOlgaLook.Bai.service.HistorialTratamiendoService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HistorialTratamientoServiceImpl implements HistorialTratamiendoService {
    private HistorialTratamientoRepository historialTratamientoRepository;
    @Override
    public HistorialTratamientoDTO CreateHistorialTratamiento(HistorialTratamientoDTO historialTratamientoDTO) {
        HistorialTratamiento historialTratamiento = HistorialTratamientoMapper.mapToHistorialTratamiento(historialTratamientoDTO);
        HistorialTratamiento savedhistorialTratamiento = historialTratamientoRepository.save(historialTratamiento);
        return HistorialTratamientoMapper.mapToHistorialTratamientoDTO(savedhistorialTratamiento);
    }

    @Override
    public HistorialTratamientoDTO GetHistorialTratamientoById(Long id) {

        HistorialTratamiento historialTratamiento = historialTratamientoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Historial not found for id: " + id));
        return HistorialTratamientoMapper.mapToHistorialTratamientoDTO(historialTratamiento);
    }

    @Override
    public List<HistorialTratamientoDTO> getAllHistorialTratamiento() {

        List<HistorialTratamiento> historialTratamientos= historialTratamientoRepository.findAll();
        return  historialTratamientos.stream().map(HistorialTratamientoMapper::mapToHistorialTratamientoDTO)
                .collect(Collectors.toList());
    }

    @Override
    public HistorialTratamientoDTO updateHistorial(Long id, HistorialTratamientoDTO updatedHistorial) {

        HistorialTratamiento historial = historialTratamientoRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Historial is not exist with given id: " + id)
        );
        historial.setCita(updatedHistorial.getCita());
        historial.setEmpleado(updatedHistorial.getEmpleado());
        historial.setUsuario(updatedHistorial.getUsuario());

        HistorialTratamiento updatedHistorialObj = historialTratamientoRepository.save(historial);
        return HistorialTratamientoMapper.mapToHistorialTratamientoDTO(updatedHistorialObj);

    }
}
