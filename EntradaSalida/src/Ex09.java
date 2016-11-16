import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex09 {
	public static void main (String[] args) {

		System.out.println("Edu, ¡Vamos  calcular ecuaciones de segundo grado!");

		try{

			System.out.println("Comencemos:");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime el primer coeficiente");
			String op1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double op1 = Double.parseDouble(op1Str);

			System.out.println("Ahora, dime el segundo");
			String op2Str = buffer.readLine();
			double op2 = Double.parseDouble(op2Str); //esto es para pasar el string (texto) a número
			
			System.out.println("Ahora, dime el tercero");
			String op3Str = buffer.readLine();
			double op3 = Double.parseDouble(op3Str); //esto es para pasar el string (texto) a número
			
			if (op2*op2-4*op1*op3 < 0) 			
				System.out.println("La ecuación no tiene solución");
			else if (op2*op2-4*op1*op3 == 0) {
				System.out.println("La solución de la ecuación es " + (-op2/2*op1));
			} 
			else {
				System.out.println("Las soluciones de las ecuaciones son " + ((-op2 + Math.sqrt(op2*op2-4*op1*op3))/(2*op1)) + " y " + ((-op2 - Math.sqrt(op2*op2-4*op1*op3))/(2*op1)));
			}
			
			
		}

		catch (Exception e){

			System.out.println("Error! :(");
			
		}
	}


}
