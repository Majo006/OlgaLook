package com.BaiOlgaLook.Bai.controller;

import com.BaiOlgaLook.Bai.DTO.CitaDTO;
import com.BaiOlgaLook.Bai.service.CitaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/cita")
@CrossOrigin("*")
public class CitaController {
    public CitaService citaService;
    @PostMapping
    public ResponseEntity<CitaDTO>
    createCita(@RequestBody CitaDTO citaDTO){
        CitaDTO savedCita=citaService.CreateCita(citaDTO);
        return new ResponseEntity<>(savedCita, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<CitaDTO>
    getCitaById(@PathVariable("id") Long id){
        CitaDTO citaDTO=citaService.GetCitaById(id);
        return ResponseEntity.ok(citaDTO);
    }
    @GetMapping
    public ResponseEntity<List<CitaDTO>>
    getAllCita(){
        List<CitaDTO> cita=citaService.getAllCita();
        return ResponseEntity.ok(cita);
    }
}
