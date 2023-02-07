package it.unimol.val_backend.service;



import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unimol.val_backend.Agent;
import it.unimol.val_backend.ModelInput;
import it.unimol.val_backend.repository.AgentRepository;

@Service

public class AgentService {
    private AgentRepository agentRepository;

    @Autowired
    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public List<Agent> getAllAgents() {
        return this.agentRepository.findAll();
    }

    public void insertAgents() {
        List<ModelInput> agents = new ArrayList<>();

        agents.add(ModelInput.builder().id(1).name("Sova").imgUrl("https://media.valorant-api.com/agents/320b2a48-4d9b-a075-30f1-1f93a9b638fa/fullportrait.png").build());
        agents.add(ModelInput.builder().id(2).name("Fade").imgUrl("https://media.valorant-api.com/agents/dade69b4-4f5a-8528-247b-219e5a1facd6/fullportrait.png").build());
        agents.add(ModelInput.builder().id(3).name("Reyna").imgUrl("https://media.valorant-api.com/agents/a3bfb853-43b2-7238-a4f1-ad90e9e46bcc/fullportrait.png").build());


        for (ModelInput a : agents) {
            Agent agent = Agent
                    .builder()
                    .id(a.getId())
                    .name(a.getName())
                    .imgUrl(a.getImgUrl())
                    .build();

            this.agentRepository.save(agent);
        }
    }
}
