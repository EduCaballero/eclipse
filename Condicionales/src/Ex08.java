import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08 {	

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
			
			System.out.println("Dime otra valor");
			String num4Str = buffer.readLine();
			int num4 = Integer.parseInt(num4Str);
			System.out.println("Me has dicho " + num4 + "!");
			
			System.out.println("Dime otra valor");
			String num5Str = buffer.readLine();
			int num5 = Integer.parseInt(num5Str);
			System.out.println("Me has dicho " + num5 + "!");
			
			System.out.println("Dime otra valor");
			String num6Str = buffer.readLine();
			int num6 = Integer.parseInt(num6Str);
			System.out.println("Me has dicho " + num6 + "!");
			
			System.out.println("Dime otra valor");
			String num7Str = buffer.readLine();
			int num7 = Integer.parseInt(num7Str);
			System.out.println("Me has dicho " + num7 + "!");
			
			System.out.println("Dime otra valor");
			String num8Str = buffer.readLine();
			int num8 = Integer.parseInt(num8Str);
			System.out.println("Me has dicho " + num8 + "!");
			
			System.out.println("Dime otra valor");
			String num9Str = buffer.readLine();
			int num9 = Integer.parseInt(num9Str);
			System.out.println("Me has dicho " + num9 + "!");
			
			System.out.println("Dime otra valor");
			String num10Str = buffer.readLine();
			int num10 = Integer.parseInt(num10Str);
			System.out.println("Me has dicho " + num10 + "!");
			
			int positivo = 0;
			int negativo = 0;
			int cero = 0;
			int sumapos = 0;
			int sumaneg = 0; 
			
			if (num1>0){
				positivo++;
				sumapos+=num1;
			}
			else if (num1<0){
				negativo++;
				sumaneg+=num1;
			}
			else cero++;
			

			if (num2>0){
				positivo++;
				sumapos+=num2;
			}
			else if (num2<0){
				negativo++;
				sumaneg+=num2;
			}
			else cero++;
			
			if (num3>0){
				positivo++;
				sumapos+=num3;
			}
			else if (num3<0){
				negativo++;
				sumaneg+=num3;
			}
			else cero++;
			
			if (num4>0){
				positivo++;
				sumapos+=num4;
			}
			else if (num4<0){
				negativo++;
				sumaneg+=num4;
			}
			else cero++;
			
			if (num5>0){
				positivo++;
				sumapos+=num5;
			}
			else if (num5<0){
				negativo++;
				sumaneg+=num5;
			}
			else cero++;
			
			if (num6>0){
				positivo++;
				sumapos+=num6;
			}
			else if (num6<0){
				negativo++;
				sumaneg+=num6;
			}
			else cero++;
			
			if (num7>0){
				positivo++;
				sumapos+=num7;
			}
			else if (num7<0){
				negativo++;
				sumaneg+=num7;
			}
			else cero++;
			
			if (num8>0){
				positivo++;
				sumapos+=num8;
			}
			else if (num8<0){
				negativo++;
				sumaneg+=num8;
			}
			else cero++;
			
			if (num9>0){
				positivo++;
				sumapos+=num9;
			}
			else if (num9<0){
				negativo++;
				sumaneg+=num9;
			}
			else cero++;
			
			if (num10>0){
				positivo++;
				sumapos+=num10;
			}
			else if (num10<0){
				negativo++;
				sumaneg+=num10;
			}
			else cero++;
			
			System.out.println("El valor medio de los números positivos es " + (sumapos/positivo));
			System.out.println("El valor medio de los números negativos es " + (sumaneg/negativo));
			System.out.println("El número de ceros introducidos es " + cero);		

		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}