package com.lesson6;

public class ClienteCadastradoException extends RuntimeException{

    public ClienteCadastradoException(String mensagem) {
        super(mensagem);
    }

    public ClienteCadastradoException(RuntimeException e) {
        super(e);
    }
}
