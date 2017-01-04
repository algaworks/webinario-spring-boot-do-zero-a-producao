package com.algaworks.bibliotecadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.bibliotecadigital.model.Livro;

public interface Livros extends JpaRepository<Livro, Long> {

}
