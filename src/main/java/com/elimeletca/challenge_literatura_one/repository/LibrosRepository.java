package com.elimeletca.challenge_literatura_one.repository;

import com.elimeletca.challenge_literatura_one.models.Autor;
import com.elimeletca.challenge_literatura_one.models.Idioma;
import com.elimeletca.challenge_literatura_one.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibrosRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByIdiomas(Idioma idioma);

    List<Libro> findTop5ByOrderByNumeroDeDescargasDesc();
    @Query("SELECT l FROM Libro a JOIN a.autor l")
    List<Autor> mostrarAutores();

    @Query("SELECT l FROM Libro a JOIN a.autor l WHERE l.fechaDeNacimiento <= :anio AND l.fechadeMuerte >= :anio")
    List<Autor> mostrarAutoresVivos(String anio);

}
