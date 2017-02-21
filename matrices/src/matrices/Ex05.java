package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {

	/*Escriure un programa en Java que creï un array bidimensional de 4 files i 3 columnes. Inserir el
contingut que indiqui l’usuari per teclat en cadascuna de les seves posicions. El programa
haurà de sumar cadascun dels valors de cada posició de l’array i mostrar en resultat per
pantalla
RESULTADO TOTAL DE LOS NUMEROS*/
	public static void main(String[] args) {
		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int [][] numeros = new int[4][3];
			int resultado=0;
			
			
			for (int i = 0; i < numeros.length; i++) { //creo bucle para meter datos.
				
				for (int j = 0; j < numeros[i].length; j++) {
				
					System.out.print ("Introduce un valor:");
					numeros[i][j]= Integer.parseInt(buffer.readLine()); // con esto hago que se meta el valor introducido por teclado en cada posición
				  resultado=resultado + numeros[i][j]; //con esto sumo el resultado (número anterior) y el de la posición actual 
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

