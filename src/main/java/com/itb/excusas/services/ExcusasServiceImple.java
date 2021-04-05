package com.itb.excusas.services;

import com.itb.excusas.dtos.ExcusaDTO;
import com.itb.excusas.dtos.ExcusaUsadaDTO;
import com.itb.excusas.dtos.UsuarioDTO;
import com.itb.excusas.exceptions.ExcusaUsadaException;
import com.itb.excusas.repositories.ExcusasRepository;
import com.itb.excusas.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ExcusasServiceImple implements ExcusasService{

    private Random randomGen;

    @Autowired
    private ExcusasRepository excusasRepository;

    @Autowired
    private UsuariosRepository usuariosRepository;


    @Override
    public ExcusaDTO getExcusa(String usuario) throws ExcusaUsadaException {
        int rnd = randomGen.nextInt(5);
        ExcusaDTO excusa = excusasRepository.getExcusaById(rnd);

        UsuarioDTO user = usuariosRepository.getUsuario(usuario);

        if (excusa.getUsos() < user.getExcusaUsada(rnd)){
            user.usarExcusa(excusa);
            return excusa;
        }else
            throw new ExcusaUsadaException();


    }
}
