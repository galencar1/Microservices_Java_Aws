package br.com.gabrielfa.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/dog/color") // Acessado através HTTP GET - Define endereço para acessar a operação
    public ResponseEntity<?> dogColor(){
        LOG.info("Test Controller - Always Black");

        return ResponseEntity.ok("Always Black");
    }

    @GetMapping("/dog/color2") // Acessado através HTTP GET - Define endereço para acessar a operação
    public ResponseEntity<?> dogColor2(){
        LOG.info("Test Controller - Always Black");

        return ResponseEntity.ok("Always Black");
    }
}
