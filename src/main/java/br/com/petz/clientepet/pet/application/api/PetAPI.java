package br.com.petz.clientepet.pet.application.api;

import br.com.petz.clientepet.pet.application.api.request.PetRequest;
import br.com.petz.clientepet.pet.application.api.response.PetClienteListResponse;
import br.com.petz.clientepet.pet.application.api.response.PetClienteDetalhadoResponse;
import br.com.petz.clientepet.pet.application.api.response.PetResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/pet")
public interface PetAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PetResponse postPet(@PathVariable UUID idCliente, @Valid @RequestBody PetRequest petRequest);
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<PetClienteListResponse> getPetsDoClienteComId(@PathVariable UUID idCliente);
    @GetMapping(value = "/{idPet}")
    @ResponseStatus(code = HttpStatus.OK)
    PetClienteDetalhadoResponse getPetAtravesId(@PathVariable UUID idCliente, @PathVariable UUID idPet);

}
