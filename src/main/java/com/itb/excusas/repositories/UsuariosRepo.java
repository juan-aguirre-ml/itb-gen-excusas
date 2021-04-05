package com.itb.excusas.repositories;

import com.itb.excusas.dtos.UsuarioDTO;

public interface UsuariosRepo {

    public UsuarioDTO getUsuario(String username);

    public void addUsuario(UsuarioDTO usuario);

}
