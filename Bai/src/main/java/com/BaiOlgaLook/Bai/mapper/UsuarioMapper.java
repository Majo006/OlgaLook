package com.BaiOlgaLook.Bai.mapper;

import com.BaiOlgaLook.Bai.DTO.UsuarioDTO;
import com.BaiOlgaLook.Bai.entity.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO mapToUsuarioDTO(Usuario usuario){
        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getAprellido(),
                usuario.getCorreoelectronico(),
                usuario.getTelefono(),
                usuario.getContraseña(),
                usuario.getVerificacioncorreo(),
                usuario.getAceptaciondatos(),
                usuario.getTipousuario()

        );
    }
    public static Usuario mapUsuario(UsuarioDTO usuarioDTO){
        return new Usuario(
                usuarioDTO.getId(),
                usuarioDTO.getNombre(),
                usuarioDTO.getApellido(),
                usuarioDTO.getCorreoelectronico(),
                usuarioDTO.getTelefono(),
                usuarioDTO.getContraseña(),
                usuarioDTO.getVerificacioncorreo(),
                usuarioDTO.getAceptaciondatos(),
                usuarioDTO.getTipousuario()
        );
    }
}
