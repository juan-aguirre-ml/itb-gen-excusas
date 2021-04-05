package com.itb.excusas.repositories;

import com.itb.excusas.dtos.ExcusaDTO;

public interface ExcusasRepo {

    public ExcusaDTO getExcusaById(int idExcusa);

    public int addExcusa(ExcusaDTO excusa);

}
