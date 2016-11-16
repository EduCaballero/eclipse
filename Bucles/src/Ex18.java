import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex18 {
	public static void main (String[] args) {
	
	try{
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un número de 5 cifras");
		String NStr = buffer.readLine();
		int N = Integer.parseInt(NStr);		
		int modulo=10;
		
		if (N>10000 && N<99999) {
		for (int i=0;i<5; i++) {
			System.out.println(N%modulo);				
			modulo= modulo*10;
		}
		
		
		
		}
		
		else System.out.println("Vuelve a leer!");
				
			// para sacar el ultimo se saca con el moduloo 564564564%10
			/*if (N >= 10000){    aislar los números
				 	 a = N / 10000;
					 b = (N % 10000) / 1000;
					 c = (N % 10000) % 1000 / 100;
					 d = ((N % 10000) % 1000) % 100 / 10;
					 e = (((N % 10000) % 1000) % 100) % 10;*/
	}

	
	catch(

	Exception e)
	{
		System.out.println("Error al introducir los nœmeros " + e);
	}

}

}
