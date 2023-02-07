package it.unimol.val_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unimol.val_backend.ModelInput;
import it.unimol.val_backend.Weapon;
import it.unimol.val_backend.repository.WeaponRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WeaponService {

    private WeaponRepository weaponRepository;

    @Autowired
    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }


    public List<Weapon> getAllWeapons() {
        return this.weaponRepository.findAll();
    }

    public void insertWeapons() {
        List<ModelInput> weapons = new ArrayList<>();

        weapons.add(ModelInput.builder().id(1).name("Operator").imgUrl("https://images.contentstack.io/v3/assets/bltb6530b271fddd0b1/blt3e6bf41bd01ca11e/5eb281ca24400043b65016ba/operator.png").build());
        weapons.add(ModelInput.builder().id(2).name("Vandal").imgUrl("https://images.contentstack.io/v3/assets/bltb6530b271fddd0b1/blt323df4a0d8210605/5eb281cb3b09c042ddca13a5/vandal.png").build());
        weapons.add(ModelInput.builder().id(3).name("Phantom").imgUrl("https://images.contentstack.io/v3/assets/bltb6530b271fddd0b1/blt04ac3b5158b8466a/5eb281caa44a154c3ef84a82/phantom.png").build());


        for (ModelInput w : weapons) {
            Weapon weapon = Weapon
                    .builder()
                    .id(w.getId())
                    .name(w.getName())
                    .imgUrl(w.getImgUrl())
                    .build();

            this.weaponRepository.save(weapon);
        }
    }
}
