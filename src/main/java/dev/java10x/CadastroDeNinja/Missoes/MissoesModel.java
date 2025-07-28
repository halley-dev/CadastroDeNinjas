package dev.java10x.CadastroDeNinja.Missoes;


import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missao")
@Data
@NoArgsConstructor // criar construtor sem parametros
@AllArgsConstructor // Criar construtor com varios argumentos
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="diciculdade")
    private String dificuldade;

    // Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;



}
