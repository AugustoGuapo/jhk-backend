package com.ogam.jhk_backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerControlador {

    @GetMapping("/hola-mundo")
    public ResponseEntity<Mensaje> holaMundo() {
        return ResponseEntity.ok(new Mensaje("guillermo", "gay", 7));
    }
}
