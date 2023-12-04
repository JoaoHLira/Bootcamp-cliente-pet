package br.com.petz.clientepet.cliente.application.api.response;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private Sexo sexo;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;
}
