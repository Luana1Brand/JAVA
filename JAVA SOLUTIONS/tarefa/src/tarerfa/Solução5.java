package tarerfa;
import java.util.Scanner;

public class Solu��o5 {

	
	/*
	 * laranja e caminh�o de toneladas
	 * 
	 */
	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
	
		int tonCaminh�o = 18;
		int tonAlqueire = 250;
		int caminh�es;
		int alqueires;
		int viagens;
		
		
		System.out.print("Quantos caminh�es:");
		caminh�es= read.nextInt();
		System.out.print("quantos alqueires voc� possui:");
		alqueires= read.nextInt();
		
		//processamento 
		int produ�ao = alqueires * tonAlqueire;
		int carga = caminh�es * tonCaminh�o;
		viagens = produ�ao / carga;
		
		//Sa�da
		
		System.out.printf("voc� precisar� de %d de viavens", viagens);
		
		

	}

}
