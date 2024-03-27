package com.BaiOlgaLook.Bai.controller;

import com.BaiOlgaLook.Bai.DTO.ServicioDTO;
import com.BaiOlgaLook.Bai.service.ServicioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/servicio")
@CrossOrigin("*")
public class ServicioController {
    private ServicioService servicioService;
    @PostMapping
    public ResponseEntity<ServicioDTO>
    createServicio(@RequestBody ServicioDTO servicioDTO){
        ServicioDTO savedServicio = servicioService.CreateServicio(servicioDTO);
        return new ResponseEntity<>(savedServicio, HttpStatus.CREATED);
    }
    @GetMapping ("/id")
    public ResponseEntity<ServicioDTO>
    getServicioById(@PathVariable("id") Long id){
        ServicioDTO servicioDTO=servicioService.getServicioById(id);
        return ResponseEntity.ok(servicioDTO);
    }


    @GetMapping
    public ResponseEntity<List<ServicioDTO>>
    getAllServicio(){
        List<ServicioDTO> servicio = servicioService.getAllServicio();
        return ResponseEntity.ok(servicio);
    }

   @PutMapping("{id}")
    public ResponseEntity<ServicioDTO> updateServicio(@PathVariable("id") Long servicioId,
                                                      @RequestBody ServicioDTO updatedServicio){
        ServicioDTO servicioDTO = servicioService.updateServicio(servicioId, updatedServicio);
        return ResponseEntity.ok(servicioDTO);
    }


}
