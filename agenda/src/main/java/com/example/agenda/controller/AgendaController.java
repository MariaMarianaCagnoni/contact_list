package com.example.agenda.controller;

import com.example.agenda.domain.Agenda;
import com.example.agenda.domain.dto.AgendaDTO;
import com.example.agenda.domain.dto.CreateAgendaDTO;
import com.example.agenda.service.AgendaService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mariana
 * @Project: agenda
 */
@RestController
@RequestMapping("/api/contatos")
public class AgendaController {

    private final AgendaService agendaService;

    private final ModelMapper modelMapper;

    public AgendaController(AgendaService agendaService, ModelMapper modelMapper) {
        this.agendaService = agendaService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    ResponseEntity<List<Agenda>> findaAll() {
        var agenda = agendaService.findAll();
        return new ResponseEntity<>(agenda,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<AgendaDTO> findById(@PathVariable("id") final Long id) {
        var agenda = agendaService.findById(id);
        return new ResponseEntity<>(this.modelMapper.map(agenda,AgendaDTO.class), HttpStatus.OK);
    }

    @PostMapping()
    ResponseEntity<AgendaDTO> saveContact(@RequestBody CreateAgendaDTO createAgendaDTO) {
        var postAgenda = agendaService.save(this.modelMapper.map(createAgendaDTO,Agenda.class));
        return new ResponseEntity<>(this.modelMapper.map(postAgenda, AgendaDTO.class),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        this.agendaService.deleteById(id);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Agenda> update(@PathVariable("id") Long id, @RequestBody Agenda agenda) {
        var agendaUpdated = agendaService.update(id, agenda);
        return new ResponseEntity<>(agendaUpdated, HttpStatus.OK);
    }
}


