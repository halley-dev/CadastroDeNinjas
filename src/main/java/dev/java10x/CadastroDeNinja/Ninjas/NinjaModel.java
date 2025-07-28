package dev.java10x.CadastroDeNinja.Ninjas;
import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor // criar construtor sem parametros
@AllArgsConstructor // Criar construtor com varios argumentos

// Entity ele transforma uma classe em uma entidade do BD
//JPA Java Persistence API

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="nome")
    private String nome;

    @Column(unique = true)// essa coluna e unica
    private String email;

    @Column(name="img_url")
    private String img_url;

    @Column(name="idade")
    private int idade;


    @ManyToOne // Coluna onde tem uma unica missao
    @JoinColumn(name="missoes_id")// chave estrageira foreing
    private MissoesModel missoes;



    }

