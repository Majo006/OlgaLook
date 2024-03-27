package com.BaiOlgaLook.Bai.service.impl;

import com.BaiOlgaLook.Bai.DTO.UsuarioDTO;
import com.BaiOlgaLook.Bai.entity.Usuario;
import com.BaiOlgaLook.Bai.mapper.UsuarioMapper;
import com.BaiOlgaLook.Bai.repository.UsuarioRepository;
import com.BaiOlgaLook.Bai.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.mapUsuario(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return  UsuarioMapper.mapToUsuarioDTO(savedUsuario);
    }

    @Override
    public UsuarioDTO getUsuarioById(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Usuario not found for id: " + id));
        return UsuarioMapper.mapToUsuarioDTO(usuario);
    }

    @Override
    public UsuarioDTO updateUsuario(Long id, UsuarioDTO updatedUsuario) {

        Usuario usuario = usuarioRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Uusario is not exist with given id: " + id)
        );

        usuario.setNombre(updatedUsuario.getNombre());
        usuario.setAprellido(updatedUsuario.getApellido());
        usuario.setCorreoelectronico(updatedUsuario.getCorreoelectronico());
        usuario.setTelefono(updatedUsuario.getTelefono());
        usuario.setContraseña(updatedUsuario.getContraseña());
        usuario.setTipousuario(updatedUsuario.getTipousuario());

        Usuario updatedUsuarioObj = usuarioRepository.save(usuario);
        return UsuarioMapper.mapToUsuarioDTO(updatedUsuarioObj);
    }

    @Override
    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(UsuarioMapper::mapToUsuarioDTO)
                .collect(Collectors.toList());
    }


}
