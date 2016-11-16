import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {	

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
			
			int suspensos = 0;
			
			if (num1<5) suspensos++;
			if (num2<5) suspensos++;
			if (num3<5) suspensos++;
			if (num4<5) suspensos++;
			if (num5<5) suspensos++;	
			
			System.out.println("Hay " + suspensos + " suspensos");
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}
