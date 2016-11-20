import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01 {

public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce una palabra y te diré la primera letra");
			String letra1Str = buffer.readLine();
			
			System.out.println(letra1Str.charAt(0));
	
}
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
		
}

}
