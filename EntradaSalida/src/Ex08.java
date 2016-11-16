import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ex08 {
	public static void main (String[] args) {

		System.out.println("Edu, ¡Nos vamos de viaje!");

		try{

			System.out.println("Vamos a calcular 'dineritos':");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime cuánto te quieres gastar... convertir");
			String op1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double op1 = Double.parseDouble(op1Str);

			DecimalFormat decimales = new DecimalFormat("0.00");
			System.out.println("¡" + decimales.format(op1*1.12) + " Dólares! ¡Cuánta pasta!");
			System.out.println("¡" + decimales.format(op1*112.527) + " Yenes! ¡Cuánta pasta!");

		}
		
		catch (Exception e){

			System.out.println("Error! :(");
			
		}
	}

}
