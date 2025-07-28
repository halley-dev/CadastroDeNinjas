package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // contrutor sem argumentos
@AllArgsConstructor// construtor com argumentos
@Data// getter e seter
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)// essa coluna e unica
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "img_url")
    private String imgUrl;

    //@ManyToOne Um NInja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")//Foring chave estrageira
    private MissoesModel missoes;


}
