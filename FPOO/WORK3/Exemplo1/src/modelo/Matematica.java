package modelo;

public class Matematica {

	public static void main(String[] args) {

		int v1 = 13;
		
		int v2 = 3;
		
		int e = (int) Math.pow(v1,v2);
		
		float raiz = (float ) Math.sqrt(e);
		
		System.out.printf("%d + %d = %d \n", v1 , v2 , v1 + v2);
		
		System.out.printf("%d - %d = %d\n", v1 , v2 , v1 - v2);
		
		System.out.printf("%d * %d = %d\n", v1 , v2 , v1 * v2);
		
		System.out.printf("%d / %d = %d\n", v1 , v2 , v1 / v2);
		
		System.out.printf("o resto de %d\n ", v1 % v2);
		
		System.out.printf("%d elevado a %d � d%\n", v1 % v2);
		
		System.out.printf("a raiz de %d � %.2f \n", e , raiz);

		
	}

}
