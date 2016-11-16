import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex03 {
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase");
			String palabra1Str = buffer.readLine();
			
			System.out.println("Introduce otra frase");
			String palabra2Str = buffer.readLine();
	
			palabra1Str = palabra1Str.concat(" " + palabra2Str);
			System.out.println(palabra1Str);
			
}
		


catch (Exception e){
	System.out.println("Error al introducir los nœmeros " + e);
}
}
}
