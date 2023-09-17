/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.rest;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trilce.profesores.model.DesarrolloClase;
import trilce.profesores.model.TemasClases;
import trilce.profesores.service.DesarrolloClaseService;

/**
 *
 * @author jolo
 */

@RestController
@RequestMapping("/desarrolloClase")
public class DesarrolloClaseRest {

    @Autowired
    private DesarrolloClaseService desarrolloClaseService;

    @GetMapping
    private ResponseEntity<List<DesarrolloClase>> getAllDesarrolloClase() {
        return ResponseEntity.ok(desarrolloClaseService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<DesarrolloClase> getDesarrolloClaseById(@PathVariable long id) {
        Optional<DesarrolloClase> dc = desarrolloClaseService.findById(id);
        if (dc.isPresent()) {
            return ResponseEntity.ok(dc.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<DesarrolloClase> saveDesarrolloClase(@RequestBody DesarrolloClase dc) {
        try {
            DesarrolloClase desarrolloClaseGuardado = desarrolloClaseService.save(dc);
            return ResponseEntity.status(HttpStatus.CREATED).body(desarrolloClaseGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<DesarrolloClase> updateDesarrolloClase(@PathVariable long id, @RequestBody DesarrolloClase dc) {
        Optional<DesarrolloClase> dc_existente = desarrolloClaseService.findById(id);
        if (dc_existente.isPresent()) {
            DesarrolloClase dc_actualizado = dc_existente.get();
            dc_actualizado.setTemas_clase(dc.getTemas_clase());
            dc_actualizado.setMaterial_clase(dc.getMaterial_clase());
            DesarrolloClase dc_guardado = desarrolloClaseService.save(dc_actualizado);
            return ResponseEntity.ok(dc_guardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<DesarrolloClase> partialUpdateDesarrolloClase(@PathVariable long id, @RequestBody Map<String, Object> updates) {
        Optional<DesarrolloClase> dc_existente = desarrolloClaseService.findById(id);
        if (dc_existente.isPresent()) {
            DesarrolloClase dc_actualizado = dc_existente.get();

            if (updates.containsKey("temas_clase")) {
                dc_actualizado.setTemas_clase((TemasClases) updates.get("temas_clase"));
            }
            if (updates.containsKey("material_clase")) {
                dc_actualizado.setMaterial_clase((String) updates.get("material_clase"));
            }

            DesarrolloClase dc_guardado = desarrolloClaseService.save(dc_actualizado);
            return ResponseEntity.ok(dc_guardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDesarrolloClaseById(@PathVariable long id) {
        Optional<DesarrolloClase> dc = desarrolloClaseService.findById(id);
        if (dc.isPresent()) {
            desarrolloClaseService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
