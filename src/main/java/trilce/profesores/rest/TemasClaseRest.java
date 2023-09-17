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
import trilce.profesores.model.Silabo;
import trilce.profesores.model.TemasClases;
import trilce.profesores.service.TemaClaseService;

/**
 *
 * @author jolo
 */
@RestController
@RequestMapping("/temasClases")
public class TemasClaseRest {

    @Autowired
    private TemaClaseService temaClaseService;

    @GetMapping
    private ResponseEntity<List<TemasClases>> getAllTemasClase() {
        return ResponseEntity.ok(temaClaseService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<TemasClases> getTemasClasesById(@PathVariable long id) {
        Optional<TemasClases> tc = temaClaseService.findById(id);
        if (tc.isPresent()) {
            return ResponseEntity.ok(tc.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<TemasClases> saveTemasClases(@RequestBody TemasClases temasClases) {
        try {
            TemasClases temasClasesGuardado = temaClaseService.save(temasClases);
            return ResponseEntity.status(HttpStatus.CREATED).body(temasClasesGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    
    
    @PutMapping("/{id}")
    public ResponseEntity<TemasClases> updateTemasClases(@PathVariable long id, @RequestBody TemasClases tc) {
        Optional<TemasClases> tc_Existente = temaClaseService.findById(id);
        if (tc_Existente.isPresent()) {
            TemasClases tc_Actualizado = tc_Existente.get();
            tc_Actualizado.setSilabo(tc.getSilabo());
            tc_Actualizado.setNombre_tema(tc.getNombre_tema());
            tc_Actualizado.setDescripcion(tc.getDescripcion());
            TemasClases tc_Guardado = temaClaseService.save(tc_Actualizado);
            return ResponseEntity.ok(tc_Guardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<TemasClases> partialUpdateTemasClases(@PathVariable long id, @RequestBody Map<String, Object> updates) {
        Optional<TemasClases> tc_existente = temaClaseService.findById(id);
        if (tc_existente.isPresent()) {
            TemasClases tc_actiualizado = tc_existente.get();

            if (updates.containsKey("silabo")) {
                tc_actiualizado.setSilabo((Silabo) updates.get("silabo"));
            }
            if (updates.containsKey("nombre_tema")) {
                tc_actiualizado.setNombre_tema((String) updates.get("nombre_tema"));
            }
            if (updates.containsKey("descripcion")) {
                tc_actiualizado.setDescripcion((String) updates.get("descripcion"));
            }
            TemasClases tc_guardado = temaClaseService.save(tc_actiualizado);
            return ResponseEntity.ok(tc_guardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTemasClasesById(@PathVariable long id) {
        Optional<TemasClases> tc = temaClaseService.findById(id);
        if (tc.isPresent()) {
            temaClaseService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
