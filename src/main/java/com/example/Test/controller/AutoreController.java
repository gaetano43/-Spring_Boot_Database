package com.example.Test.controller;

import com.example.Test.repository.AutoreRepository;
import com.example.Test.model.Autore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController("/Autore")
public class AutoreController {
    @Autowired
    private AutoreRepository autoreRepository;
@GetMapping
    public Autore show() {
    Optional<Autore> op = autoreRepository.findById(1);
    if (op.isEmpty()){
        throw new ResponseStatusException(HttpStatusCode.valueOf(404));
    }
    return op.get();
    }

}
