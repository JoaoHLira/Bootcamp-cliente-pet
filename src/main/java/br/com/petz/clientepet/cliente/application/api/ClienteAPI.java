package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.application.api.request.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.response.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.response.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.response.ClienteResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ClienteListResponse> getTodosClientes();
    @GetMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteDetalhadoResponse getClienteAtravesId(@PathVariable UUID idCliente);

    @DeleteMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaClienteAtravesId(@PathVariable UUID idCliente);
}
