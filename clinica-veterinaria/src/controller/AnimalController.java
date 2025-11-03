package controller;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    private List<Animal> animais;

    public AnimalController() {
        animais = new ArrayList<>();
    }

    public static class Animal {
        private String nome;
        private String especie;

        public Animal(String nome, String especie) {
            this.nome = nome;
            this.especie = especie;
        }

        public String getNome() { return nome; }
        public String getEspecie() { return especie; }
    }

    public void cadastrarAnimal(String nome, String especie) {
        animais.add(new Animal(nome, especie));
        System.out.println("Cadastro de animal realizado com sucesso!");
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (int i = 0; i < animais.size(); i++) {
            Animal a = animais.get(i);
            System.out.println("ID: " + i + ", Nome: " + a.getNome() + ", Espécie: " + a.getEspecie());
        }
    }
}
