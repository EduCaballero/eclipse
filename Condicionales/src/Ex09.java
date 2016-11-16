import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex09 {	

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Vamos a calcular la edad y la altura media de 5 alumnos");
			System.out.println("Dime la edad del primer alumno");
			String edad1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double edad = Double.parseDouble(edad1Str);
			System.out.println("Me has dicho " + edad1 + "!");

			System.out.println("Dime la altura del primer alumno");
			String alt1Str = buffer.readLine();
			double alt1 = Double.parseDouble(num2Str);
			System.out.println("Me has dicho " + num2 + "!");
			
			System.out.println("Dime la edad del segundo alumno");
			String num2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double num3 = Double.parseDouble(num3Str);
			System.out.println("Me has dicho " + num3 + "!");

			System.out.println("Dime la altura del segundo alumno");
			String num2Str = buffer.readLine();
			double num2 = Double.parseDouble(num2Str);
			System.out.println("Me has dicho " + num2 + "!");
			
			System.out.println("Dime la edad del tercer alumno");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double num1 = Double.parseDouble(num1Str);
			System.out.println("Me has dicho " + num1 + "!");

			System.out.println("Dime la altura del tercer alumno");
			String num2Str = buffer.readLine();
			double num2 = Double.parseDouble(num2Str);
			System.out.println("Me has dicho " + num2 + "!");

			System.out.println("Dime la edad del cuarto alumno");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double num1 = Double.parseDouble(num1Str);
			System.out.println("Me has dicho " + num1 + "!");

			System.out.println("Dime la altura del cuarto alumno");
			String num2Str = buffer.readLine();
			double num2 = Double.parseDouble(num2Str);
			System.out.println("Me has dicho " + num2 + "!");

			System.out.println("Dime la edad del quinto alumno");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double num1 = Double.parseDouble(num1Str);
			System.out.println("Me has dicho " + num1 + "!");

			System.out.println("Dime la altura del quinto alumno");
			String num2Str = buffer.readLine();
			double num2 = Double.parseDouble(num2Str);
			System.out.println("Me has dicho " + num2 + "!");
			
			
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
	}
}

