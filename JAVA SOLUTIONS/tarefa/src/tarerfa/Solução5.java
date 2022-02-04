package tarerfa;
import java.util.Scanner;

public class Solução5 {

	
	/*
	 * laranja e caminhão de toneladas
	 * 
	 */
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
	
		int tonCaminhão = 18;
		int tonAlqueire = 250;
		int caminhões;
		int alqueires;
		int viagens;
		
		
		System.out.print("Quantos caminhões:");
		caminhões= read.nextInt();
		System.out.print("quantos alqueires você possui:");
		alqueires= read.nextInt();
		
		//processamento 
		int produçao = alqueires * tonAlqueire;
		int carga = caminhões * tonCaminhão;
		viagens = produçao / carga;
		
		//Saída
		
		System.out.printf("você precisará de %d de viavens", viagens);
		
		

	}

}
