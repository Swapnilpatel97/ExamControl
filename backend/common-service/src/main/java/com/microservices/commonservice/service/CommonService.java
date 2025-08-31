package com.microservices.commonservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommonService<E> {

    Iterable<E> findAll();

    Page<E> findAllPage(Pageable pageable);

    E findById(Long id);

    E save(E entity);

    E update(E entity);

    void deleteById(Long id);
}
