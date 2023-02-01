package it.unimol.val_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.unimol.val_backend.Agent;
import it.unimol.val_backend.ModelInput;
import it.unimol.val_backend.repository.AgentRepository;

@Service
public class AgentService {
    private AgentRepository AgentRepository;

    public List<Agent> getAllAgents(){
        return this.AgentRepository.findAll();
    }

    public void insertAgents(){
        List<ModelInput> agents = new ArrayList<>();
    }
}
