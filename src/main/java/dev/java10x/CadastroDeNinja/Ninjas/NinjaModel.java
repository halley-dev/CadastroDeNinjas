package dev.java10x.CadastroDeNinja.Ninjas;
import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")

// Entity ele transforma uma classe em uma entidade do BD
//JPA Java Persistence API

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String nome;

    private String email;

    private int idade;
    @ManyToOne // Coluna onde tem uma unica missao
    @JoinColumn(name="missoes_id")// chave estrageira foreing
    private MissoesModel missoes;


    //constrtutor no args
    public NinjaModel() {
    }
    // contrutor all args
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    //set e getter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
