package controller;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        funcionarios = new ArrayList<>();
    }

    public static class Funcionario {
        private String nome;
        private String cargo;

        public Funcionario(String nome, String cargo) {
            this.nome = nome;
            this.cargo = cargo;
        }

        public String getNome() { return nome; }
        public String getCargo() { return cargo; }
    }

    public void cadastrarFuncionario(String nome, String cargo) {
        funcionarios.add(new Funcionario(nome, cargo));
        System.out.println("Cadastro de funcionário realizado com sucesso!");
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            System.out.println("ID: " + i + ", Nome: " + f.getNome() + ", Cargo: " + f.getCargo());
        }
    }
}
