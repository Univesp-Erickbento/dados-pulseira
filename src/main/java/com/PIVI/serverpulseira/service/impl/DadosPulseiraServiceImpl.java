package com.PIVI.serverpulseira.service.impl;

import com.PIVI.serverpulseira.exceptions.ObjectnotFoundExeption;
import com.PIVI.serverpulseira.model.Entity.DadosPulseiraEntity;
import com.PIVI.serverpulseira.model.Entity.PulseiraEntity;
import com.PIVI.serverpulseira.repositories.DadosPulseiraRepository;
import com.PIVI.serverpulseira.repositories.PulseiraRepository;
import com.PIVI.serverpulseira.service.DadosPulseiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DadosPulseiraServiceImpl implements DadosPulseiraService {

    @Autowired
    DadosPulseiraRepository dataRepository;

    @Autowired
   PulseiraServiceImpl pulseiraService;

    public List<DadosPulseiraEntity> findAll(){
        List<DadosPulseiraEntity> dataEntityList = new ArrayList<>();
        dataEntityList = dataRepository.findAll();
        return dataEntityList;
    }
    public DadosPulseiraEntity findById(int id){
        Optional <DadosPulseiraEntity> bracelet = dataRepository.findById(id);
        return bracelet.orElseThrow(() -> new ObjectnotFoundExeption("Objeto não encontrado! Id: " + id));
    }

    public DadosPulseiraEntity create(DadosPulseiraEntity dataEntity){
        System.out.println(dataEntity.getPulseiraId());
        dataEntity.setId(null);
        DadosPulseiraEntity newDataEntity = new DadosPulseiraEntity();

      // PulseiraEntity  pulseira = pulseiraService.findById(2);
       // newDataEntity.setPulseiraId(dataEntity.getPulseiraId());
        newDataEntity.setId(null);
        newDataEntity.setPacienteId(dataEntity.getPulseiraId().getPaciente_ID());
        newDataEntity.setDataHora(LocalDateTime.now());
        newDataEntity.setAx(dataEntity.getAx());
        newDataEntity.setAy(dataEntity.getAy());
        newDataEntity.setAz(dataEntity.getAz());
        newDataEntity.setGx(dataEntity.getGx());
        newDataEntity.setGy(dataEntity.getGy());
        newDataEntity.setGz(dataEntity.getGz());
        newDataEntity.setFreq(dataEntity.getFreq());
        newDataEntity.setOxi(dataEntity.getOxi());
        newDataEntity.setTemp(dataEntity.getTemp());

        return dataRepository.save(newDataEntity);

    }

}
