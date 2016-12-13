import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {

public static void main(String[] args) {
		
		try{
			
			int num;
			int[] numeros = new int[10]; // array numeros
			 
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce 10 números enteros");
			
			for(int i=0; i<numeros.length; i++){
				num = Integer.parseInt(buffer.readLine());
				numeros[i]=num;
			}
			
			for(int i : numeros) System.out.println(i);
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}

	}
	
}
