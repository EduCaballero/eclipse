import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11 {
	
	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe un valor");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int num1 = Integer.parseInt(num1Str);
			System.out.println("Me has dicho " + num1 + "!");

			System.out.println("Dime otra valor");
			String num2Str = buffer.readLine();
			int num2 = Integer.parseInt(num2Str);
			System.out.println("Me has dicho " + num2 + "!");
			
			System.out.println("Dime otra valor");
			String num3Str = buffer.readLine();
			int num3 = Integer.parseInt(num3Str);
			System.out.println("Me has dicho " + num3 + "!");
			
			if (num1>num2 && num1>num3) System.out.println("El " + num1 + " es el mayor");
			
			if (num2>num1 && num2>num3) System.out.println("El " + num2 + " es el mayor");
			
			else System.out.println("El " + num3 + " es el mayor");
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	
	}
	}
