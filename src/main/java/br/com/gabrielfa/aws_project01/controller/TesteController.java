package br.com.gabrielfa.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotação para transformar uma classe em controller
@RequestMapping("/api/test") // Anotação para definir o endereço base de todos os serviços dentro desse controler
public class TesteController {
    //Log impressão de msgs de log da aplicação


    private static final Logger LOG = LoggerFactory.getLogger(TesteController.class);

    @GetMapping("/dog/{name}") // Acessado através HTTP GET - Define endereço para acessar a operação
    public ResponseEntity<?> dogTest(@PathVariable String name){
        LOG.info("Test Controller - name: {}", name);

        return ResponseEntity.ok("Name: " + name);
    }

}
