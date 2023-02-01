package it.unimol.val_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.unimol.val_backend.Map;
import it.unimol.val_backend.ModelInput;
import it.unimol.val_backend.repository.MapRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MapService {

    private final MapRepository mapRepository;

    public List<Map> getAllMaps(){
        return this.mapRepository.findAll();
    }

    public void insertMaps(){
        List<ModelInput> maps = new ArrayList<>();

        maps.add(ModelInput.builder().id(1).name("Split").imgUrl("https://media.valorant-api.com/maps/d960549e-485c-e861-8d71-aa9d1aed12a2/splash.png").build());
        maps.add(ModelInput.builder().id(2).name("Pearl").imgUrl("https://media.valorant-api.com/maps/fd267378-4d1d-484f-ff52-77821ed10dc2/splash.png").build());
        maps.add(ModelInput.builder().id(3).name("Bind").imgUrl("https://media.valorant-api.com/maps/2c9d57ec-4431-9c5e-2939-8f9ef6dd5cba/splash.png").build());


        for (ModelInput m : maps) {
            Map map = Map
                    .builder()
                    .id(m.getId())
                    .name(m.getName())
                    .imgUrl(m.getImgUrl())
                    .build();

            this.mapRepository.save(map);
        }
        
    }
    
}
