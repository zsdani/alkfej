package hu.elte.NeptunApp.controller;

import hu.elte.NeptunApp.entities.Building;
import java.lang.Integer;

import hu.elte.NeptunApp.entities.Subject;
import hu.elte.NeptunApp.repository.BuildingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired
    private BuildingRepository buildingRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Building>> getAll() {
        return ResponseEntity.ok(buildingRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Building> get(@PathVariable Integer id) {
        Optional<Building> building = buildingRepository.findById(id);
        if (building.isPresent()) {
            return ResponseEntity.ok(building.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}/subjects")
    public ResponseEntity<Iterable<Subject>> getSubjectsById(@PathVariable Integer id) {
        Optional<Building> building = buildingRepository.findById(id);
        if (building.isPresent()) {
            return ResponseEntity.ok(building.get().getSubjectList());
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @PostMapping("")
    public ResponseEntity<Building> post(@RequestBody Building building) {
        Building savedBuilding = buildingRepository.save(building);
        return ResponseEntity.ok(savedBuilding);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Building> put(@RequestBody Building building, @PathVariable Integer id) {
        Optional<Building> oBuilding = buildingRepository.findById(id);
        if (oBuilding.isPresent()) {
            building.setId(id);
            return ResponseEntity.ok(buildingRepository.save(building));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Building> oBuilding = buildingRepository.findById(id);
        if (oBuilding.isPresent()) {
            buildingRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
