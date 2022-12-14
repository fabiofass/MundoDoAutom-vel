package com.LojaDeCarros;

import java.util.Scanner;

public class Operacao {
	static Scanner imput = new Scanner(System.in);

	public static void main(String[] args) {

		operacoes();

	}

	public static void operacoes() {
		System.out.println("-------------Bem vindos a nossa Loja------------------");
		System.out.println("------------------------------------------------------");
		System.out.println("***** Selecione uma operação que deseja realizar *****");
		System.out.println("------------------------------------------------------");
		System.out.println("|   Opção 1 - Cadastrar Carro na Loja         |");
		System.out.println("|   Opção 2 - Pesquisar Carros(Placa)         |");
		System.out.println("|   Opção 3 - Pesquisar Carros (Marca/Modelo) |");
		System.out.println("|   Opção 4 - Pesquisar Carros (Ano)          |");
		System.out.println("|   Opção 5 - Listagem de todos os Carros     |");
		System.out.println("|   Opção 6 - Informações da Loja             |");
		System.out.println("|   Opção 7 - Finalizar(mensagem finalização) |");
		System.out.println("------------------------------------------------------");

		int operacao = imput.nextInt();

		switch (operacao) {
		case 1:
			Loja.cadastrarCarro();
			break;

		case 2:
			Loja.buscarPlaca();
			break;

		case 3:
			Loja.buscarMarcaModelo();
			break;

		case 4:
			Loja.listarPorAno();
			break;

		case 5:
			Loja.listarCarros();

			break;

		case 6:
			Pessoa pessoa = new Pessoa();
			Loja loja = new Loja();
			pessoa.setNome("Fabio");
			pessoa.setTelefone("81-997025664");
			System.out.println("Proprietário de Loja:" + pessoa.getNome() + "\nTelefone do Proprietário:"
					+ pessoa.getTelefone() + "\nQuantidade de Carros Disponível: " + loja.getQuantidade());
			operacoes();
			break;

		case 7:
			System.out.println("Flw é nóis!");
			System.exit(0);

		default:
			System.out.println("------------------------------------------------------");
			System.out.println("Opção inválida!");
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			operacoes();
			break;
		}

	}

}
