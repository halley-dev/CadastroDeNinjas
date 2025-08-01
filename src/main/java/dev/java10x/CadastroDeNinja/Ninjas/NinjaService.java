package dev.java10x.CadastroDeNinja.Ninjas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //Lista todos os ninjas por ID   obs: optional quer dizer que pode ou nao existi oninja id
    public NinjaModel listaNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);

    }

}
