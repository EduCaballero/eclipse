import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02{

	public static void main(String[] args) {

		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe un número");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int num1 = Integer.parseInt(num1Str);
			System.out.println("Me has dicho el " + num1 + "!");

			System.out.println("Ahora otro");
			String num2Str = buffer.readLine();
			int num2 = Integer.parseInt(num2Str); //esto es para pasar el string (texto) a número (integer)
			double valor = Double.parseDouble(num2Str); //lo mismo que el de arribo pero para decimales
			System.out.println("Ahora voy a sumar " + num1 + " y " + num2);

			System.out.println("El resultado de la suma es " + (num1+num2));
		}

		catch (Exception e){

			System.out.println("Error al introducir tu nombre o tu edad");

		}	
	}
}