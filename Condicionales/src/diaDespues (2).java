import java.io.BufferedReader;
import java.io.InputStreamReader;

public class diaDespues {
	
	public static void main (String[] args) {
		 
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce el mes en cifras");
			String diaStr = buffer.readLine();
			int dia = Integer.parseInt(diaStr);
			
			System.out.println("Introduce el mes en cifras");
			String mesStr = buffer.readLine();
			int mes = Integer.parseInt(mesStr);
			
			System.out.println("Introduce el año en cifras");
			String anyStr = buffer.readLine();
			int any = Integer.parseInt(anyStr);
			
			

}
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
		
	}
	
}
