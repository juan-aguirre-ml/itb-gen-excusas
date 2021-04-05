package com.itb.excusas.repositories;

import com.itb.excusas.dtos.UsuarioDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class UsuariosRepository implements UsuariosRepo{

    private HashMap<String,UsuarioDTO> usuarios = new HashMap<>();
    @Override
    public UsuarioDTO getUsuario(String username) {
        return null;
    }

    @Override
    public void addUsuario(UsuarioDTO usuario) {

    }
}
