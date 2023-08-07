package com.example.agenda.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author mariana
 * @Project: agenda
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAgendaDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 7169824735820953281L;
    private String nome;
    private String cpf;
    private String sobrenome;
    private String telefone;
    private String email;
    private String profissao;
    private String endereco;
    private String dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String observacao;
}
