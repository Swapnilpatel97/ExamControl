package com.microservices.examenservice.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.microservices.commonexam.models.entity.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long>, JpaRepository<Subject, Long> {
}
