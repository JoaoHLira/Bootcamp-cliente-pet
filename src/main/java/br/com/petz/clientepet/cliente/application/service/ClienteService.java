package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.request.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.response.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
