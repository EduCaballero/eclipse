import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01 {	

	public static void main(String[] args) {

		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe un número");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int num1 = Integer.parseInt(num1Str);
			System.out.println("Me has dicho el " + num1 + "!");

			System.out.println("Dime otro número");
			String num2Str = buffer.readLine();
			int num2 = Integer.parseInt(num2Str);
			System.out.println("Me has dicho el " + num2 + "!");
			if (num1>num2) System.out.println("El número más grande es el " + num1);
			else System.out.println("El número más grande es el " + num2);
		}

		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}