package entities;

public class Aluno {
	
	public String nome;
	public double notaT1;
	public double notaT2;
	public double notaT3;
	public double media = 60;
	public double notaFaltante;
	
	public double notaFinal() {
		return notaT1 + notaT2 + notaT3;
	}
	
	public void resultado () {
		if (notaFinal() > 60) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado;");
			System.out.println("Nota faltante: " + notaFaltante());
		}
	}
	
	public double notaFaltante() {
		notaFaltante = media - notaFinal();
		return notaFaltante;
	}

}
