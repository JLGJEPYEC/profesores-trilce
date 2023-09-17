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
import trilce.profesores.service.SedeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trilce.profesores.model.Sedes;

/**
 *
 * @author jolo
 */
@RestController
@RequestMapping("/sedes")
public class SedesRest {
    @Autowired
    private SedeService sedeService;
    
    @GetMapping
    private ResponseEntity<List<Sedes>> getAllSedes(){
        return ResponseEntity.ok(sedeService.findAll());
    }
    
    @GetMapping("/{id}")
    private ResponseEntity<Sedes> getSedeById (@PathVariable long id){
        Optional<Sedes> sede = sedeService.findById(id);
        if(sede.isPresent())
            return ResponseEntity.ok(sede.get());
        else
            return ResponseEntity.notFound().build();
    }
    
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Sedes> saveSedes(@RequestBody Sedes sedes) {
        try {
            Sedes sedesGuardado = sedeService.save(sedes);
            return ResponseEntity.status(HttpStatus.CREATED).body(sedesGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    
    @PutMapping ("/{id}")
    public ResponseEntity<Sedes> updateSede(@PathVariable long id, @RequestBody Sedes sede) {
        Optional<Sedes> sedeExistente = sedeService.findById(id);
        if (sedeExistente.isPresent()) {
            Sedes sedeActualizado = sedeExistente.get();
            sedeActualizado.setNombresede(sede.getNombresede());
            sedeActualizado.setDistrito(sede.getDistrito());
            sedeActualizado.setDireccion(sede.getDireccion());
            
            
            Sedes sedeGuardado = sedeService.save(sedeActualizado);
            return ResponseEntity.ok(sedeGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Sedes> partialUpdateSede(@PathVariable long id, @RequestBody Map<String, Object> updates) {
        Optional<Sedes> sedeExistente = sedeService.findById(id);
        
        if (sedeExistente.isPresent()) {
            Sedes sedeActualizado = sedeExistente.get();

            if (updates.containsKey("nombresede")) {
                sedeActualizado.setNombresede((String) updates.get("nombresede"));
            }
            if (updates.containsKey("distrito")) {
                sedeActualizado.setDistrito((String) updates.get("distrito"));
            }
            if (updates.containsKey("direccion")) {
                sedeActualizado.setDireccion((String) updates.get("direccion"));
            }

            Sedes sedeGuardado = sedeService.save(sedeActualizado);

            return ResponseEntity.ok(sedeGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSedeById(@PathVariable long id) {
        Optional<Sedes> sede = sedeService.findById(id);
        if (sede.isPresent()) {
            sedeService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
