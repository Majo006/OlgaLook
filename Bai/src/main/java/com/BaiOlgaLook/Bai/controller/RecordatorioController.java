package com.BaiOlgaLook.Bai.controller;

import com.BaiOlgaLook.Bai.DTO.RecordatorioDTO;
import com.BaiOlgaLook.Bai.service.RecordatorioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/recordatorio")
@CrossOrigin("*")
public class RecordatorioController {
    private RecordatorioService recordatorioService;
    @PostMapping("/add")
    public ResponseEntity<RecordatorioDTO>
    createRecordatorio(@RequestBody RecordatorioDTO recordatorioDTO){
        RecordatorioDTO savedRecordatorio=recordatorioService.CreateRecordatorio(recordatorioDTO);
        return new ResponseEntity<>(savedRecordatorio, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<RecordatorioDTO>
    getRecordatorioById(@PathVariable("id") Long id){
        RecordatorioDTO recordatorioDTO=recordatorioService.GetRecordatorioById(id);
        return ResponseEntity.ok(recordatorioDTO);
    }
    @GetMapping("/all")
    public ResponseEntity<List<RecordatorioDTO>>
    getAllRecordatorio(){
        List<RecordatorioDTO> recordatorio=recordatorioService.getAllRecordatorio();
        return ResponseEntity.ok(recordatorio);
    }

    @PutMapping("{id}")
    public ResponseEntity<RecordatorioDTO> updateRecordatorio(@PathVariable("id") Long id, @RequestBody RecordatorioDTO updatedRecordatorio){
        RecordatorioDTO recordatorioDTO = recordatorioService.updateRecordatorio(id, updatedRecordatorio);
        return  ResponseEntity.ok(recordatorioDTO);
    }
}
