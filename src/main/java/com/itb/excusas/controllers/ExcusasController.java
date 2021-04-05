package com.itb.excusas.controllers;

import com.itb.excusas.dtos.ErrorDTO;
import com.itb.excusas.exceptions.ExcusaUsadaException;
import com.itb.excusas.repositories.ExcusasRepository;
import com.itb.excusas.services.ExcusasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcusasController {

    @Autowired
    ExcusasService excusasService;

    @GetMapping("/excusa")
    public ResponseEntity getExcusa(@RequestParam String username) throws ExcusaUsadaException {

        return new ResponseEntity(excusasService.getExcusa(username), HttpStatus.OK);
    }

    @ExceptionHandler(value = ExcusaUsadaException.class)
    public ResponseEntity<ExcusaUsadaException> handleException(ExcusaUsadaException excusaUsadaException){
        ErrorDTO error = new ErrorDTO();
        error.setMessage("La excusa \""+ excusaUsadaException.getMessage()+"\"fue usada demasiadas veces.");
        error.setName("Excusa sobreusada.");
        return new ResponseEntity<ExcusaUsadaException>(HttpStatus.BAD_REQUEST);
    }

}
