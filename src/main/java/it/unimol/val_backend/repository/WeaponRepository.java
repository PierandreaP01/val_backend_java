package it.unimol.val_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.unimol.val_backend.Weapon;

public interface WeaponRepository extends JpaRepository<Weapon, Integer>{
    
}
