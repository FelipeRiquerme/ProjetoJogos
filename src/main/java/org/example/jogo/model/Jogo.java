package org.example.jogo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoAtivacao;


    @NotBlank(message = "Nome Obrigatório")
    private String nome;

    @NotBlank(message = "Categoría Obrigatória")
    private String categoria;

    @Positive (message = "Apenas valores Positivos")
    @NotNull (message = "Preço Obrigatório")
    private Double preco;

}
