package dev.java10x.CadastroDeNinja;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //@ManyToOne Um NInja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")//Foring chave estrageira
    private MissoesModel missoes;


}
