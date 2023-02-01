package it.unimol.val_backend.controllers;



import it.unimol.val_backend.Map;
import it.unimol.val_backend.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class MapController {
    private final MapService mapService;

    @GetMapping
    public ResponseEntity<List<Map>> getAllMapsHandler() {
        this.mapService.insertMaps();

        return ResponseEntity.ok(this.mapService.getAllMaps());
    }
}
