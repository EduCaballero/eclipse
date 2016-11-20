import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex17 {
	
	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime la nota que has sacado");
			String notaStr = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			double nota = Double.parseDouble(notaStr);
			//Suspens (0-4,99), Aprovat(5-6,99),Notable (7-8,99), Excel·lent(9-9,99) o Matrícula d’Honor (10)
			
			if (nota <= 4.99) System.out.println("Estás suspendido");
			if (nota >= 5 && nota <= 6.99) System.out.println("Estás aprovado");
			if (nota >= 7 && nota <= 8.99) System.out.println("Notable");
			if (nota >= 9 && nota <= 9.99) System.out.println("Excelente");
			if (nota == 10) System.out.println("Matrícula de Honor");
						
		}

	catch (Exception e){
		System.out.println("Error al introducir los números");
	}
	
}
}
