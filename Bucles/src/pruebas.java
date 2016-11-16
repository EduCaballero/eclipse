import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pruebas {
	
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce un número de 5 cifras");
			String NStr = buffer.readLine();
			int N = Integer.parseInt(NStr);		
			int div=10000;
			for (int i=0;i<5; i++) {
				System.out.println(N/div);				
				div= div/10;
			}
			/*	
			
			for (int i = 0; i <= 5 && N<=99999; i++) {
				if (N >= 10000){
					System.out.println(N/10000);
				}
				if (N >= 1000){
					System.out.println(N/1000);
				} 
				if (N >= 100){
					System.out.println(N/100);
				}
				if (N >= 10){
					System.out.println(N/10);
				}
				System.out.println(N);
					
				
				/*if (N >= 10000){    aislar los números
					 	 a = N / 10000;
						 b = (N % 10000) / 1000;
						 c = (N % 10000) % 1000 / 100;
						 d = ((N % 10000) % 1000) % 100 / 10;
						 e = (((N % 10000) % 1000) % 100) % 10;*/
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);

				}
	
		
}

}
