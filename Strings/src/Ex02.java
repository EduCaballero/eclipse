import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02 {
	
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una palabra");
			String palabra1Str = buffer.readLine();
			
			System.out.println("Introduce otra palabra");
			String palabra2Str = buffer.readLine();
			
			boolean  result = palabra1Str.contentEquals( palabra2Str );
            System.out.println(result);
			
			/*int var1=(palabra1Str.compareTo(palabra2Str));
			System.out.println(var1);  también podríamos hacerlo así */
	
}
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
		
}

}
