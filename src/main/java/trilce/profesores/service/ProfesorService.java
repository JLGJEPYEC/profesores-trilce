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
import trilce.profesores.model.Profesores;
import trilce.profesores.repository.ProfesoresRepository;

/**
 *
 * @author jolo
 */

@Service
public class ProfesorService implements ProfesoresRepository {
    @Autowired
    private ProfesoresRepository profesoresRepository;

    @Override
    public void flush() {
    }

    @Override
    public <S extends Profesores> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Profesores> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Profesores> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Profesores getOne(Long id) {
        return null;
    }

    @Override
    public Profesores getById(Long id) {
        return null;
    }

    @Override
    public Profesores getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends Profesores> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Profesores> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Profesores> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Profesores> findAll() {
        return profesoresRepository.findAll();
    }

    @Override
    public List<Profesores> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Profesores> S save(S entity) {
        return profesoresRepository.save(entity);
    }

    @Override
    public Optional<Profesores> findById(Long id) {
        return profesoresRepository.findById(id);
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
        profesoresRepository.deleteById(id);
    }

    @Override
    public void delete(Profesores entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }

    @Override
    public void deleteAll(Iterable<? extends Profesores> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<Profesores> findAll(Sort sort) {
        return profesoresRepository.findAll(sort);
    }

    @Override
    public Page<Profesores> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Profesores> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Profesores> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Profesores> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Profesores> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Profesores, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    
}
