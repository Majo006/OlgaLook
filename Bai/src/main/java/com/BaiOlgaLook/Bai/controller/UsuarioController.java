package com.BaiOlgaLook.Bai.controller;

import com.BaiOlgaLook.Bai.DTO.UsuarioDTO;
import com.BaiOlgaLook.Bai.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/usuario")
@CrossOrigin("*")
public class UsuarioController {
    private UsuarioService usuarioService;
    @PostMapping
    public ResponseEntity<UsuarioDTO>
    createUsuario(@RequestBody UsuarioDTO usuarioDTO){
        UsuarioDTO savedUsuario = usuarioService.createUsuario(usuarioDTO);
        return new ResponseEntity<>(savedUsuario, HttpStatus.CREATED);
    }
    @GetMapping("/id")
    public ResponseEntity<UsuarioDTO>
    getUsuarioById(@PathVariable("id") Long id){
        UsuarioDTO usuarioDTO=usuarioService.getUsuarioById(id);
        return ResponseEntity.ok(usuarioDTO);
    }


    @GetMapping
    public ResponseEntity<List<UsuarioDTO>>
    getAllUsuario(){
        List<UsuarioDTO> usuario = usuarioService.getAllUsuarios();
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("{id}")
    public ResponseEntity<UsuarioDTO> updateUsuario(@PathVariable("id") Long id,@RequestBody UsuarioDTO updatedUsuario){
        UsuarioDTO usuarioDTO = usuarioService.updateUsuario(id, updatedUsuario);
        return ResponseEntity.ok(usuarioDTO);
    }
}

