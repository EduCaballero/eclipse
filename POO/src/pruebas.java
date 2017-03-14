import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner; 

public class personaApp {

	public static void main(String[] args) {

		try{
			char nombreVariable;
			
			//(int dniNuevo, String nombre, int edad, char sexo, double peso, double altura)
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			Scanner teclado = new Scanner(System.in);
			// Introducir la primera con valores pedidos por teclado 
			//Primero hay que crearlo
			persona persona1 = new persona();

			/*nStr = buffer.readLine();
			  n = Double.parseDouble(nStr);*/
			
			System.out.println("Nombre?");
			persona1.setNombre(buffer.readLine());
			//System.out.println(persona1.getNombre()); Con esto mostraríamos lo que hemos metido

			System.out.println("Edad?");
			persona1.setEdad(Integer.parseInt(buffer.readLine()));

			System.out.println("Sexo? Introduce H ó M. (Hombre ó Mujer");
			nombreVariable = teclado.next().charAt(0);
			persona1.setSexo(nombreVariable);
			
			System.out.println("Peso?");
			persona1.setPeso(Double.parseDouble(buffer.readLine()));
			
			System.out.println("Altura? (en metros)");
			persona1.setAltura(Double.parseDouble(buffer.readLine()));
			
			System.out.println("Generando tu DNI automáticamente");
			System.out.println("Tu DNI generado es: "+persona1.getDni());



		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}