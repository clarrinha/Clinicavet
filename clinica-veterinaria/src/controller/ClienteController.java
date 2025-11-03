package controller;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    private List<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
    }

    public static class Cliente {
        private String nome;
        private String endereco;
        private String telefone;

        public Cliente(String nome, String endereco, String telefone) {
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

        public String getNome() { return nome; }
        public String getEndereco() { return endereco; }
        public String getTelefone() { return telefone; }
    }

    public void cadastrarCliente(String nome, String endereco, String telefone) {
        clientes.add(new Cliente(nome, endereco, telefone));
        System.out.println("Cadastro de cliente realizado com sucesso!");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            System.out.println("ID: " + i + ", Nome: " + c.getNome() + ", Endereço: " + c.getEndereco() + ", Telefone: " + c.getTelefone());
        }
    }
}
