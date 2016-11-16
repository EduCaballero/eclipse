import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main (String[] args) {

		System.out.println("Edu, ¡Vamos  calcular!");

		try{

			System.out.println("Comencemos:");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime el primer número");
			String op1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int op1 = Integer.parseInt(op1Str);

			System.out.println("Ahora, dime el segundo");
			String op2Str = buffer.readLine();
			int op2 = Integer.parseInt(op2Str); //esto es para pasar el string (texto) a número (integer)
			
			System.out.println("El resultado de la suma de " + op1 + " y " + op2 + " es " + (op1+op2)); // Esto concatena la información.
			System.out.println("El resultado de la resta de " + op1 + " y " + op2 + " es " + (op1-op2));
			System.out.println("El resultado de la multiplicación de " + op1 + " y " + op2 + " es " + (op1*op2));
			System.out.println("El resultado de la división entre " + op1 + " y " + op2 + " es " + (op1/op2));
			System.out.println("El resto de la divisón es " + (op1%op2));

		}

		catch (Exception e){

			System.out.println("Error! :(");
			
		}
	}
}