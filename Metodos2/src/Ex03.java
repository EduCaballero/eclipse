//Dise�ar un programa que tenga un m�todo cuyos par�metros sean dos n�meros, y que calcule el m�ximo.

public class Ex03 {

	static void maximo(int max, int min) {
		if (max > min)
			System.out.println(max + " es mayor que " + min);
		else if (max < min)
			System.out.println(min + " es mayor que " + max);
		else
			System.out.println("Son iguales");
	}

	public static void main(String[] args) {

		maximo(10, 8);
	}

}
