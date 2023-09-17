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
import trilce.profesores.service.GradoEscolarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trilce.profesores.model.GradoEscolar;

/**
 *
 * @author jolo
 */

@RestController
@RequestMapping("/gradoEscolar")
public class GradoEscolarRest {
    
    @Autowired
    private GradoEscolarService gradoEscolarService;
    
    @GetMapping
    private ResponseEntity<List<GradoEscolar>> getAllGradoEscolar(){
        return ResponseEntity.ok(gradoEscolarService.findAll());
    }
    
    @GetMapping("/{id}")
    private ResponseEntity<GradoEscolar> getGradoEscolarById (@PathVariable long id){
        Optional<GradoEscolar> ge = gradoEscolarService.findById(id);
        if(ge.isPresent())
            return ResponseEntity.ok(ge.get());
        else
            return ResponseEntity.notFound().build();
    }
    
    @PostMapping(consumes = "application/json")
    public ResponseEntity<GradoEscolar> saveGradoEscolar(@RequestBody GradoEscolar ge) {
        try {
            GradoEscolar gradoEscolarGuardado = gradoEscolarService.save(ge);
            return ResponseEntity.status(HttpStatus.CREATED).body(gradoEscolarGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    
    @PutMapping("/{id}")
    public ResponseEntity<GradoEscolar> updateGradoEscolar(@PathVariable long id, @RequestBody GradoEscolar ge) {
        Optional<GradoEscolar> ge_existente = gradoEscolarService.findById(id);
        if (ge_existente.isPresent()) {
            GradoEscolar ge_actualizado = ge_existente.get();
            ge_actualizado.setGrado(ge.getGrado());
            ge_actualizado.setTipo_grado(ge.getTipo_grado());
            
            GradoEscolar ge_guardado = gradoEscolarService.save(ge_actualizado);
            return ResponseEntity.ok(ge_guardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<GradoEscolar> partialUpdateGradoEscolar(@PathVariable long id, @RequestBody Map<String, Object> updates) {
        Optional<GradoEscolar> ge_existente = gradoEscolarService.findById(id);
        if (ge_existente.isPresent()) {
            GradoEscolar ge_actualizado = ge_existente.get();

            if (updates.containsKey("grado")) {
                ge_actualizado.setGrado((String) updates.get("grado"));
            }
            if (updates.containsKey("tipo_grado")) {
                ge_actualizado.setTipo_grado((String) updates.get("tipo_grado"));
            }

            GradoEscolar ge_guardado = gradoEscolarService.save(ge_actualizado);
            return ResponseEntity.ok(ge_guardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGradoEscolarById(@PathVariable long id) {
        Optional<GradoEscolar> ge = gradoEscolarService.findById(id);
        if (ge.isPresent()) {
            gradoEscolarService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
