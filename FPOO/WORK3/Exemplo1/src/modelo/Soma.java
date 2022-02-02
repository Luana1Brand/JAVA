package modelo;

import java.util.Scanner;

public class Soma {
	
	public static Scanner entrada;
	
	public static void main(String[] args) {
		
		/* entrada*/
		entrada = new Scanner (System.in); 
		int val1, val2, result;
		
		/*processamento*/
		System.out.print("Digite um valor inteiro:");
		val1= entrada.nextInt();
		System.out.print("digite outro valor:");
		val2 = entrada.nextInt();
		
		/* saída*/
		result=val1+val2;
		
		System.out.println("a soma dos dois valores é: " + result);
		
	}
	
	
}
