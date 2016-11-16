import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {
	public static void main (String[] args) {

		System.out.println("Edu, ¡Vamos  calcular la tabla de suma y multiplicación!");

		try{

			System.out.println("Comencemos:");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime un número de tu elección");
			String op1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int op1 = Integer.parseInt(op1Str);

			
			System.out.println("La tabla de la suma");
			System.out.println((op1+0));
			System.out.println((op1+1));
			System.out.println((op1+2));
			System.out.println((op1+3));
			System.out.println((op1+4));
			System.out.println((op1+5));
			System.out.println((op1+6));
			System.out.println((op1+7));
			System.out.println((op1+8));
			System.out.println((op1+9));
			System.out.println((op1+10));
			System.out.println("La tabla de multiplicar");
			System.out.println((op1*0));
			System.out.println((op1*1));
			System.out.println((op1*2));
			System.out.println((op1*3));
			System.out.println((op1*4));
			System.out.println((op1*5));
			System.out.println((op1*6));
			System.out.println((op1*7));
			System.out.println((op1*8));
			System.out.println((op1*9));
			System.out.println((op1*10));
		}

		catch (Exception e){

			System.out.println("Error! :(");
			
		}
	}
}