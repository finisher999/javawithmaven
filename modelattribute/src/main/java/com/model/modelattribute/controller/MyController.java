package com.model.modelattribute.controller;

import com.model.modelattribute.entities.model;
import com.model.modelattribute.repository.Repository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    Repository repository;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getdata")
    //@Valid
   // @NotEmpty
    List<model> getModels(){

        return repository.findAll();
    }

//    @GetMapping("/getdata/notnull")
//    List<model> findBydeleted_atIsNotNull(){
//        //List<model> findBydeleted_atIsNotNull = Repository.findBydeleted_atIsNotNull();
//        return repository.findBydeleted_atIsNotNull;
//    }

}
