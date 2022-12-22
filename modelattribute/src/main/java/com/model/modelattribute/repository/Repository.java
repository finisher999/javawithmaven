package com.model.modelattribute.repository;

import com.model.modelattribute.entities.model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<model,Integer> {

    List<model> findAll();

    //List<model> findByidIsNotNull();


}
