package org.example.jogo.repository;

import org.example.jogo.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface jogoRepository  extends JpaRepository<Jogo, Long> {
        List<Jogo> findByNomeContainingIgnoreCase(String nome);
}
