package com.algaworks.curso.algamoney.api.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Erro {
    private String mensagemUsuario;
    private String mensagemDesenvolvedor;
}