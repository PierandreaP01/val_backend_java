package it.unimol.val_backend.controllers;



import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unimol.val_backend.Weapon;
import it.unimol.val_backend.service.WeaponService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class WeaponController {
    private final WeaponService weaponService;

    @GetMapping
    public ResponseEntity<List<Weapon>> getAllWEaponssHandler() {
        this.weaponService.insertWeapons();

        return ResponseEntity.ok(this.weaponService.getAllWeapons());
    }
}