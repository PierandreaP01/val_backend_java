package it.unimol.val_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.unimol.val_backend.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Integer> {

}
