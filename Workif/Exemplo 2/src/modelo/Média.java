package modelo;

import java.util.Scanner;

public class M�dia {

	public static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		float val1, val2, result;
	
	//FA�A UM PROGRAMA QUE L� DUAS NOTAS 
	// CALCULE A M�DIA E MOSTRE SE O ALUNO 
	// EST� APROVADO OU REPROVADO
	
	System.out.print("DIGITE A PRIMEIRA NOTA AQUI:");
	val1 = entrada.nextFloat();
	
	System.out.print("DIGITE A SEGUNDA NOTA AQUI:");
	val2 = entrada.nextFloat();
	
	result = (val1+val2)/2;
	
	
	System.out.println("a m�dia do aluno �:" + result);
	
	if(result >= 5) {
		System.out.println("O ALUNO SER� APROVADO" );		
	} else {
		System.out.println("O ALUNO SER� REPROVADO"); 
	}
	
	

	}

}
