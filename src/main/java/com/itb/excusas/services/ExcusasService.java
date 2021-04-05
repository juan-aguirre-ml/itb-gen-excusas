package com.itb.excusas.services;

import com.itb.excusas.dtos.ExcusaDTO;
import com.itb.excusas.exceptions.ExcusaUsadaException;

public interface ExcusasService {

    public ExcusaDTO getExcusa(String usuario) throws ExcusaUsadaException;
}
