import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PasswordApp {
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int tamanyo=0;
			int longitud=0;
			
			
			System.out.println("Indica el tama�o del array password");
			tamanyo = Integer.parseInt(buffer.readLine());
			Password[] contrasenyas = new Password[tamanyo];
			boolean[] esFuerte = new boolean[tamanyo];
			
			System.out.println("Indica la longitud de los password");
			longitud = Integer.parseInt(buffer.readLine());
			
			
			for (int i=0;i<contrasenyas.length;i++){
				Password p1 = new Password(longitud);
				contrasenyas[i] = p1;
				esFuerte[i]=p1.esFuerte();
				System.out.println("La contrase�a es "+contrasenyas[i].getPassword()+" .esFuerte? "+esFuerte[i]);
			}
			
			
			

		} catch (Exception e) {
			System.out.println("Error al introducir los n�meros " + e);
		}
	}
}

/*	System.out.println(i);
	contrasenyas[i] = new Password();
	contrasenyas[i].setLongitud(longitud);
	contrasenyas[i].generarPassword();
	contrasenyas[i].esFuerte();
			
	System.out.println("La contrase�a en la posici�n "+i+" es: " + contrasenyas[i].getPassword());
	System.out.println("esFuerte: "+esFuerte[i]);*/
