import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07 {	

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe un valor");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double num1 = Double.parseDouble(num1Str);
			System.out.println("Me has dicho " + num1 + "!");

			System.out.println("Dime otra valor");
			String num2Str = buffer.readLine();
			double num2 = Double.parseDouble(num2Str);
			System.out.println("Me has dicho " + num2 + "!");
			
			if (num1%num2 == 0) System.out.println("Los valores " + num1 + " y " + num2 + " son múltiplos entre si");
			else System.out.println("Los valores " + num1 + " y " + num2 + " no son múltiplos entre si");

		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}