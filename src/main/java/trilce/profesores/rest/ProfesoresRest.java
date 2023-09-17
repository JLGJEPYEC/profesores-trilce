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
import trilce.profesores.service.ProfesorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trilce.profesores.model.Profesores;

/**
 *
 * @author jolo
 */
@RestController
@RequestMapping("/profesores")
public class ProfesoresRest {
    @Autowired
    private ProfesorService profesorService;
    
    @GetMapping
    private ResponseEntity<List<Profesores>> getAllProfesores(){
        return ResponseEntity.ok(profesorService.findAll());
    }
    
    @GetMapping("/{id}")
    private ResponseEntity<Profesores> getProfesorById (@PathVariable long id){
        Optional<Profesores> profesor = profesorService.findById(id);
        if(profesor.isPresent())
            return ResponseEntity.ok(profesor.get());
        else
            return ResponseEntity.notFound().build();
    }
    
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Profesores> saveProfesores(@RequestBody Profesores profesores) {
        try {
            Profesores profesoresGuardado = profesorService.save(profesores);
            return ResponseEntity.status(HttpStatus.CREATED).body(profesoresGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    
    
    @PutMapping("/{id}")
    public ResponseEntity<Profesores> updateProfesores(@PathVariable long id, @RequestBody Profesores profesor) {
        Optional<Profesores> profesorExistente = profesorService.findById(id);
        if (profesorExistente.isPresent()) {
            Profesores profesorActualizado = profesorExistente.get();
            profesorActualizado.setNombres(profesor.getNombres());
            profesorActualizado.setApp(profesor.getApp());
            profesorActualizado.setApm(profesor.getApm());
            profesorActualizado.setEmail(profesor.getEmail());
            profesorActualizado.setPass(profesor.getPass());
            profesorActualizado.setEsuperior(profesor.getEsuperior());
            profesorActualizado.setTipoesuperior(profesor.getTipoesuperior());
            profesorActualizado.setIeducativa(profesor.getIeducativa());
            
            Profesores profesorGuardado = profesorService.save(profesorActualizado);
            return ResponseEntity.ok(profesorGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Profesores> partialUpdateHorario(@PathVariable long id, @RequestBody Map<String, Object> updates) {
        Optional<Profesores> profesorExistente = profesorService.findById(id);
        if (profesorExistente.isPresent()) {
            Profesores profesorActualizado = profesorExistente.get();

            if (updates.containsKey("nombres")) {
                profesorActualizado.setNombres((String) updates.get("nombres"));
            }
            if (updates.containsKey("app")) {
                profesorActualizado.setApp((String) updates.get("app"));
            }
            if (updates.containsKey("apm")) {
                profesorActualizado.setApm((String) updates.get("apm"));
            }
            if (updates.containsKey("email")) {
                profesorActualizado.setEmail((String) updates.get("email"));
            }
            if (updates.containsKey("pass")) {
                profesorActualizado.setPass((String) updates.get("pass"));
            }
            if (updates.containsKey("esuperior")) {
                profesorActualizado.setEsuperior((String) updates.get("esuperior"));
            }
            if (updates.containsKey("tipoesuperior")) {
                profesorActualizado.setTipoesuperior((String) updates.get("tipoesuperior"));
            }
            if (updates.containsKey("ieducativa")) {
                profesorActualizado.setIeducativa((String) updates.get("ieducativa"));
            }

            Profesores profesorGuardado = profesorService.save(profesorActualizado);
            return ResponseEntity.ok(profesorGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfesorById(@PathVariable long id) {
        Optional<Profesores> profesor = profesorService.findById(id);
        if (profesor.isPresent()) {
            profesorService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
