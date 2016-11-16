import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PiedraPapelTijeras {
	
	public static void main (String[] args) {
		 
		try{
			System.out.println("Vamos a jugar a piedra, papel o tijeras");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Primer jugador; introduce piedra, papel o tijeras");
			String primero = buffer.readLine();
			
			System.out.println("Ahora el segundo jugador; introduce piedra, papel o tijeras");
			String segundo = buffer.readLine();
			//mejor hacerlo de esta forma que como lo hacía. Es más corto (mirar debajo)
			if (primero.equals("piedra")) {
				if (segundo.equals("tijeras")) System.out.println("Gana el primer jugador"); 
				else if (segundo.equals("papel")) System.out.println("Gana el segundo jugador");
				else if (segundo.equals("piedra")) System.out.println("Empate");
				else System.out.println("No has introducido piedra, papel o tijeras correctamente");
			}
			
			else if (primero.equals("papel")) {
				if (segundo.equals("tijeras")) System.out.println("Gana el segundo jugador"); 
				else if (segundo.equals("papel")) System.out.println("Empate");
				else if (segundo.equals("piedra")) System.out.println("Gana el primer jugador");
				else System.out.println("No has introducido piedra, papel o tijeras correctamente");
			}
			
			else if (primero.equals("tijeras")) {
				if (segundo.equals("tijeras")) System.out.println("Empate"); 
				else if (segundo.equals("papel")) System.out.println("Gana el primer jugador");
				else if (segundo.equals("piedra")) System.out.println("Gana el segundo jugador");
				else System.out.println("No has introducido piedra, papel o tijeras correctamente");
			}
			
			else System.out.println("No has introducido piedra, papel o tijeras correctamente");
			
			
			/*if (primerStr.equals("piedra") && segundoStr.equals("papel")) {
				System.out.println("Gana el segundo jugador");				
			}
			
			if (segundoStr.equals("piedra") && primerStr.equals("papel")) {
				System.out.println("Gana el primer jugador");				
			}
			
			if (primerStr.equals("tijera") && segundoStr.equals("papel")) {
				System.out.println("Gana el primer jugador");				
			}
			
			if (segundoStr.equals("tijera") && primerStr.equals("papel")) {
				System.out.println("Gana el segundo jugador");				
			}
			
			if (primerStr.equals("piedra") && segundoStr.equals("papel")) {
				System.out.println("Gana el segundo jugador");				
			}
			
			if (segundoStr.equals("piedra") && primerStr.equals("papel")) {
				System.out.println("Gana el primer jugador");				
			}*/
			

}
		catch (Exception e){
			System.out.println("Error al introducir los números");
		}
		
	}
	
}
