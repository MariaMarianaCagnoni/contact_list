package com.example.agenda.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;

/**
 * @author mariana
 * @Project: agenda
 */

@Data
@Entity
@Table(name = "agenda_contato")
public class Agenda implements BaseModel<Agenda> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome")
    @NotBlank(message = "Nome é obrigatário")
    private String nome;

    @Column(name = "cpf")
    @NotBlank(message = "CPF é obrigatário")
    private String cpf;

    @NotNull(message = "Sobrenome é obrigatário")
    @Column(name = "sobrenome", length = 300)
    private String sobrenome;

    @Column(name = "telefone")

    @NotBlank(message = "Telefone é obrigatário")
    private String telefone;

    @Column(name = "email")
    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatário")
    private String email;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "endereco")
    @NotBlank(message = "Endereço é obrigatário")
    private String Endereco;

    @Column(name = "data_nascimento")
    @NotBlank(message = "Data de Nascimento é obrigatário")

    private String dataNascimento;

    @Column(name = "sexo", length = 50)
    private String sexo;

    @Column(name = "estado_civil", length = 50)
    private String estadoCivil;

    @Column(name = "observacao", length = 1000)
    private String observacao;




    @Override
    public Agenda safeUpdateInfo(Agenda entity) {
        this.setEmail(getEmail());
        return this;
    }

    @Override
    public void setCreatedAt(LocalDateTime createdAt) {

    }
}
