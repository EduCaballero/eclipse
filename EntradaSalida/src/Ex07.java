import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07 {
	public static void main (String[] args) {

		System.out.println("Edu, �Vamos  calcular tu vejez!");

		try{

			System.out.println("Comencemos:");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime tu a�o de nacimiento");
			String op1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int op1 = Integer.parseInt(op1Str);

			System.out.println("Ahora, dime el a�o actual");
			String op2Str = buffer.readLine();
			int op2 = Integer.parseInt(op2Str); //esto es para pasar el string (texto) a n�mero (integer)
			
			System.out.println("�Est�s hecho un viejo! �Tienes " + (op2-op1)  + " a�os! ");
			
		}

		catch (Exception e){

			System.out.println("Error! :(");
			
		}
	}
}