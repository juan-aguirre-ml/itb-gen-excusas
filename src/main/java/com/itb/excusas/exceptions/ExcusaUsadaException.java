package com.itb.excusas.exceptions;

public class ExcusaUsadaException extends Throwable{
    public ExcusaUsadaException(){
        super("Esta excusa fue usada demasiadas veces!");
    }
}
