package entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		double aux = salarioBruto * porcentagem / 100;
		salarioBruto = salarioBruto + aux;
	}
	
	public String toString() {
		return nome
			 + ", R$ "
			 + String.format("%.2f",salarioLiquido());
	}

}
