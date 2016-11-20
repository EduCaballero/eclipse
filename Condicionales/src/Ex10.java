import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10 {	

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Vamos a calcular el porcentaje de descuento");
			System.out.println("Dime el importe que ha gastado el cliente");
			String importeStr = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double importe = Double.parseDouble(importeStr);
			System.out.println("Me has dicho que el cliente ha gastado " + importe + "!");
			
			if (importe<=25) System.out.println("No podemos hacerte descuento porque sólo has gastado " + importe);			
			
			
			if (importe>25) { 
				importe = (importe*10)/100;	System.out.println("Hacemos el 10% de descuento y el importe total es de " + importe);			
			}
			
			if (importe>50) { 
				importe = (importe*15)/100;	System.out.println("Hacemos el 15% de descuento y el importe total es de " + importe);			
			}
			
			if (importe>100) { 
				importe = (importe*30)/100;	System.out.println("Hacemos el 30% de descuento y el importe total es de " + importe);			
			}
		}
			
			catch (Exception e){
				System.out.println("Error al introducir los números");
		}
			
		}
		
	}
	
