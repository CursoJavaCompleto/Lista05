package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario f = new Funcionario();
		double porcentagem;

		System.out.println("Informe o nome:");
		f.nome = sc.nextLine();
		System.out.println("Informe o salário bruto: ");
		f.salarioBruto = sc.nextDouble();
		System.out.println("Informe o imposto: ");
		f.imposto = sc.nextDouble();

		System.out.println("Funcionário: " + f);

		System.out.println("Aumentar o salário em quantos porcentos?");
		porcentagem = sc.nextDouble();

		f.aumentarSalario(porcentagem);

		System.out.println("Informações atualizadas: " + f);

		sc.close();

	}

}
