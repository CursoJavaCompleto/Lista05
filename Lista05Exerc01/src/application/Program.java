package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo();
		
		System.out.println("Informe a altura e largura do retângulo: ");
		
		r.altura = sc.nextDouble();
		r.largura = sc.nextDouble();
		
		double area = r.area();
		double perimetro = r.perimetro();
		double diagonal = r.diagonal();
		
		System.out.println("Área = " + area);
		System.out.println("Pêrimetro = " + perimetro);
		System.out.println("Diagonal = " + diagonal);
		
		sc.close();

	}

}
