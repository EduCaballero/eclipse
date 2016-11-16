import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex03 {	

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe un número");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int num1 = Integer.parseInt(num1Str);
			System.out.println("Me has dicho el " + num1 + "!");
			
			if (num1%2==0 && num1%5==0) System.out.println("El número " + num1 + " es múltiplo de 2 y de 5");
			else System.out.println("El número " + num1 + " no es múltiplo de 2 y de 5");
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}