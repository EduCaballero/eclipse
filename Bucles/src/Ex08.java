import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08 {

public static void main (String[] args) {
		
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un n�mero");
			String nStr = buffer.readLine();
			int n = Integer.parseInt(nStr);
			
			
			while (n>0){
				n--;
				if (n%2!=0) System.out.println(n); // != para sacar el NO es igual (hay que quitar un = y a�adir !
			}

}
		
catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
}
}
}
