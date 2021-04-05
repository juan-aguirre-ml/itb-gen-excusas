package com.itb.excusas.repositories;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ExcusasRepository  implements ExcusasRepo{


    private HashMap<Integer,ExcusaDTO> excusas = new HashMap<Integer, ExcusaDTO>();


    public ExcusaDTO getExcusaById(int idExcusa){
        return excusas.getOrDefault(idExcusa, null);
    }


}
