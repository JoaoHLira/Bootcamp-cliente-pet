package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.request.PetAlteracaoRequest;
import br.com.petz.clientepet.pet.application.api.request.PetRequest;
import br.com.petz.clientepet.pet.application.api.response.PetClienteDetalhadoResponse;
import br.com.petz.clientepet.pet.application.api.response.PetClienteListResponse;
import br.com.petz.clientepet.pet.application.api.response.PetResponse;

import java.util.List;
import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, PetRequest petRequest);
    List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente);
    PetClienteDetalhadoResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);
    void deletaPetDoClienteComId(UUID idCliente, UUID idPet);
    void alteraPetDoClienteComId(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest);
}
