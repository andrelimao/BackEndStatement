package br.com.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class Transferencia {
    @Id
    @GeneratedValue
    private Long id;

    @Getter @Setter
    private Timestamp data_transferencia;

    @Getter @Setter
    private float valor;

    @Getter @Setter
    private String tipo;

    @Getter @Setter
    private String nome_operador;

    @Getter @Setter
    private int conta_id;
}
