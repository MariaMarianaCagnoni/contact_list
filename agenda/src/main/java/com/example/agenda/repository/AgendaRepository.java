package com.example.agenda.repository;

import com.example.agenda.domain.Agenda;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mariana
 * @Project: agenda
 */
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    Page<Agenda> findAllByNome(String nome, Pageable pageable);

}
