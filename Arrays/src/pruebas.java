import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pruebas {

	public static void main(String[] args){
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int [] n= new int[10];
			int c=0;
			int contador=0;
			
			System.out.println("Introduce 10");
			for(int i=0;i<n.length;i++){
				n[i]=	Integer.parseInt(buffer.readLine());{
					if (n[i] ==0){
						c++;
					}
				}
			}

			for(int i=0;i<n.length;i++){
				System.out.print(n [i]+" ");
			}
			System.out.println();
			int j=0;
			int [] m= new int [10-c];
			for(int i=0;i<n.length;i++){
				if (n[i] !=0 ){
					m[j]=n[i];
					j++;
				}
			}

			for(int i=0;i<m.length;i++){
				System.out.print(m [i]+" ");
			}
			
			for(int i=0;i<m.length-1;i++){
				if (m[i]<0 && m[i+1]>0 || m[i]>0 && m[i+1]<0){
					contador++;
				}
			}
			
			System.out.println("Hay " + contador + " cambios de signo");

		}
		catch (Exception e){

			System.out.println("Error " + e);
		}

	}
}