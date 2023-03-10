package it.unimol.val_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.unimol.val_backend.Agent;


@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {

}
