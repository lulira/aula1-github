package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o número do titular: ");
		sc.nextLine();

		String titular = sc.nextLine();

		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Entre com o valor de depósito incial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
	}

}
