package util;

public class ConversorDeMoeda {
	
	
	public static final double PORCENTAGEM = 6;
	
	public static double converterParaDolar(double dolar, double reais) {
		double aux = reais * dolar * PORCENTAGEM/ 100;
		return reais * dolar + aux;
				
				
	}

}
