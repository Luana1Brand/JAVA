package modelo;

import java.util.Scanner;

public class Média {

	public static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		float val1, val2, result;
	
	//FAÇA UM PROGRAMA QUE LÊ DUAS NOTAS 
	// CALCULE A MÉDIA E MOSTRE SE O ALUNO 
	// ESTÁ APROVADO OU REPROVADO
	
	System.out.print("DIGITE A PRIMEIRA NOTA AQUI:");
	val1 = entrada.nextFloat();
	
	System.out.print("DIGITE A SEGUNDA NOTA AQUI:");
	val2 = entrada.nextFloat();
	
	result = (val1+val2)/2;
	
	
	System.out.println("a média do aluno é:" + result);
	
	if(result >= 5) {
		System.out.println("O ALUNO SERÁ APROVADO" );		
	} else {
		System.out.println("O ALUNO SERÁ REPROVADO"); 
	}
	
	

	}

}
