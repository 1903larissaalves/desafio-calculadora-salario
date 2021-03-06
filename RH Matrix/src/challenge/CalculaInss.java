package challenge;

//classe filha de calculadora impostos
public class CalculaInss extends CalculadoraImpostos {

	//calcula desconto de INSS
	public double calcularImposto(double salarioBase) {
		
		//percentual de desconto INSS
		final double DESCONTO_INSS_SETE_PONTO_CINCO_PORCENTO = 0.075;
		final double DESCONTO_INSS_NOVE_PORCENTO = 0.09;
		final double DESCONTO_INSS_DOZE_PORCENTO = 0.12;
		final double DESCONTO_INSS_QUATORZE_PORCENTO = 0.14;
				
		//aplica desconto conforme faixa salarial
		if (salarioBase <= 1045) {
			return salarioBase * DESCONTO_INSS_SETE_PONTO_CINCO_PORCENTO;
			
		} else if(salarioBase >= 1045.01 && salarioBase <= 2089.60) {
			return salarioBase * DESCONTO_INSS_NOVE_PORCENTO;
			
		} else if (salarioBase >= 2089.61 && salarioBase <= 3134.40) {
			return salarioBase * DESCONTO_INSS_DOZE_PORCENTO;
			
		} else {
			return salarioBase * DESCONTO_INSS_QUATORZE_PORCENTO;
		}
	}
	
}
