import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08 {

public static void main (String[] args) {
		
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un número");
			String nStr = buffer.readLine();
			int n = Integer.parseInt(nStr);
			
			
			while (n>0){
				n--;
				if (n%2!=0) System.out.println(n); // != para sacar el NO es igual (hay que quitar un = y añadir !
			}

}
		
catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
}
}
}
