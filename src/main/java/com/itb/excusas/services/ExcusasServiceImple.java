package com.itb.excusas.services;

import com.itb.excusas.dtos.ExcusaDTO;
import com.itb.excusas.repositories.ExcusasRepository;
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
    public ExcusaDTO getExcusa(String usuario) {
        int rnd = randomGen.nextInt(5);
        ExcusaDTO excusa = excusasRepository.getExcusaById(rnd);

        UsuarioDTO usuario = usuariosRepository.getUsuario(usuario);

        if (excusa.getUsos() < usuario)
        

    }
}
