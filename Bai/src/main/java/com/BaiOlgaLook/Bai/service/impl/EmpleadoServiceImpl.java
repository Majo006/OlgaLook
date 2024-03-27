package com.BaiOlgaLook.Bai.service.impl;

import com.BaiOlgaLook.Bai.DTO.EmpleadoDTO;
import com.BaiOlgaLook.Bai.entity.Empleado;
import com.BaiOlgaLook.Bai.mapper.EmpleadoMapper;
import com.BaiOlgaLook.Bai.repository.EmpleadoRepository;
import com.BaiOlgaLook.Bai.service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {
    private EmpleadoRepository empleadoRepository;
    @Override
    public EmpleadoDTO CreateEmpleado(EmpleadoDTO empleadoDTO) {
        Empleado empleado = EmpleadoMapper.mapToEmpleado(empleadoDTO);
        Empleado savedEmpleado = empleadoRepository.save(empleado);
        return EmpleadoMapper.mapToEmpleadoDTO(savedEmpleado);
    }

    @Override
    public EmpleadoDTO GetEmpeladoById(Long id) {
        Empleado empleado = empleadoRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Empleado not found for id: " + id));
        return EmpleadoMapper.mapToEmpleadoDTO(empleado);
    }

    @Override
    public List<EmpleadoDTO> getAllEmpleado() {
        List<Empleado> empleados = empleadoRepository.findAll();
        return empleados.stream().map(EmpleadoMapper::mapToEmpleadoDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmpleadoDTO updateEmpleado(Long id, EmpleadoDTO updatedEmepleado) {

        Empleado empleado = empleadoRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Empleado is nor exist with given id: " + id)
        );
        empleado.setNombre(updatedEmepleado.getNombre());
        empleado.setApellido(updatedEmepleado.getApellido());
        empleado.setHabilidades(updatedEmepleado.getHabilidades());
        empleado.setTelefono(updatedEmepleado.getTelefono());
        empleado.setCorreo(updatedEmepleado.getCorreo());
        empleado.setUsuario(updatedEmepleado.getUsuario());

        Empleado updatedEmpleadoObj = empleadoRepository.save(empleado);
        return EmpleadoMapper.mapToEmpleadoDTO(updatedEmpleadoObj);
    }
}
