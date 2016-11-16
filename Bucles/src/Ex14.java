import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14 {
	
public static void main (String[] args) {
		
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			double n = 0;
			String nStr="0";
			double suma = 0;
			int cont = 0;
			
			while (n>=0) {
				System.out.println("Introduce un número positivo. Con negativo termina el programa");
				nStr = buffer.readLine();
				n = Double.parseDouble(nStr);
				
				if (n>=0) { 
					suma+=n;
					cont++;
				}
				
				if (n<0) {
					System.out.println("La media es de " + (suma/cont));
				}
					
				}
			}
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
				
}

}
