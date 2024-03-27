package com.BaiOlgaLook.Bai.service.impl;

import com.BaiOlgaLook.Bai.DTO.CitaDTO;
import com.BaiOlgaLook.Bai.entity.Cita;
import com.BaiOlgaLook.Bai.mapper.CitaMapper;
import com.BaiOlgaLook.Bai.repository.CitaRepository;
import com.BaiOlgaLook.Bai.service.CitaService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CitaServiceImpl implements CitaService {
    private CitaRepository citaRepository;
    @Override
    public CitaDTO CreateCita(CitaDTO citaDTO) {
        Cita cita = CitaMapper.mapToCita(citaDTO);
        Cita savedCita = citaRepository.save(cita);
        return CitaMapper.mapToCitaDTO(savedCita);
    }

    @Override
    public CitaDTO GetCitaById(Long id) {
        Cita cita = citaRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cita not found for id: " + id));
        return CitaMapper.mapToCitaDTO(cita);
    }

    @Override
    public CitaDTO updateCita(Long id, CitaDTO updatedCita) {

        Cita cita = citaRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cita is not exist with given id: " + id)
        );
        cita.setFecha(updatedCita.getFecha());
        cita.setHora(updatedCita.getHora());
        cita.setCliente(updatedCita.getCliente());
        cita.setEmpleado(updatedCita.getEmpleado());
        cita.setServicio(updatedCita.getServicio());
        cita.setEstado(updatedCita.getEstado());
        return null;
    }

    @Override
    public List<CitaDTO> getAllCita() {
        List<Cita> citas = citaRepository.findAll();
        return citas.stream().map(CitaMapper::mapToCitaDTO)
                .collect(Collectors.toList());
    }
}
