import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex09 {
	
	public static void main (String[] args) {
	
	try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int media = 0;
		String nStr="0";
		int cont = 0;
		
	while (n!=999) {
		
		System.out.println("Introduce un n�mero");
		nStr = buffer.readLine();
		n = Integer.parseInt(nStr);
	
		if(n!=999){
		
		if (n>max) max=n;
		if (n<n) min=n;
		media+=n;
		cont++;
		
		}
		
		else System.out.println("Fin del programa");		

}
	System.out.println("El n�mero m�ximo es " + max );
	System.out.println("El n�mero m�nimo es " + min );
	System.out.println("la media es " + (media/cont) );
	
	}
	catch (Exception e){
		System.out.println("Error al introducir los n�meros " + e);
}
}
}

