import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PracticaSandias {
	
	public static void main (String[] args) {
		 
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�Cu�ntas sand�as tiene el agricultor 1?");
			String sandias1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int sandias1 = Integer.parseInt(sandias1Str);
			
			System.out.println("�Qu� precio tienen?");
			String pr1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int pr1 = Integer.parseInt(pr1Str);
			
			System.out.println("�Cu�ntas sand�as tiene el agricultor 2?");
			String sandias2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int sandias2 = Integer.parseInt(sandias2Str);
			
			System.out.println("�Qu� precio tienen?");
			String pr2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int pr2 = Integer.parseInt(pr2Str);
			
			System.out.println("�Cu�nto quieres gastar?");
			String dineroStr = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int dinero = Integer.parseInt(dineroStr);
			
			if (pr1<pr2) {
			int cant1=dinero/pr1; // cantidad que puedo comprar
			
				if (cant1>sandias1) {
					dinero-=cant1*pr1;  // dinero = dinero-san1*pr1
					int cant2=dinero/pr2; 
				
					if (sandias2>=cant2) System.out.println("Vas a poder comprar " + (cant1+cant2));
						
					}
				else if (cant1<sandias1) System.out.println("Vas a poder comprar " + cant1);
				}
			
			if (pr2<pr1) {
				int cant2=dinero/pr2;
				
					if (cant2>sandias2) {
						dinero-=cant2*pr2;  // dinero = dinero-san1*pr1
						int cant1=dinero/pr1; 
					
						if (sandias1>=cant1) System.out.println("Vas a poder comprar " + (cant1+cant2));
							
						}
					else if (cant2<sandias2) System.out.println("Vas a poder comprar " + cant2);
					}
			if (pr1==pr2) {
				int sandias3=sandias2+sandias1;
				int cantt=dinero/pr1;
				if (cantt<=sandias3) System.out.println("Vas a poder comprar " + (sandias3-cantt));
				else System.out.println("Vas a poder comprar " + sandias3);
			}
			
			}
		catch (Exception e){
			System.out.println("Error al introducir los n�meros");
		}
			
		}

}
