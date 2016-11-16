import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pizzas {
	
	public static void main (String[] args) {
		 
		try{
			System.out.println("Vamos a pedir una pizza");
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));			
			System.out.println("Dime si quieres una pizza mediana o una familiar");
			String pizza = buffer.readLine();
			
			System.out.println("¿Cuántos ingredientes extra quieres? Si no quieres ninguno, introduce 0. El número máximo de ingredientes es de 6");
			String ingStr = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int ing = Integer.parseInt(ingStr);
			
			System.out.println("¿Quieres extra de queso? Introduce si/no");
			String cheese = buffer.readLine();
			
			if (pizza.equals("mediana")) {
				if (cheese.equals("si")) System.out.println("El coste de tu pizza es de " + (4+2+ing*1));
				else System.out.println("El coste de tu pizza es de " + (4+ing*1));
			}
			
			else if (pizza.equals("familiar")) {
				if (cheese.equals("si")) System.out.println("El coste de tu pizza es de " + (9+3+ing*2));
				else System.out.println("El coste de tu pizza es de " + (9+ing*2));
			}
			
			else System.out.println("No has introducido bien la comanda");
			
		}
			
			catch (Exception e){
				System.out.println("Error al introducir los números");
			}	

}
	
}
