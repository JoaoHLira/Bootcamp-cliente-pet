package br.com.petz.clientepet.pet.application.service;

import br.com.petz.clientepet.pet.application.api.request.PetRequest;
import br.com.petz.clientepet.pet.application.api.response.PetResponse;

import java.util.UUID;

public interface PetService {
    PetResponse criaPet(UUID idCliente, PetRequest petRequest);
}
