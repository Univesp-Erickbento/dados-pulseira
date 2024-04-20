package com.PIVI.serverpulseira.Controllers;

import com.PIVI.serverpulseira.model.Entity.DadosPulseiraEntity;
import com.PIVI.serverpulseira.service.impl.DadosPulseiraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/data")
public class DadosPulseiraController {

    @Autowired
    DadosPulseiraServiceImpl dataService = new DadosPulseiraServiceImpl();

    @GetMapping
    public ResponseEntity<List<DadosPulseiraEntity>> findAll() {
        List<DadosPulseiraEntity> listData = new ArrayList<>();
        listData = dataService.findAll();
        return ResponseEntity.ok().body(listData);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<DadosPulseiraEntity> findById(@PathVariable Integer id){
        DadosPulseiraEntity obj = dataService.findById(id);
        return ResponseEntity.ok().body(new DadosPulseiraEntity());
    }
    @PostMapping
    public ResponseEntity<DadosPulseiraEntity> create(@RequestBody DadosPulseiraEntity objEntity) {
        DadosPulseiraEntity newObj = dataService.create(objEntity);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getPulseiraId()).toUri();
        return ResponseEntity.created(uri).build();
    }


}
