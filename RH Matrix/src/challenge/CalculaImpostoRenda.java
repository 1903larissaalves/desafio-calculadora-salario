package challenge;

public class CalculaImpostoRenda extends CalculadoraImpostos{
	
	public double calcularImposto(double salarioBase) {
		
		final double DESCONTO_IMPOSTO_RENDA_SETE_PONTO_CINCO_PORCENTO = 0.075;
		final double DESCONTO_IMPOSTO_RENDA_QUINZE_PORCENTO = 0.15;
		final double DESCONTO_IMPOSTO_RENDA_VINTE_DOIS_PONTO_CINCO_PORCENTO = 0.225;
		final double DESCONTO_IMPOSTO_RENDA_VINTE_SETE_PONTO_CINCO_PORCENTO = 0.275;		
		
		if (salarioBase >= 1903.99 && salarioBase <= 2826.65) {
			return salarioBase * DESCONTO_IMPOSTO_RENDA_SETE_PONTO_CINCO_PORCENTO;
		} else if(salarioBase >= 2826.66  && salarioBase <= 3751.05) {
			return salarioBase * DESCONTO_IMPOSTO_RENDA_QUINZE_PORCENTO;
		} else if(salarioBase >= 3751.06   && salarioBase <= 4664.68) {
			return salarioBase * DESCONTO_IMPOSTO_RENDA_VINTE_DOIS_PONTO_CINCO_PORCENTO;
		}else if(salarioBase > 4664.68){
			return salarioBase * DESCONTO_IMPOSTO_RENDA_VINTE_SETE_PONTO_CINCO_PORCENTO;
		}else {
			return 0;
		}
	}
}
