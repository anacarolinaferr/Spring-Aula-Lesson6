package com.lesson6;

public class ClienteMenorIdadeException extends RuntimeException{

    public ClienteMenorIdadeException(String mensagem) {
        super(mensagem);
    }

    public ClienteMenorIdadeException(RuntimeException e) {
        super(e);
    }
}
