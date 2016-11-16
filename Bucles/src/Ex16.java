import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex16 {
	
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce el número de sueldos que vas a introducir");
			String totsStr = buffer.readLine();
			int tots = Integer.parseInt(totsStr);
			
			String nStr="0";
			int n = 0;
			int max = Integer.MIN_VALUE;
			
			 for (int i = 0; i < tots; i++) {
				 System.out.println("Introduce sueldo");
					nStr = buffer.readLine();
					n = Integer.parseInt(nStr);
					if (max<n) {
						max=n;
					}
					
				System.out.println("El sueldo máximo es " + max); // Con el sys.out dentro del bucle siempre sabemos el sueldo max, si no quisieramos saberlo hasta el final, hay que ponerlo fuera del bucle.
			 }
			 
			 
				 
			 }
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
			

}

}
