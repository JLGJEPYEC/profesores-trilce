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
import trilce.profesores.model.Cursos;
import trilce.profesores.model.GradoEscolar;
import trilce.profesores.model.Silabo;
import trilce.profesores.service.SilaboService;

/**
 *
 * @author jolo
 */
@RestController
@RequestMapping("/silabos")
public class SilaboRest {
    @Autowired
    private SilaboService silaboService;
    
    @GetMapping
    private ResponseEntity<List<Silabo>> getAllSilabos(){
        return ResponseEntity.ok(silaboService.findAll());
    }
    
    @GetMapping("/{id}")
    private ResponseEntity<Silabo> getSilaboById (@PathVariable long id){
        Optional<Silabo> silabo = silaboService.findById(id);
        if(silabo.isPresent())
            return ResponseEntity.ok(silabo.get());
        else
            return ResponseEntity.notFound().build();
    }
    
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Silabo> saveSilabo(@RequestBody Silabo silabo) {
        try {
            Silabo silaboGuardado = silaboService.save(silabo);
            return ResponseEntity.status(HttpStatus.CREATED).body(silaboGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    
    
    @PutMapping("/{id}")
    public ResponseEntity<Silabo> updateSilabo(@PathVariable long id, @RequestBody Silabo silabo) {
        Optional<Silabo> silaboExistente = silaboService.findById(id);
        if (silaboExistente.isPresent()) {
            Silabo silaboActualizado = silaboExistente.get();
            silaboActualizado.setCurso(silabo.getCurso());
            silaboActualizado.setGe(silabo.getGe());
            silaboActualizado.setYearmaking(silabo.getYearmaking());

            
            Silabo silaboGuardado = silaboService.save(silaboActualizado);
            return ResponseEntity.ok(silaboGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Silabo> partialUpdateSilabo(@PathVariable long id, @RequestBody Map<String, Object> updates) {
        Optional<Silabo> silaboExistente = silaboService.findById(id);
        if (silaboExistente.isPresent()) {
            Silabo silaboActualizado = silaboExistente.get();

            if (updates.containsKey("curso")) {
                silaboActualizado.setCurso((Cursos) updates.get("curso"));
            }
            if (updates.containsKey("ge")) {
                silaboActualizado.setGe((GradoEscolar) updates.get("ge"));
            }
            if (updates.containsKey("yearmaking")) {
                silaboActualizado.setYearmaking((Long) updates.get("yearmaking"));
            }

            Silabo silaboGuardado = silaboService.save(silaboActualizado);
            return ResponseEntity.ok(silaboGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSilaboById(@PathVariable long id) {
        Optional<Silabo> silabo = silaboService.findById(id);
        if (silabo.isPresent()) {
            silaboService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
