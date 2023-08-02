package com.example.agenda.domain.dto;

import java.io.Serializable;

/**
 * @author mariana
 * @Project: agenda
 */
public record CreateAgendaDTO(String nome,
                              String cpf,
                              String sobrenome,
                              String telefone,
                              String email,
                              String profissao,
                              String endereco,
                              String dataNascimento,
                              String sexo,
                              String estadoCivil,
                              String observacao) implements Serializable {
}
