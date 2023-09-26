package br.com.banco.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transferencia")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "")
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss ")
    private LocalDateTime dataTransferencia;
    private Long valor;
    @Column(name = "nome_operador_transacao")
    private String nomeOperadorTransacao;
}
