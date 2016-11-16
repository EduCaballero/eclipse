import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex06 {
	public static void main (String[] args) {

		System.out.println("Edu, ¡Vamos  calcular la media de tus notas!");

		try{

			System.out.println("Comencemos:");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime la primera nota");
			String op1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double op1 = Double.parseDouble(op1Str);

			System.out.println("Ahora, dime la segunda");
			String op2Str = buffer.readLine();
			double op2 = Double.parseDouble(op2Str); //esto es para pasar el string (texto) a número (integer)
			
			System.out.println("Ahora, dime la tercera");
			String op3Str = buffer.readLine();
			double op3 = Double.parseDouble(op3Str); //esto es para pasar el string (texto) a número (integer)
			
			System.out.println("Ahora, dime la cuarta");
			String op4Str = buffer.readLine();
			double op4 = Double.parseDouble(op4Str); //esto es para pasar el string (texto) a número (integer)
			
			System.out.println("Ahora, dime la quinta");
			String op5Str = buffer.readLine();
			double op5 = Double.parseDouble(op5Str); //esto es para pasar el string (texto) a número (integer)
			
			
			
			System.out.println("Tu nota media es de " + ((op1+op2+op3+op4+op5)/5)); // Esto concatena la información.

		}

		catch (Exception e){

			System.out.println("Error! :(");
			
		}
	}

}
