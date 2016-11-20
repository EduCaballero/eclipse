import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PracticaSandias {
	
	public static void main (String[] args) {
		 
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("¿Cuántas sandías tiene el agricultor 1?");
			String ag1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int ag1 = Integer.parseInt(ag1Str);
			
			System.out.println("¿Qué precio tienen?");
			String pr1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int pr1 = Integer.parseInt(pr1Str);
			
			System.out.println("¿Cuántas sandías tiene el agricultor 2?");
			String ag2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int ag2 = Integer.parseInt(ag2Str);
			
			System.out.println("¿Qué precio tienen?");
			String pr2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int pr2 = Integer.parseInt(pr2Str);
			
			System.out.println("¿Cuánto quieres gastar?");
			String monStr = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int mon = Integer.parseInt(monStr);
			
			if (pr1<pr2) {
				int san1=mon/pr1; System.out.println("A este agricultor le podrás comprar " + san1 + " sandías");
				mon-=san1*pr1; // mon = mon-san1*pr1
				
			}
			
		}

}
