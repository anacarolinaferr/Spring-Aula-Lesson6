package com.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int clienteIdade = 0;
        String sair = "n", clienteNome;
        ClienteService clienteService = new ClienteService();

        do {
            Scanner nomeEntrada  = new Scanner(System.in);
            System.out.println("Entre com a nome do cliente!");
            clienteNome = nomeEntrada.next();

            Scanner idadeEntrada  = new Scanner(System.in);
            System.out.println("Entre com o idade do cliente!");
            clienteIdade = idadeEntrada.nextInt();

            try {
                clienteService.adicionaCliente(new Cliente(clienteIdade, clienteNome));
                System.out.println("Cliente cadastrado!");
            }catch (ClienteMenorIdadeException | ClienteCadastradoException e){
                System.out.println(e.getMessage());
            }

            Scanner sairEntrada  = new Scanner(System.in);
            System.out.println("Deseja parar o cadastro!");
            sair = sairEntrada.next();

        }while (sair.equals("n"));

        System.out.println("Clientes cadastrados");
        for (Cliente item: clienteService.listagem()) {
            System.out.println(item.getNome()+"-->"+item.getIdade());
        }
    }
}
