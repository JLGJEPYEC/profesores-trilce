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
import trilce.profesores.model.Silabo;
import trilce.profesores.repository.SilaboRepository;

/**
 *
 * @author jolo
 */

@Service
public class SilaboService implements SilaboRepository {
    @Autowired
    private SilaboRepository silaboRepository;

    @Override
    public void flush() {
    }

    @Override
    public <S extends Silabo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Silabo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Silabo> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Silabo getOne(Long id) {
        return null;
    }

    @Override
    public Silabo getById(Long id) {
        return null;
    }

    @Override
    public Silabo getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends Silabo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Silabo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Silabo> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Silabo> findAll() {
        return silaboRepository.findAll();
    }

    @Override
    public List<Silabo> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Silabo> S save(S entity) {
        return silaboRepository.save(entity);
    }

    @Override
    public Optional<Silabo> findById(Long id) {
        return silaboRepository.findById(id);
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
        silaboRepository.deleteById(id);
    }

    @Override
    public void delete(Silabo entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }

    @Override
    public void deleteAll(Iterable<? extends Silabo> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<Silabo> findAll(Sort sort) {
        return silaboRepository.findAll(sort);
    }

    @Override
    public Page<Silabo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Silabo> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Silabo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Silabo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Silabo> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Silabo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

}
