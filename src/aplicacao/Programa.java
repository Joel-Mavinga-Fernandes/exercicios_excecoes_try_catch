package aplicacao;

import java.util.Scanner;

import entidade.Conta;
import excecoes.Excecoes;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite os dados da conta:");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Nome: ");
			String proprietario = sc.next();
			System.out.println("Digite o saldo inicial");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque");
			double limiteSaque = sc.nextDouble();

			Conta conta = new Conta(numero, proprietario, saldo, limiteSaque);
			

			System.out.print("Deseja fazer um Saque ou Deposito? (S/D): ");
			char operacao = sc.next().charAt(0);

			if (operacao == 'd') {
				System.out.print("Digite o valor do Depósito: ");
				double valor = sc.nextDouble();
				conta.deposito(valor);
				System.out.println(conta);
				
			} else if (operacao == 's') {
				System.out.print("Digite o valor do saque: ");
				double valor = sc.nextDouble();
				conta.saque(valor);
				System.out.println(conta);
			}
		} catch (Excecoes a) {
			System.out.println("Erro: " + a.getMessage());
		}

		sc.close();
	}
}
