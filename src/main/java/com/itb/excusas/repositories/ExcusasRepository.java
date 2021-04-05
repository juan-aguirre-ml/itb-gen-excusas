package com.itb.excusas.repositories;

import com.itb.excusas.dtos.ExcusaDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ExcusasRepository implements ExcusasRepo{

    int idCounter = 0;
    private HashMap<Integer, ExcusaDTO> excusas = new HashMap<Integer, ExcusaDTO>();


    @Override
    public ExcusaDTO getExcusaById(int idExcusa){
        return excusas.getOrDefault(idExcusa, null);
    }

    @Override
    public int addExcusa(ExcusaDTO excusa) {
        this.idCounter++;
        excusa.setExcusaId(this.idCounter);
        excusas.put(this.idCounter,excusa);
        return this.idCounter;
    }


}
