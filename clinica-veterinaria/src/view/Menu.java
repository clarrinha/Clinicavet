package view;

import java.util.Scanner;
import controller.FuncionarioController;
import controller.ClienteController;
import controller.AnimalController;

public class Menu {

    private Scanner scanner;
    private FuncionarioController funcionarioController;
    private ClienteController clienteController;
    private AnimalController animalController;

    public Menu() {
        scanner = new Scanner(System.in);
        funcionarioController = new FuncionarioController();
        clienteController = new ClienteController();
        animalController = new AnimalController();
    }

    public void MenuPrincipal() {
        int opcao;
        do {
            System.out.println("\nMenu da Clínica Veterinária:");
            System.out.println("1. Adicionar cadastros");
            System.out.println("2. Listar cadastros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    MenuCadastro();
                    break;
                case 2:
                    MenuListar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void MenuCadastro() {
        int opcao;
        do {
            System.out.println("\nMenu Adicionar:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Adicionar Funcionário");
            System.out.println("3. Adicionar Animal");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
                    break;
                case 3:
                    cadastrarAnimal();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void MenuListar() {
        int opcao;
        do {
            System.out.println("\nMenu Listar:");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Listar Animais");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    clienteController.listarClientes();
                    break;
                case 2:
                    funcionarioController.listarFuncionarios();
                    break;
                case 3:
                    animalController.listarAnimais();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Métodos de cadastro

    private void cadastrarCliente() {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        clienteController.cadastrarCliente(nome, endereco, telefone);
    }

    private void cadastrarFuncionario() {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        funcionarioController.cadastrarFuncionario(nome, cargo);
    }

    private void cadastrarAnimal() {
        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();
        System.out.print("Espécie: ");
        String especie = scanner.nextLine();

        animalController.cadastrarAnimal(nome, especie);
    }
}
