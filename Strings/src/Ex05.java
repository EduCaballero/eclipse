import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {

public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase");
			String palabra1Str = buffer.readLine();
			
			// replace: Metodo que retorna un nuevo string resultado de reemplazar todas las 
			// ocurrencias de un caracter por otro caracter. 
			// Reemplaza todas las ocurrencias del caracter 'a' del string str12 por el caracter 'o'.
			String palabra1sStr  = palabra1Str.replace('a','e');
			System.out.println(palabra1sStr);

}


catch (Exception e){
	System.out.println("Error al introducir los nœmeros " + e);
}
}
}
