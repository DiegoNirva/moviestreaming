package com.cursospring.moviestreaming.dto;


import com.cursospring.moviestreaming.model.Categoria;

public record SerieDTO(Long id,
        String titulo,
        Categoria genero,
        String sinopsis,
        String poster,
        String actor,
        Integer totalDeTemporadas,
        Double evaluacion) {
}
