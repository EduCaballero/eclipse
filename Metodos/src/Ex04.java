import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {
	
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase");
			String palabra1Str = buffer.readLine();
			
			int var1 = palabra1Str.length();
			System.out.println("Longitud de la cadena: '" + palabra1Str + "' és " + var1);

}


catch (Exception e){
	System.out.println("Error al introducir los nœmeros " + e);
}
}
}
