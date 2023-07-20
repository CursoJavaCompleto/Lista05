package application;

import java.util.Scanner;

import util.ConversorDeMoeda;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dólar hoje?");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos doláres serão comprados?");
		double reais = sc.nextDouble();
		double resultado = ConversorDeMoeda.converterParaDolar(dolar, reais);

		System.out.print("Valor a ser pago em reais = ");
		System.out.printf("%.2f", resultado);
		sc.close();

	}

}
