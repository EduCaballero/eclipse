package matrices;

public class Ex02 {
	public static void main(String[] args) {
		try {
/*Escriure un programa en Java que creï un array bidimensional de 5 files i 5 columnes. Cal que
la matriu contingui la posició de coordenades que ocupa en cada cas. Per exemple, en la
primera posició de l’array, el contingut serà: (0,0). En la segona posició de l’array, el contingut
serà: (0,1), i així consecutivament.*/
			
			//BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int [][] numeros = {{0,1,2,3,4}, {0,1,2,3,4}, {0,1,2,3,4}, {0,1,2,3,4}, {0,1,2,3,4}};
			
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
