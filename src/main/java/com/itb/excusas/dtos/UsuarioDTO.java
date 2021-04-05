package com.itb.excusas.dtos;

import com.itb.excusas.exceptions.ExcusaUsadaException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private String username;
    private HashMap<Integer,ExcusaUsadaDTO> excusasUsadas;

    public void usarExcusa(ExcusaDTO excusa){
        if (excusasUsadas.containsKey(excusa.getExcusaId())){
            ExcusaUsadaDTO exc = excusasUsadas.get(excusa.getExcusaId());
            exc.usar();
        }
        else{
            ExcusaUsadaDTO tmp = new ExcusaUsadaDTO(excusa.getExcusaId());
            excusasUsadas.put(excusa.getExcusaId(),tmp);

        }
    }

    public int getExcusaUsada(int randomId){
        if (this.excusasUsadas.containsKey(randomId)){
            return this.excusasUsadas.get(randomId).getContUsos();
        }else
            return 0;
    }



}
