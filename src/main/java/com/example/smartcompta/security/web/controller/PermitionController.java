package com.example.smartcompta.security.web.controller;

import com.example.smartcompta.security.dto.PermitionDto;
import com.example.smartcompta.security.services.PermitionService;
import com.example.smartcompta.security.web.ApiRest.PermitionApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PermitionController implements PermitionApi {


    @Autowired
    private PermitionService permitionService;


    @Override
    public List<PermitionDto> findAll() {
        return permitionService.listPermition();
    }

    @Override
    public PermitionDto save(PermitionDto dto) {
        return permitionService.save( dto );
    }

    @Override
    public PermitionDto findById(Long id) {
        return permitionService.findById( id );
    }

    @Override
    public void modifier(Long id) {
permitionService.update( id );
    }

    @Override
    public void delete(Long id) {

    }
}

