package br.com.petz.clientepet.pet.application.api.response;

import br.com.petz.clientepet.pet.domain.Pet;
import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.Tipo;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class PetClienteDetalhadoResponse {

    private UUID idPet;
    private UUID idClienteTutor;
    private String nomePet;
    private Porte porte;
    private Tipo tipo;
    private String microChip;
    private String raca;
    private SexoPet sexoPet;
    private String pelagemCor;
    private LocalDate dataNascimento;
    private String rga;
    private Integer peso;

    public PetClienteDetalhadoResponse(Pet pet) {
        this.idPet = pet.getIdPet();
        this.idClienteTutor = pet.getIdClienteTutor();
        this.nomePet = pet.getNomePet();
        this.porte = pet.getPorte();
        this.tipo = pet.getTipo();
        this.microChip = pet.getMicroChip();
        this.raca = pet.getRaca();
        this.sexoPet = pet.getSexoPet();
        this.pelagemCor = pet.getPelagemCor();
        this.dataNascimento = pet.getDataNascimento();
        this.rga = pet.getRga();
        this.peso = pet.getPeso();
    }
}
