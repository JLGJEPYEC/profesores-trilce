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
import trilce.profesores.model.DesarrolloClase;
import trilce.profesores.repository.DesarrolloClaseRepository;

/**
 *
 * @author jolo
 */

@Service
public class DesarrolloClaseService implements DesarrolloClaseRepository {
    
    @Autowired
    private DesarrolloClaseRepository desarrolloClaseRepository;

    @Override
    public void flush() {
    }

    @Override
    public <S extends DesarrolloClase> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<DesarrolloClase> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public DesarrolloClase getOne(Long id) {
        return null;
    }

    @Override
    public DesarrolloClase getById(Long id) {
        return null;
    }

    @Override
    public DesarrolloClase getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<DesarrolloClase> findAll() {
        return desarrolloClaseRepository.findAll();
    }

    @Override
    public List<DesarrolloClase> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> S save(S entity) {
        return desarrolloClaseRepository.save(entity);
    }

    @Override
    public Optional<DesarrolloClase> findById(Long id) {
        return desarrolloClaseRepository.findById(id);
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
        desarrolloClaseRepository.deleteById(id);
    }

    @Override
    public void delete(DesarrolloClase entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }

    @Override
    public void deleteAll(Iterable<? extends DesarrolloClase> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<DesarrolloClase> findAll(Sort sort) {
        return desarrolloClaseRepository.findAll(sort);
    }

    @Override
    public Page<DesarrolloClase> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends DesarrolloClase> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends DesarrolloClase> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends DesarrolloClase, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    
}