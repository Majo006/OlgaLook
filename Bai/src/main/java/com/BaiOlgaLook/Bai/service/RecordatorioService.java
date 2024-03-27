package com.BaiOlgaLook.Bai.service;

import com.BaiOlgaLook.Bai.DTO.RecordatorioDTO;

import java.util.List;

public interface RecordatorioService {
    RecordatorioDTO CreateRecordatorio(RecordatorioDTO recordatorioDTO);
    RecordatorioDTO GetRecordatorioById(Long Id);
    List<RecordatorioDTO> getAllRecordatorio();

    RecordatorioDTO updateRecordatorio(Long id, RecordatorioDTO updatedRecordatorio);
}
