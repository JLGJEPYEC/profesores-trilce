/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.rest;

import java.net.URI;
import java.util.List;
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
import trilce.profesores.service.CursosService;

/**
 *
 * @author jolo
 */
@RestController
@RequestMapping("/cursos")
public class CursosRest {

    @Autowired
    private CursosService cursosService;

    @GetMapping
    private ResponseEntity<List<Cursos>> getAllCursos() {
        return ResponseEntity.ok(cursosService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Cursos> getCursosById(@PathVariable long id) {
        Optional<Cursos> curso = cursosService.findById(id);
        if (curso.isPresent()) {
            return ResponseEntity.ok(curso.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(consumes = "application/json")
    private ResponseEntity<Cursos> saveCurso(@RequestBody Cursos curso) {
        try {
            Cursos cursoGuardado = cursosService.save(curso);
            return ResponseEntity.status(HttpStatus.CREATED).body(cursoGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @PutMapping("/{id}")
    private ResponseEntity<Cursos> updateCurso(@PathVariable long id, @RequestBody Cursos cursoData) {
        Optional<Cursos> cursoActualizar = cursosService.findById(id);
        if (cursoActualizar.isPresent()) {
            Cursos curso = cursoActualizar.get();
            curso.setNombre_curso(cursoData.getNombre_curso());
            Cursos cursoActualizado = cursosService.save(curso);
            return ResponseEntity.ok(cursoActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/{id}")
    private ResponseEntity<Cursos> partialUpdateCurso(@PathVariable long id, @RequestBody Cursos cursoData) {
        Optional<Cursos> cursoPartialUpdate = cursosService.findById(id);
        if (cursoPartialUpdate.isPresent()) {
            Cursos curso = cursoPartialUpdate.get();

            if (cursoData.getNombre_curso() != null) {
                curso.setNombre_curso(cursoData.getNombre_curso());
            }

            Cursos cursoActualizado = cursosService.save(curso);
            return ResponseEntity.ok(cursoActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCursoById(@PathVariable long id) {
        Optional<Cursos> curso = cursosService.findById(id);
        if (curso.isPresent()) {
            cursosService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
