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
import trilce.profesores.model.TemasClases;
import trilce.profesores.repository.TemasClasesRepository;

/**
 *
 * @author jolo
 */

@Service
public class TemaClaseService implements TemasClasesRepository {
    
    @Autowired
    private TemasClasesRepository temasClasesRepository;

    @Override
    public void flush() {
    }

    @Override
    public <S extends TemasClases> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TemasClases> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TemasClases> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public TemasClases getOne(Long id) {
        return null;
    }

    @Override
    public TemasClases getById(Long id) {
        return null;
    }

    @Override
    public TemasClases getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends TemasClases> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TemasClases> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TemasClases> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<TemasClases> findAll() {
        return temasClasesRepository.findAll();
    }

    @Override
    public List<TemasClases> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends TemasClases> S save(S entity) {
        return temasClasesRepository.save(entity);
    }

    @Override
    public Optional<TemasClases> findById(Long id) {
        return temasClasesRepository.findById(id);
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
        temasClasesRepository.deleteById(id);
    }

    @Override
    public void delete(TemasClases entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }

    @Override
    public void deleteAll(Iterable<? extends TemasClases> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<TemasClases> findAll(Sort sort) {
        return temasClasesRepository.findAll(sort);
    }

    @Override
    public Page<TemasClases> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TemasClases> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TemasClases> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TemasClases> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TemasClases> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TemasClases, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

}
