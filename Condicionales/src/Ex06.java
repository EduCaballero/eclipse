import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex06 {	

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe un nota");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double num1 = Double.parseDouble(num1Str);
			System.out.println("Me has dicho " + num1 + "!");

			System.out.println("Dime otra nota");
			String num2Str = buffer.readLine();
			double num2 = Double.parseDouble(num2Str);
			System.out.println("Me has dicho " + num2 + "!");
			
			System.out.println("Dime otra nota");
			String num3Str = buffer.readLine();
			double num3 = Double.parseDouble(num3Str);
			System.out.println("Me has dicho " + num3 + "!");
			
			System.out.println("Dime otra nota");
			String num4Str = buffer.readLine();
			double num4 = Double.parseDouble(num4Str);
			System.out.println("Me has dicho " + num4 + "!");
			
			System.out.println("Dime otra nota");
			String num5Str = buffer.readLine();
			double num5 = Double.parseDouble(num5Str);
			System.out.println("Me has dicho " + num5 + "!");
			
			int multiplos = 0;
			
			if (num1%3==0) multiplos++;
			if (num2%3==0) multiplos++;
			if (num3%3==0) multiplos++;
			if (num4%3==0) multiplos++;
			if (num5%3==0) multiplos++;
	
			System.out.println("Hay " + multiplos + " múltiplos de 3");
	
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}