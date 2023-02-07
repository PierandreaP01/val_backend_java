package it.unimol.val_backend.controllers;



import it.unimol.val_backend.Map;
import it.unimol.val_backend.service.MapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/maps")

public class MapController {
    private MapService mapService;

    @Autowired
    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Map>> getAllMapsHandler() {
        this.mapService.insertMaps();

        return ResponseEntity.ok(this.mapService.getAllMaps());
    }
}
