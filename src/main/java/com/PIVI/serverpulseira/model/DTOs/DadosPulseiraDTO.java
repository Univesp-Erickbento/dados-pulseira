package com.PIVI.serverpulseira.model.DTOs;

import com.PIVI.serverpulseira.model.Entity.DadosPulseiraEntity;
import com.PIVI.serverpulseira.model.Entity.PulseiraEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class DadosPulseiraDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private PulseiraEntity pulseiraId;

    private Integer pacienteId;

    private int freq;

    private int oxi;

    @JsonFormat(pattern = "HH:mm:ss dd/MM/yyyy")
    private LocalDateTime dataHora;

    public DadosPulseiraDTO(DadosPulseiraEntity obj) {
        this.id = obj.getId();
        this.pulseiraId = obj.getPulseiraId();
        this.pacienteId = obj.getPacienteId();
        this.freq = obj.getFreq();
        this.oxi = obj.getOxi();
        this.dataHora = obj.getDataHora();
    }

    public void setId(Integer o) {
    }
}
