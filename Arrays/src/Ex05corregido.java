import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05corregido {
	public static void main(String[] args) {

		try{

			//creamos un buffer de lectura
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			int[]n=new int[10];
			int c=0;
			int j=0;

			for (int i= 0; i<n.length; i++){
				n[i]= Integer.parseInt(buffer.readLine()); // con esto recorremos el array entero metiendo datos
				if(n[i]==0){
					c++;
				}
			}

			for(int i=0;i<n.length;i++){
				System.out.println(n [i]+ " "); // con esto mostramos el array
			}

			System.out.println();
			
			int [] m= new int [10-c];
			
			for(int i=0; i<n.length;i++){  
				if (n[i] !=0){				//si lo del array original no es un 0
					m[j]=n[i];
					j++;
				}
			}

			for(int i=0;i<m.length;i++){
				System.out.println(m [i]+ " "); // con esto mostramos el array
			}

		}

		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}

	}

}