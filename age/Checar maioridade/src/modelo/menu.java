package modelo;

import java.util.Scanner;

public class menu {
	
	public static Scanner entrada;
	

	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		int menu = 0;
		
		System.out.println(" escolha uma op��o:");

		System.out.println("1 Engatinhar");
		System.out.println("2 Andar");
		System.out.println("3 correr");
		System.out.println("4 pedalar");
		System.out.println("5 dirigir ");
		System.out.println("6 pilotar");
		
		menu = entrada.nextInt ();
		
		switch (menu) {
			case 1:
				System.out.println("VEM NEN�M");
				break;
				
			case 2:
				System.out.println("DANDA NEN�M");
				break;
			
			case 3:
				System.out.println("VAI CAIR");
				break;
				
			case 4:
				System.out.println("CUIDADO COM OS DENTES");
				break;
				
				
			case 5:
				System.out.println("VEM V� O QUE C� FEZ");
				break;
				
			case 6:
				System.out.println("N�O ESQUECE O CAPOVETE");
				break;
				
				default:
					System.out.println("ESCOLHE DIREITO");
					break;
			
			
			
		}
			
	}

}
