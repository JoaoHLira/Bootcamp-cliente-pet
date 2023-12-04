package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.request.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.response.ClienteListResponse;
import br.com.petz.clientepet.cliente.application.api.response.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
}
