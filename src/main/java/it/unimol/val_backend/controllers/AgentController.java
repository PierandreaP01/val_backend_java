package it.unimol.val_backend.controllers;


import it.unimol.val_backend.Agent;
import it.unimol.val_backend.service.AgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class AgentController {
    private final AgentService agentService;

    @GetMapping
    public ResponseEntity<List<Agent>> getAllMapsHandler() {
        this.agentService.insertAgents();

        return ResponseEntity.ok(this.agentService.getAllAgents());
    }
}