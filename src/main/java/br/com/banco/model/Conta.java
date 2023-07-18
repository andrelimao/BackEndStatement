package br.com.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "conta_id")
@ToString
public class Conta {
    @Id
    @GeneratedValue
    @Getter
    private int conta_id;

    @Getter @Setter
    private String nome_responsavel;

    public Conta(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }
}
