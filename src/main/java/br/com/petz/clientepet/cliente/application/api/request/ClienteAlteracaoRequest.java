package br.com.petz.clientepet.cliente.application.api.request;

import br.com.petz.clientepet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;

@Value
public class ClienteAlteracaoRequest {
    private String nomeCompleto;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private Boolean aceitaTermos;
}
