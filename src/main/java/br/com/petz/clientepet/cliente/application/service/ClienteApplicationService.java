package br.com.petz.clientepet.cliente.application.service;

import br.com.petz.clientepet.cliente.application.api.request.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.response.ClienteResponse;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {
    private Object clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[Inicia] ClienteApplicationService  - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService  - criaCliente");
        return null;
    }
}
