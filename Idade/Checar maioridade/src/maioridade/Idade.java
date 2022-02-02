package maioridade;

import java.util.Scanner;

public class Idade {
	
	public static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		float IDADE;
		
		
		System.out.println("DIGITE SUA IDADE: ");
				IDADE = entrada.nextFloat();
				
				
				if (IDADE >= 18) {
					System.out.println(" maior de idade");
					
				} else {
					System.out.println(" menor de idade");
				}
	
	}
	}
			

