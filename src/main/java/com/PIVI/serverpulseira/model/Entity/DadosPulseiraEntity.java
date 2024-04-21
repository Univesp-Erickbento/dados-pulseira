package com.PIVI.serverpulseira.model.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity()
@Table(name = "dados_pulseira")
public class DadosPulseiraEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Dados_ID", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "pulseira_ID")
    private PulseiraEntity pulseiraId;

    private int pacienteId;
    @Column(name = "acelerometroX", length = 4)
    private int ax;
    @Column(name = "acelerometroY", length = 4)
    private int ay;
    @Column(name = "acelerometroZ", length = 4)
    private int az;
    @Column(name = "giroscopioX", length = 4)
    private int gx;
    @Column(name = "giroscopioY", length = 4)
    private int gy;
    @Column(name = "giroscopioZ", length = 4)
    private int gz;
    @Column(name = "frequenciaCardiaca", length = 4)
    private int freq;
    @Column(name = "oxigenacao", length = 4)
    private int oxi;
    @Column(name = "temperatura", length = 4)
    private int temp;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "dataHora")
    private LocalDateTime dataHora;


    public void setId(Integer o) {
    }
}
