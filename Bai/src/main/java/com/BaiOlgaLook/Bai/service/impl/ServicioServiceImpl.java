package com.BaiOlgaLook.Bai.service.impl;

import com.BaiOlgaLook.Bai.DTO.ServicioDTO;
import com.BaiOlgaLook.Bai.entity.Servicio;
import com.BaiOlgaLook.Bai.mapper.ServicioMapper;
import com.BaiOlgaLook.Bai.repository.ServicioRepository;
import com.BaiOlgaLook.Bai.service.ServicioService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioServiceImpl implements ServicioService {
    private ServicioRepository servicioRepository;
    @Override
    public ServicioDTO CreateServicio(ServicioDTO servicioDTO) {

        Servicio servicio = ServicioMapper.mapToServicio(servicioDTO);
        Servicio savedServicio = servicioRepository.save(servicio);
        return ServicioMapper.mapToServicioDTO(savedServicio);
    }

    @Override
    public ServicioDTO getServicioById(Long id) {
        Servicio servicio = servicioRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Servicio not found for id: " + id));
        return ServicioMapper.mapToServicioDTO(servicio);
    }

    @Override
    public ServicioDTO updateServicio(Long servicioId, ServicioDTO updatedServicio) {

        Servicio servicio = servicioRepository.findById(servicioId).orElseThrow(
                () -> new ResourceNotFoundException("Servicio is not exist with given id: " + servicioId)
        );

        servicio.setNombre(updatedServicio.getNombre());
        servicio.setDescripcion(updatedServicio.getDescripcion());
        servicio.setDuracionaprox(updatedServicio.getDuracionaprox());
        servicio.setPrecioaprox(updatedServicio.getPrecioaprox());

        Servicio updatedServicioobj = servicioRepository.save(servicio);
        return ServicioMapper.mapToServicioDTO(updatedServicioobj);
    }


    @Override
    public List<ServicioDTO> getAllServicio() {
        List<Servicio> servicios=servicioRepository.findAll();
        return servicios.stream().map(ServicioMapper::mapToServicioDTO)
                .collect(Collectors.toList());
    }
}
