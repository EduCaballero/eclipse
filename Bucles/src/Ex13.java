import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex13 {
	
public static void main (String[] args) {
		
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			int n = 1;
			String nStr="0";
			
			while (n!=0) {
				System.out.println("Introduce un n�mero positivo o negativo. Con 0 termina el programa");
				nStr = buffer.readLine();
				n = Integer.parseInt(nStr);
			if (n>0) System.out.println("El n�mero introducido es positivo");
			
			else if (n<0) System.out.println("El n�mero introducido es negativo");
			
			else System.out.println("Fin del programa");
				
			}
			
			
			}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
	}
				
			}
			

}
