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
import trilce.profesores.service.HorarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trilce.profesores.model.Horarios;
import trilce.profesores.model.Profesores;
import trilce.profesores.model.Sedes;
import trilce.profesores.model.Silabo;

/**
 *
 * @author jolo
 */
@RestController
@RequestMapping("/horarios")
public class HorariosRest {

    @Autowired
    private HorarioService horarioService;

    @GetMapping
    private ResponseEntity<List<Horarios>> getAllHorarios() {
        return ResponseEntity.ok(horarioService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Horarios> getHorarioById(@PathVariable long id) {
        Optional<Horarios> horario = horarioService.findById(id);
        if (horario.isPresent()) {
            return ResponseEntity.ok(horario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Horarios> saveGradoEscolar(@RequestBody Horarios horario) {
        try {
            Horarios horariosGuardado = horarioService.save(horario);
            return ResponseEntity.status(HttpStatus.CREATED).body(horariosGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<Horarios> updateHorario(@PathVariable long id, @RequestBody Horarios horario) {
        Optional<Horarios> horarioExistente = horarioService.findById(id);
        if (horarioExistente.isPresent()) {
            Horarios horarioActualizado = horarioExistente.get();
            horarioActualizado.setProfesor(horario.getProfesor());
            horarioActualizado.setSede(horario.getSede());
            horarioActualizado.setSilabo(horario.getSilabo());
            horarioActualizado.setSeccion(horario.getSeccion());
            horarioActualizado.setH_i_hora(horario.getH_i_hora());
            horarioActualizado.setH_i_min(horario.getH_i_min());
            horarioActualizado.setH_f_hora(horario.getH_f_hora());
            horarioActualizado.setH_f_min(horario.getH_f_min());
            
            Horarios horarioGuardado = horarioService.save(horarioActualizado);
            return ResponseEntity.ok(horarioGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Horarios> partialUpdateHorario(@PathVariable long id, @RequestBody Map<String, Object> updates) {
        Optional<Horarios> horarioExistente = horarioService.findById(id);
        if (horarioExistente.isPresent()) {
            Horarios horarioActualizado = horarioExistente.get();

            if (updates.containsKey("profesor")) {
                horarioActualizado.setProfesor((Profesores) updates.get("profesor"));
            }
            if (updates.containsKey("sede")) {
                horarioActualizado.setSede((Sedes) updates.get("sede"));
            }
            if (updates.containsKey("silabo")) {
                horarioActualizado.setSilabo((Silabo) updates.get("silabo"));
            }
            if (updates.containsKey("seccion")) {
                horarioActualizado.setSeccion((String) updates.get("seccion"));
            }
            if (updates.containsKey("h_i_hora")) {
                horarioActualizado.setH_i_hora((Long) updates.get("h_i_hora"));
            }
            if (updates.containsKey("h_i_min")) {
                horarioActualizado.setH_i_min((Long) updates.get("h_i_min"));
            }
            if (updates.containsKey("h_f_hora")) {
                horarioActualizado.setH_f_hora((Long) updates.get("h_f_hora"));
            }
            if (updates.containsKey("h_f_min")) {
                horarioActualizado.setH_f_min((Long) updates.get("h_f_min"));
            }

            Horarios horarioGuardado = horarioService.save(horarioActualizado);
            return ResponseEntity.ok(horarioGuardado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHorarioById(@PathVariable long id) {
        Optional<Horarios> horario = horarioService.findById(id);
        if (horario.isPresent()) {
            horarioService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
