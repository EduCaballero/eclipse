import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex08 {
	public static void main(String[] args) throws IOException {
		
		/*8. Declarar una matriu de 5x5 posicions. S�han de localitzar el seu nombre m�xim i el seu nombre
			m�nim i intercanviar les seves posicions. Versi� f�cil: intercanviar nom�s la primera ocurr�ncia.
			Versi� avan�ada: intercanviar totes les ocurr�ncies. Ex08.java*/
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int [][] matriz = new int[5][5];
		
		int max = 0;
		int min = 10;
		int maxsavei = 0;
		int maxsavej = 0;
		int minsavei = 0;
		int minsavej = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.println("Coloca valor en: ("+i+","+j+") de la matriz 1");
				String op = buffer.readLine();
				int user = Integer.parseInt(op);
				
				if(max<user){
					maxsavei=i;
					maxsavej=j;
					max=user;
				}
				else if(min>user){
					minsavei=i;
					minsavej=j;
					min=user;
				}
				
				matriz[i][j]=user;
			}  
			System.out.println ("");
		} 
		
		matriz[maxsavei][maxsavej]=min;
		matriz[minsavei][minsavej]=max;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print (matriz[i][j]+"|");
			}  
			System.out.println ("");
		}
		
	}
}