import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07 {
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase");
			String palabra1Str = buffer.readLine();
						
			String var5 = palabra1Str.toUpperCase();
			System.out.println(var5); 
}


catch (Exception e){
	System.out.println("Error al introducir los n�meros " + e);
}
}
}