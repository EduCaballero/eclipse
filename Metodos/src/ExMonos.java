import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExMonos {
	public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			String accStr="";
			int acc=1;
			double pesogorilamax = Double.MIN_VALUE;
			String pesogorilamaxStr="";
			double pesogorilamin = Double.MAX_VALUE;
			String pesogorilaminStr="";
			double pesochimpmax = Double.MIN_VALUE;
			String pesochimpmaxStr="";
			double pesochimpmin = Double.MAX_VALUE;
			String pesochimpminStr="";
			int edadgorilamax = Integer.MIN_VALUE;
			String edadgorilamaxStr="";
			int edadgorilamin = Integer.MAX_VALUE;
			String edadgorilaminStr="";
			int edadchimpmax = Integer.MIN_VALUE;
			String edadchimpmaxStr="";
			int edadchimpmin = Integer.MAX_VALUE;
			String edadchimpminStr="";
			String acc2Str ="";
			int acc2 = 0;
			String ingStr = "";
			int ing = 0;
			
			while (acc!=0) {
			
			System.out.println();
			System.out.println("-----------MEN� PRINCIPAL--------------");
			System.out.println("[1] - REGISTRAR INGRESOS");
			System.out.println("[2] - ESTAD�STICAS");
			System.out.println("[3] - REINICIAR");
			System.out.println("[0] - SALIR");
			System.out.println("---------------------------------------");
			System.out.println();
			System.out.println("ELIJA OPCI�N:");
			accStr = buffer.readLine();
			acc = Integer.parseInt(accStr);

			if (acc==1) {
				
				System.out.println("INTRODUZCA CU�NTOS INGRESOS QUIERE REALIZAR:");
				ingStr = buffer.readLine();
				ing = Integer.parseInt(ingStr);
				
				for (int i=0; i<ing; i++) {
				System.out.println("ELIJA TIPO DE MONO. [1] CHIMPANC� - [2] GORILA");
				acc2Str = buffer.readLine();
				acc2 = Integer.parseInt(acc2Str);
				
				
				while (acc2!=1 || acc2!=2) {
					System.out.println("TIPO ERR�NEO. ELIJA TIPO DE MONO. [1] CHIMPANC� - [2] GORILA");
					acc2Str = buffer.readLine();
					acc2 = Integer.parseInt(acc2Str);
				}
				
				if (acc2==1) {
					System.out.println("Introduzca la edad del chimpanc�. Debe estar entre 0 y 50 a�os");
					edadchimpmaxStr = buffer.readLine();
					edadchimpmax = Integer.parseInt(edadchimpmaxStr);
					
					while (edadchimpmax<0 && edadchimpmax>50) {
						System.out.println("Edad err�nea. Introduzca la edad del chimpanc�. Debe estar entre 0 y 50 a�os");
						edadchimpmaxStr = buffer.readLine();
						edadchimpmax = Integer.parseInt(edadchimpmaxStr);
					}
					
					
				}
				
				if (acc2==2) {
					
				}
					
				}
				
			}
			
			}
}
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		}
		}
