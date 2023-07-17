package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno a = new Aluno();
		
		System.out.println("Qual o nome do aluno?");
		a.nome = sc.nextLine();
		System.out.println("Nota do primeiro trimestre: ");
		a.notaT1 = sc.nextDouble();
		System.out.println("Nota do segundo trimestre: ");
		a.notaT2 = sc.nextDouble();
		System.out.println("Nota do terceiro trimestre: ");
		a.notaT3 = sc.nextDouble();
		a.notaFinal();
		System.out.println("Nota Final = " + a.notaFinal());
		a.resultado();
		
		sc.close();
	}

}
