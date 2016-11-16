import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15 {
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un entre el 0 y el 99999");
			String nStr = buffer.readLine();
			int n = Integer.parseInt(nStr);
			
			int cont = 0;
			
			if (n>=0 && n<=99999) {
			while (n!=0) {
				n = n/10;
				cont++;
			}
			
			System.out.println("El número introducido tiene " + cont + " cifras");
				
			}
			
			else System.out.println("¡No has puesto las cifras que te he pedido! :S");
			
			}
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
				
			}
}
