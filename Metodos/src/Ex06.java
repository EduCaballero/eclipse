import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex06 {
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una frase");
			String palabra1Str = buffer.readLine();
			
						
			//toLowerCase():Convierte todos los caracteres de una cadena a minúsculas.
			String var5 = palabra1Str.toLowerCase();
			System.out.println(var5); 

}


catch (Exception e){
	System.out.println("Error al introducir los nœmeros " + e);
}
}
}