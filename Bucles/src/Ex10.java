import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10 {
	
	public static void main (String[] args) {
		
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			int x = (int) (100*Math.random()+1);
			int n = 0;
			String nStr="0";
			
			while (x!= n) {
				
				System.out.println("¡Prueba suerte! Introduce un número");
				nStr = buffer.readLine();
				n = Integer.parseInt(nStr);
				
				if (n>x) {
					System.out.println("¡Te has pasado!");
				}
				
				if (n<x) System.out.println("¡Te has quedado corto!");

}
			
			if (x==n) System.out.println("¡Felicidades, has acertado! El número correcto era el " + x);
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
		
	}
	
}

