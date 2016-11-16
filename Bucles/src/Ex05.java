import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main (String[] args) {
		
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un n�mero");
			String nStr = buffer.readLine();
			int n = Integer.parseInt(nStr);
			
			int i = 1;
			int divisores = 0;
  
		while (i <= n) {
			
			if (n%i==0) divisores++;
			i++;
		}
		
		if (divisores<=2 && n>1) System.out.println("El n�mero es primo");
		else System.out.println("El n�mero NO primo");
		
		}
		
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros" + e);
		}
   	}
}