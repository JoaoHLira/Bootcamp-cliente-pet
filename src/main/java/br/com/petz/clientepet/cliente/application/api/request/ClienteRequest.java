package br.com.petz.clientepet.cliente.application.api.request;

import br.com.petz.clientepet.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Value
public class ClienteRequest {
    private String nomeCompleto;
    private String email;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private LocalDate dataNascinmento;
    private String CPF;
    private Boolean aceitaTermos;
}
