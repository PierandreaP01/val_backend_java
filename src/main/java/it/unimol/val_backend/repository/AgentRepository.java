package it.unimol.val_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.unimol.val_backend.Agent;

/**
 * AgentRepository
 */
public interface AgentRepository extends JpaRepository<Agent, Integer>{

    
}