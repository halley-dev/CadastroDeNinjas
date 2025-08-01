package dev.java10x.CadastroDeNinja.Missoes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // contrutor sem argumentos
@AllArgsConstructor// construtor com argumentos
@Data// getter e seter
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany UMa missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore //para nao dar loop infinito na listagem
    private List<NinjaModel> ninjas;


}
