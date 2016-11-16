import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex03{

	public static void main(String[] args) {

		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime la base de un triuangulo equilátero");
			String baseStr = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int base = Integer.parseInt(baseStr);

			System.out.println("Ahora dime la altura del triángulo equilátero");
			String altStr = buffer.readLine();
			int alt = Integer.parseInt(altStr); //esto es para pasar el string (texto) a número (integer)
			System.out.println("El área del triangulo es " + (base*alt/2));
			System.out.println("El perímetro del triángulo es " + (base*3));
		}

		catch (Exception e){

			System.out.println("Error! :(");

		}	
	}
}