package modelo;

import java.util.Scanner;

public class baskara {
	
		public static Scanner entrada;
		
		public static void main(String[] args) {
			entrada = new Scanner (System.in);
			float A, B, C, DELTA;
			
			Double R1 , R2; 
			
			System.out.print("valor de A: ");
			A = entrada.nextFloat();
			
			System.out.print("valor de B: ");
			B = entrada.nextFloat();
			
			System.out.print("valor de C: ");
			C = entrada.nextFloat();
			
			
			
			DELTA = (B*B) - 4* A * C;
			System.out.println( "o valor de DELTA é:" + DELTA);
			
			
			if (DELTA < 0 ) { 
				System.out.println(" DELTA negativo, não possui raiz");
				
			
			} else {
				
				R1= (-B +Math.sqrt(DELTA))/(2*A);
						
				R2= (-B -Math.sqrt(DELTA))/(2*A);
								
				
				System.out.println("DELTA maior do que zero PORTANTO: R1= " + R1 + " E R2= " + R2);
				
				
			}
			
					
					
	}
		
		
}
