import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Collator;

public class prueba {
public static void main (String[] args) {
		// : Nom, Cognoms, any de naixement, nota mitja del cicle
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce tu nombre");
			String nom = buffer.readLine();
			
			System.out.println("Introduce tus apellidos");
			String ape = buffer.readLine();
			
			System.out.println("Introduce tu año de nacimiento");
			String any = buffer.readLine();
			
			
			System.out.println("Introduce la nota media del ciclo");
			String nota = buffer.readLine();
			
			
		Collator comparador = Collator.getInstance();
		comparador.setStrength(Collator.PRIMARY);
		System.out.println(comparador.compare(nom, ape));
	
}
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
		}
		}
