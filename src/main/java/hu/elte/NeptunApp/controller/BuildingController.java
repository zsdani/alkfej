package hu.elte.NeptunApp.controller;

import hu.elte.NeptunApp.entities.Building;
import java.lang.Integer;

import hu.elte.NeptunApp.entities.Subject;
import hu.elte.NeptunApp.entities.User;
import hu.elte.NeptunApp.repository.BuildingRepository;

import hu.elte.NeptunApp.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private SubjectRepository subjectRepository;

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

    @PostMapping("/{id}/subjects")
    public ResponseEntity<Building> addSubject(@PathVariable Integer id, @RequestBody Subject subject) {
        Optional<Building> byId = buildingRepository.findById(id);
        if (byId.isPresent()) {
            Building building = byId.get();
            Subject newSubject = subjectRepository.save(subject);
            building.getSubjectList().add(newSubject);
            buildingRepository.save(building);
            newSubject.setBuilding(building);
            subjectRepository.save(newSubject);
            return ResponseEntity.ok(building);
        } else {
            return ResponseEntity.notFound().build();
        }
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
            int i = 0;
            for(Subject s: oBuilding.get().getSubjectList()) {
                for(User u : s.getUsers()) {
                    u.setSum_credit(u.getSum_credit() - s.getCredit());
                    u.removeSubject(s);
                }
            }
            buildingRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
