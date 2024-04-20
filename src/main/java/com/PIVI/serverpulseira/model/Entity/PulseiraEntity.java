package com.PIVI.serverpulseira.model.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity()
@Table(name = "pulseira")
public class PulseiraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int pulseira_ID;


    @OneToMany(mappedBy = "pulseiraId")
    @JsonIgnore
    private List<DadosPulseiraEntity> dados = new ArrayList<>();


    private int paciente_ID;


    public void setPulseira_ID(Integer o) {
    }

}
