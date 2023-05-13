package com.projeto.biblioteca.controllers;

import com.projeto.biblioteca.dto.LivroMinDTO;
import com.projeto.biblioteca.entities.Livro;
import com.projeto.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroMinDTO> findAll() {
        List<LivroMinDTO> result = livroService.findAll();
        return result;

    }
}
