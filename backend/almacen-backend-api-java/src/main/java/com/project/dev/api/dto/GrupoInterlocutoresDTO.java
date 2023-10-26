/*
 * @fileoverview    {GrupoInterlocutoresDTO}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code GrupoInterlocutoresDTO}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class GrupoInterlocutoresDTO {

    private Long intIdGrupoInterlocutor;
    private String strNombreGrupo;
    private String strDescripcion;
    private String strCuentaContable;
    private String strUsuario;
    private Date dtFecha;
    private Long intIdListaPrecio;

}
