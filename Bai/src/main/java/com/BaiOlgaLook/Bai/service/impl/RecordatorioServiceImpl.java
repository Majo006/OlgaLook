package com.BaiOlgaLook.Bai.service.impl;

import com.BaiOlgaLook.Bai.DTO.RecordatorioDTO;
import com.BaiOlgaLook.Bai.entity.Recordatorio;
import com.BaiOlgaLook.Bai.mapper.RecordatorioMapper;
import com.BaiOlgaLook.Bai.repository.RecordatorioRepository;
import com.BaiOlgaLook.Bai.service.RecordatorioService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RecordatorioServiceImpl implements RecordatorioService {
    private RecordatorioRepository recordatorioRepository;
    @Override
    public RecordatorioDTO CreateRecordatorio(RecordatorioDTO recordatorioDTO) {
        Recordatorio recordatorio = RecordatorioMapper.mapToRecordatorio(recordatorioDTO);
        Recordatorio savedRecordatorio = recordatorioRepository.save(recordatorio);
        return RecordatorioMapper.mapToRecordatorioDTO(savedRecordatorio);
    }

    @Override
    public RecordatorioDTO GetRecordatorioById(Long id) {
        Recordatorio recordatorio = recordatorioRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Recordatorio not found for id: "+ id));
        return RecordatorioMapper.mapToRecordatorioDTO(recordatorio);
    }

    @Override
    public List<RecordatorioDTO> getAllRecordatorio() {
        List<Recordatorio> recordatorios = recordatorioRepository.findAll();
        return recordatorios.stream().map(RecordatorioMapper::mapToRecordatorioDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RecordatorioDTO updateRecordatorio(@PathVariable("Id") Long Id,
                                              @RequestBody RecordatorioDTO updatedRecordatorio) {

       Recordatorio recordatorio = recordatorioRepository.findById(Id).orElseThrow(
                () -> new ResourceNotFoundException("Recordatorio is not exist with given id: " + Id)
        );
        recordatorio.setFecha(updatedRecordatorio.getFecha());
        recordatorio.setHora(updatedRecordatorio.getHora());
        recordatorio.setMensaje(updatedRecordatorio.getMensaje());
        recordatorio.setEstado(updatedRecordatorio.getEstado());

        Recordatorio updatedrecordatorioObj = recordatorioRepository.save(recordatorio);
        return RecordatorioMapper.mapToRecordatorioDTO(updatedrecordatorioObj);
    }
}
