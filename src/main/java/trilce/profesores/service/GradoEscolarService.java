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
import trilce.profesores.model.GradoEscolar;
import trilce.profesores.repository.GradoEscolarRepository;

/**
 *
 * @author jolo
 */

@Service
public class GradoEscolarService implements GradoEscolarRepository {
    
    @Autowired
    private GradoEscolarRepository gradoEscolarRepository;

    @Override
    public void flush() {
    }

    @Override
    public <S extends GradoEscolar> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<GradoEscolar> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public GradoEscolar getOne(Long id) {
        return null;
    }

    @Override
    public GradoEscolar getById(Long id) {
        return null;
    }

    @Override
    public GradoEscolar getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<GradoEscolar> findAll() {
        return gradoEscolarRepository.findAll();
    }

    @Override
    public List<GradoEscolar> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> S save(S entity) {
        return gradoEscolarRepository.save(entity);
    }

    @Override
    public Optional<GradoEscolar> findById(Long id) {
        return gradoEscolarRepository.findById(id);
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
    }

    @Override
    public void delete(GradoEscolar entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }

    @Override
    public void deleteAll(Iterable<? extends GradoEscolar> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<GradoEscolar> findAll(Sort sort) {
        return gradoEscolarRepository.findAll(sort);
    }

    @Override
    public Page<GradoEscolar> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends GradoEscolar> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends GradoEscolar> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends GradoEscolar, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    
    
}
