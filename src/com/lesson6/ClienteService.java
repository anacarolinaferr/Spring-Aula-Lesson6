package com.lesson6;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private static List<Cliente> clientes = new ArrayList<>();

    public void adicionaCliente(Cliente cliente) throws ClienteMenorIdadeException, ClienteCadastradoException{
        if(clienteCadastrado(cliente)){
            throw new ClienteMenorIdadeException("Cliente cadastrado!");
        }
        if(menorIdade(cliente)){
            throw new ClienteMenorIdadeException("Cliente menor de idade!");
        }
        clientes.add(cliente);
    }

    private static boolean clienteCadastrado(Cliente cliente){
        return clientes.contains(cliente);
    }

    private boolean menorIdade(Cliente cliente){
        return (cliente.getIdade()<18);
    }

    public List<Cliente> listagem(){
        return clientes;
    }
}
