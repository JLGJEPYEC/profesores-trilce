/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import trilce.profesores.model.Cursos;
import trilce.profesores.repository.CursosRepository;

/**
 *
 * @author jolo
 */

@Service
public class CursosService implements CursosRepository {
    
    
    @Autowired
    private CursosRepository cursosRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Cursos> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Cursos> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Cursos> entities) {
 
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Cursos getOne(Long id) {
        return null;
    }

    @Override
    public Cursos getById(Long id) {
        return null;
    }

    @Override
    public Cursos getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends Cursos> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cursos> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Cursos> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Cursos> findAll() {
        return cursosRepository.findAll();
    }

    @Override
    public List<Cursos> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Cursos> S save(S entity) {
        return cursosRepository.save(entity);
    }

    @Override
    public Optional<Cursos> findById(Long id) {
        return cursosRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
         return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        cursosRepository.deleteById(id);
    }

    @Override
    public void delete(Cursos entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
         
    }

    @Override
    public void deleteAll(Iterable<? extends Cursos> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<Cursos> findAll(Sort sort) {
        return cursosRepository.findAll(sort);
    }

    @Override
    public Page<Cursos> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cursos> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cursos> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cursos> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Cursos> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Cursos, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    
}
