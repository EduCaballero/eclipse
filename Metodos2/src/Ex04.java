//Diseñar un programa que tenga un método cuyos parámetros sean tres números, y que calcule el máximo.

public class Ex04 {
	
	static void maximo(int a, int b, int c) {
		System.out.println("El máximo es " + Math.max(a, Math.max(b,c)));
	}
	
	public static void main(String[] args) {

		maximo(10, 8, 5);
	}

}
