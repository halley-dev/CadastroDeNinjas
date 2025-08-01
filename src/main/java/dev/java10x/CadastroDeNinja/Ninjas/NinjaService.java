package dev.java10x.CadastroDeNinja.Ninjas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {



    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    //Lista todos os ninjas
    public List<NinjaModel> ListarNinjas() {
        return ninjaRepository.findAll();
    }

}
