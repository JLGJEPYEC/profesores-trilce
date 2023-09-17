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
import trilce.profesores.model.Horarios;
import trilce.profesores.repository.HorariosRepository;

/**
 *
 * @author jolo
 */

@Service
public class HorarioService implements HorariosRepository {
    
    @Autowired
    private HorariosRepository horariosRepository;

    @Override
    public void flush() {
    }

    @Override
    public <S extends Horarios> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Horarios> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Horarios> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Horarios getOne(Long id) {
        return null;
    }

    @Override
    public Horarios getById(Long id) {
        return null;
    }

    @Override
    public Horarios getReferenceById(Long id) {
        return null;
    }

    @Override
    public <S extends Horarios> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Horarios> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Horarios> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<Horarios> findAll() {
        return horariosRepository.findAll();
    }

    @Override
    public List<Horarios> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public <S extends Horarios> S save(S entity) {
        return horariosRepository.save(entity);
    }

    @Override
    public Optional<Horarios> findById(Long id) {
        return horariosRepository.findById(id);
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
        horariosRepository.deleteById(id);
    }

    @Override
    public void delete(Horarios entity) {
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
    }

    @Override
    public void deleteAll(Iterable<? extends Horarios> entities) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public List<Horarios> findAll(Sort sort) {
        return horariosRepository.findAll(sort);
    }

    @Override
    public Page<Horarios> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Horarios> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Horarios> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Horarios> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Horarios> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Horarios, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    
}
