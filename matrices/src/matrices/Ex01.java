package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) {
		try {
/*Escriure un programa en Java que creï un array bidimensional de 5 files i 5 columnes. Cal que
la matriu contingui 25 cops el nombre 5.*/
			
			//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int [][] numeros = {{5,5,5,5,5}, {5,5,5,5,5}, {5,5,5,5,5}, {5,5,5,5,5}, {5,5,5,5,5}};
			
			//¿Cómo haría un bucle para ir introduciendo cincos sucesivamente?
			
			for (int i = 0; i < numeros.length; i++) {
				
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
