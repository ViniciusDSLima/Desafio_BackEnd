package br.com.banco.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;

@Entity
@Table(name = "conta")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "id_conta")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long id;
    private String nomeResponsavel;

}
