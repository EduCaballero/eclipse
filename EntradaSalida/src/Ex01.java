import java.io.*;

public class Ex01{

	public static void main(String[] args) {
 
		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Como te llamas?");
			String nombre = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			System.out.println("Hola " + nombre + "!");
			
			System.out.println("Dime tu edad");
			String edadStr = buffer.readLine();
			int edad = Integer.parseInt(edadStr); //esto es para pasar el string (texto) a número (integer)
			double valor = Double.parseDouble(edadStr); //lo mismo que el de arribo pero para decimales
			System.out.println("Tu edad es " + edad + " años");
		}
			
		catch (Exception e){
		
			System.out.println("Error al introducir tu nombre o tu edad");
				
		}	
	}
}