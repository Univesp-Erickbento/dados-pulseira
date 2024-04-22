package com.PIVI.serverpulseira.service.impl;

import com.PIVI.serverpulseira.exceptions.ObjectnotFoundExeption;
import com.PIVI.serverpulseira.model.Entity.PulseiraEntity;
import com.PIVI.serverpulseira.repositories.PulseiraRepository;
import com.PIVI.serverpulseira.service.PulseiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PulseiraServiceImpl implements PulseiraService {

    @Autowired
    PulseiraRepository braceletRepository;

    public List<PulseiraEntity> findAll(){
        List<PulseiraEntity> braceletEntityList = new ArrayList<>();
        braceletEntityList = braceletRepository.findAll();
        return braceletEntityList;
    }
    public PulseiraEntity findById(int id){
        Optional <PulseiraEntity> bracelet = braceletRepository.findById(id);
        return bracelet.orElseThrow(() -> new ObjectnotFoundExeption("Objeto não encontrado! Id: " + id));
    }

    public PulseiraEntity create(PulseiraEntity bracelet){
        bracelet.getPaciente_ID();
        bracelet.setPulseira_ID(null);
        PulseiraEntity newBraceletEntity = new PulseiraEntity(bracelet.getPaciente_ID());
        newBraceletEntity.setPaciente_ID(bracelet.getPaciente_ID());
        return braceletRepository.save(newBraceletEntity);

    }

}
