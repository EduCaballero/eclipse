package matrices;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) {
		try {
/*Escriure un programa en Java que cre� un array bidimensional de 4 files i 4 columnes. Cal que
l�usuari ompli per teclat el contingut de cadascuna de les seves posicions.*/
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int [][] numeros = new int[4][4];
			
			
			for (int i = 0; i < numeros.length; i++) { //creo bucle para meter datos.
				
				for (int j = 0; j < numeros[i].length; j++) {
				
					System.out.print ("Introduce un valor:");
					numeros[i][j]= Integer.parseInt(buffer.readLine()); // con esto hago que se meta el valor introducido por teclado en cada posici�n
				  
				} 
				  
				System.out.println ("");
				
			}
			
			for (int i = 0; i < numeros.length; i++) { //creo bucle para mostrar los datos
				
				for (int j = 0; j < numeros[i].length; j++) {
				
					System.out.print (numeros[i][j]);
				  
				} 
				  
				System.out.println ("");
				
			} 
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
