import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15 {
	
	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("A continuación, introduce la fecha de tu nacimiento en números y determinaremos tu número de la suerte");
			System.out.println("Dime el día de tu nacimiento");
			String code1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code1 = Integer.parseInt(code1Str);
			
			System.out.println("Dime el mes de tu nacimiento");
			String code2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code2 = Integer.parseInt(code2Str);
			
			System.out.println("Dime el año de tu nacimiento");
			String code3Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code3 = Integer.parseInt(code3Str);
			
			int numero = code1+code2+code3;
			int resultado = 0;
	        
		while (numero > 0)
	        {
	            resultado += numero % 10;
	            numero = numero / 10;
	        }
			
		System.out.println("Tu número de la suerte es " + resultado); // He tenido que buscar por internet la fórmula. Preguntar si la forma es correcta y si se puede hacer con if, else if...
		
		}

	
	catch (Exception e){
		System.out.println("Error al introducir los números");
}
	
}
	
}
