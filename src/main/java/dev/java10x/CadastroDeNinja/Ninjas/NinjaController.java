package dev.java10x.CadastroDeNinja.Ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
    public class NinjaController {

    //Injeta a dependencia do service e inicia um construtor
    private  NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVinda")
    public String boasVindas() {
        return "Essa e minha mensagem nessa  aplicação";
    }


    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "ninja criado";
    }

    //Mostra Ninja (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listaNinjas() {
        return ninjaService.ListarNinjas(); // returno vem la do classe service
    }
    //localhost:8080/ninjas/listar
    //Mostra Ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listaNinjasPorId(@PathVariable Long id) {
        return ninjaService.listaNinjasPorId(id);
    }

    //Altera ninja (UPADATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Altera Ninja por Id";
    }

    // Deleta ninja

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID() {
        return "Ninja deletado por Id";
    }







}
