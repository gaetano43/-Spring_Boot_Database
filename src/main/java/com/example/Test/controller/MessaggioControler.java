package com.example.Test.controller;

import com.example.Test.model.Messaggio;
import com.example.Test.repository.MessaggioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class MessaggioControler {

    private final MessaggioRepository messaggioRepository;

    public MessaggioControler(MessaggioRepository messaggioRepository) {
        this.messaggioRepository = messaggioRepository;
    }

    @GetMapping("/v3/ciao")
    public String leggiMessaggio() {
        Optional<Messaggio> messaggio = messaggioRepository.findById(1);
        if (messaggio.isPresent()) {
            return messaggio.get().getTesto();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Messaggio non trovato");
        }
    }
}
