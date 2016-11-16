import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {	

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
			
			System.out.println("Dime otra valor");
			String num3Str = buffer.readLine();
			double num3 = Double.parseDouble(num3Str);
			System.out.println("Me has dicho " + num3 + "!");
			
			System.out.println("Dime otra valor");
			String num4Str = buffer.readLine();
			double num4 = Double.parseDouble(num4Str);
			System.out.println("Me has dicho " + num4 + "!");
			
			System.out.println("Dime otra valor");
			String num5Str = buffer.readLine();
			double num5 = Double.parseDouble(num5Str);
			System.out.println("Me has dicho " + num5 + "!");
			
			System.out.println("Dime otra valor");
			String num6Str = buffer.readLine();
			double num6 = Double.parseDouble(num6Str);
			System.out.println("Me has dicho " + num6 + "!");
			
			System.out.println("Dime otra valor");
			String num7Str = buffer.readLine();
			double num7 = Double.parseDouble(num7Str);
			System.out.println("Me has dicho " + num7 + "!");
			
			System.out.println("Dime otra valor");
			String num8Str = buffer.readLine();
			double num8 = Double.parseDouble(num8Str);
			System.out.println("Me has dicho " + num8 + "!");
			
			System.out.println("Dime otra valor");
			String num9Str = buffer.readLine();
			double num9 = Double.parseDouble(num9Str);
			System.out.println("Me has dicho " + num9 + "!");
			
			System.out.println("Dime otra valor");
			String num10Str = buffer.readLine();
			double num10 = Double.parseDouble(num10Str);
			System.out.println("Me has dicho " + num10 + "!");
			
			int negativos = 0;
			
			if (num1<0) negativos++;
			if (num2<0) negativos++;
			if (num3<0) negativos++;
			if (num4<0) negativos++;
			if (num5<0) negativos++;
			if (num6<0) negativos++;
			if (num7<0) negativos++;
			if (num8<0) negativos++;
			if (num9<0) negativos++;
			if (num10<0) negativos++;
			
			System.out.println("Me has dicho " + negativos + " números negativos!");			

		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}