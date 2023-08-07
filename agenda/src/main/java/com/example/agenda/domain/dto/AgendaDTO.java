package com.example.agenda.domain.dto;

import lombok.*;

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
public class AgendaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -1324042551719835412L;

    private Long id;
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
