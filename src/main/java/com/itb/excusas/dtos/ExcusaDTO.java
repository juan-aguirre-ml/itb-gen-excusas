package com.itb.excusas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcusaDTO {
    private int excusaId;
    private String mensaje;
    private int usos;
}
