package com.itb.excusas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcusaUsadaDTO {
    private int idExcusa;
    private int contUsos = 0;

    public ExcusaUsadaDTO(int idExcusa) {
        this.contUsos++;
        this.idExcusa = idExcusa;
    }

    public void usar(){
        this.contUsos++;
    }
}
