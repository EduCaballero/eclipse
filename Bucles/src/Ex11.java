import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11 {
	
	public static void main (String[] args) {
		
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			int x = (int) (100*Math.random()+1);
			int n = 0;
			String nStr="0";
			
			 for (int i = 1; i < 11 && n!=x; i++) {
				
				System.out.println("¡Prueba suerte! Introduce un número");
				nStr = buffer.readLine();
				n = Integer.parseInt(nStr);
				
				if (n>x) {
					System.out.println("¡Te has pasado!");
				}
				
				if (n<x) System.out.println("¡Te has quedado corto!");
				
				System.out.println("Llevas " + i + " intentos");
				
				if (n==x)  System.out.println("¡Felicidades, has acertado!");
				
}
			 System.out.println("El número correcto era " + x);
			

			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
		
	}
	
}

