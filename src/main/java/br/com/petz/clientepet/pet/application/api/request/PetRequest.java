package br.com.petz.clientepet.pet.application.api.request;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.Tipo;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class PetRequest {
    @NotBlank
    private String nomePet;
    private Porte porte;
    @NotNull
    private Tipo tipo;
    private String microChip;
    @NotBlank
    private String raca;
    private SexoPet sexoPet;
    private String pelagemCor;
    @NotNull
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;
}
