package it.unimol.val_backend.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unimol.val_backend.Weapon;
import it.unimol.val_backend.service.WeaponService;

import java.util.List;

@RestController
@RequestMapping("/api/weapon")

public class WeaponController {
    private WeaponService weaponService;

    @Autowired
    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Weapon>> getAllWEaponssHandler() {
        this.weaponService.insertWeapons();

        return ResponseEntity.ok(this.weaponService.getAllWeapons());
    }
}
