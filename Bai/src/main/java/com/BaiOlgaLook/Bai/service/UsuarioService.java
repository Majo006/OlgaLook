package com.BaiOlgaLook.Bai.service;

import com.BaiOlgaLook.Bai.DTO.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO getUsuarioById(Long id);
    UsuarioDTO updateUsuario(Long id, UsuarioDTO updatedUsuario);
    List<UsuarioDTO> getAllUsuarios();

}
