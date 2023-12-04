package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.request.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.response.ClienteDetalhadoResponse;
import br.com.petz.clientepet.cliente.application.api.response.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.response.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
