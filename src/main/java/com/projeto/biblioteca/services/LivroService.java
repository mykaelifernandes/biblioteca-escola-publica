package com.projeto.biblioteca.services;

import java.util.List;

import com.projeto.biblioteca.dto.LivroMinDTO;
import com.projeto.biblioteca.entities.Livro;
import com.projeto.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // Convertendo a tabela de Livros para uma Lista de Livros.
    public List<LivroMinDTO> findAll() {
        List<Livro> result = livroRepository.findAll();
        return result.stream().map(x -> new LivroMinDTO(x)).toList();
    }
}