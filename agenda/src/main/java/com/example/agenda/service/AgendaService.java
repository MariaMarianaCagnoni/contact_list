package com.example.agenda.service;

import com.example.agenda.Exception.ResourceNotFoundException;
import com.example.agenda.domain.Agenda;
import com.example.agenda.repository.AgendaRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mariana
 * @Project: agenda
 */

@Service
public class AgendaService {
    private final AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public List<Agenda> findAll() {
        return agendaRepository.findAll();
    }

    public Agenda findById(Long id) {
        return this.agendaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contato não encontrado"));
    }

    @Transactional
    public Agenda save(Agenda agenda) {
        return this.agendaRepository.save(agenda);
    }

    public void deleteById(Long id) {
        this.agendaRepository.deleteById(id);
    }

    public Page<Agenda> findAllByNome(String nome, Pageable pageable) {
        return agendaRepository.findAllByNome(nome, pageable);
    }

    @Transactional
    public Agenda update(Long id, Agenda entity) {
        Agenda agenda = this.findById(id);
        agenda.setNome(entity.getNome());
        agenda.setTelefone(entity.getTelefone());
        agenda.setEmail(entity.getEmail());
        return this.agendaRepository.save(agenda);


    }
}
