package challenge;

import java.util.Scanner;

public class CalculadoraSalarioLiquido {
	
	public static void main(String[] args) {
		int x = 0;
		while(x < 5){
			String opcao = menu();
			
			if (opcao.equalsIgnoreCase("1")){
				iniciarCalculo();
			} else if (opcao.equalsIgnoreCase("2")){
				break;
			} else {
				System.out.println("Opcão inválida");
			}	

		    System.out.println("\n");
			x++;
		}		
		System.out.println("Fim do programa");
	}
	
	private static double calcularSalarioLiquido(double salario, double descontoSalarioInss, double descontoSalarioImpostoRenda) {
		
		salario -= descontoSalarioInss;
		salario -= descontoSalarioImpostoRenda;

		return salario;
	}
	
	private static void iniciarCalculo() {
		
		Scanner dadosFuncionario = new Scanner(System.in);  
	    System.out.println("Informe o nome do funcionário: ");
	    String nome = dadosFuncionario.nextLine();  
	    
	    System.out.println("Informe o salário do funcionário: ");
	    double salarioBase = dadosFuncionario.nextDouble();
	    
	    
	    CalculaInss mCalculaInss = new CalculaInss();
	    double descontoSalarioInss = mCalculaInss.calcularImposto(salarioBase);
	    
	    CalculaImpostoRenda mCalculaImpostoRenda = new CalculaImpostoRenda();
	    double descontoSalarioImpostoRenda = mCalculaImpostoRenda.calcularImposto(salarioBase - descontoSalarioInss);
	    
	    double salarioLiquido = calcularSalarioLiquido(salarioBase, descontoSalarioInss, descontoSalarioImpostoRenda);
	    
	    System.out.println("\n");
	    System.out.println("Nome funcionário: " + nome); 
	    System.out.println("Salário bruto: " + salarioBase); 
	    System.out.println("Desconto INSS: " + String.format("%.2f",descontoSalarioInss));
	    System.out.println("Desconto imposto de renda: " + String.format("%.2f",descontoSalarioImpostoRenda));
	    System.out.println("Salário líquido: " + String.format("%.2f",salarioLiquido));
	    
	}
	
	private static String menu() {
		Scanner pegarOpcao = new Scanner(System.in);
		
		System.out.println("1 - Calcular Salários");
		System.out.println("2 - Sair");
		
		String opcao = pegarOpcao.nextLine();
		System.out.println("\n");
		
		return opcao;
	}

}
