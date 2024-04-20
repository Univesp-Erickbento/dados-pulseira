package com.PIVI.serverpulseira.Controllers;

import com.PIVI.serverpulseira.model.Entity.PulseiraEntity;
import com.PIVI.serverpulseira.service.impl.PulseiraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/bracelet")
public class PulseiraController {

    @Autowired
    PulseiraServiceImpl braceletService;

    @GetMapping
    public ResponseEntity<List<PulseiraEntity>> findAll() {
        List<PulseiraEntity> listBracelet = new ArrayList<>();
        listBracelet = braceletService.findAll();
        return ResponseEntity.ok().body(listBracelet);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<PulseiraEntity> findById(@PathVariable int id){
        PulseiraEntity obj = braceletService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping()
    public ResponseEntity<PulseiraEntity> create(@RequestBody PulseiraEntity objEntity) {
        PulseiraEntity newObj = braceletService.create(objEntity);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getPulseira_ID()).toUri();
        return ResponseEntity.created(uri).build();
    }


}
