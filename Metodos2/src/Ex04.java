//Dise�ar un programa que tenga un m�todo cuyos par�metros sean tres n�meros, y que calcule el m�ximo.

public class Ex04 {
	
	static void maximo(int a, int b, int c) {
		System.out.println("El m�ximo es " + Math.max(a, Math.max(b,c)));
	}
	
	public static void main(String[] args) {

		maximo(10, 8, 5);
	}

}
