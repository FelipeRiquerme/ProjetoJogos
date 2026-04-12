package org.example.jogo.service;

import org.example.jogo.model.Jogo;
import org.example.jogo.repository.jogoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class jogoService {

    private final jogoRepository repository;

    public jogoService(jogoRepository repository) {
        this.repository = repository;
    }

    public Jogo salvar(Jogo jogo) {
        return repository.save(jogo);
    }

    public List<Jogo> listar() {
        return repository.findAll();
    }

    public List<Jogo> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public void deletar(Long codigoAtivacao) {
        repository.deleteById(codigoAtivacao);
    }

    public Jogo atualizar(Long codigoAtivacao, Jogo jogo) {
        Jogo jogoExistente = repository.findById(codigoAtivacao)
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
        jogoExistente.setNome(jogo.getNome());
        jogoExistente.setCategoria(jogo.getCategoria());
        jogoExistente.setPreco(jogo.getPreco());
        return repository.save(jogoExistente);
    }
}
