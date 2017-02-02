import java.io.*;
import java.util.*;

public class ex15 {
	
	public static void main (String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Longitud de la pista?");
			int [] track = new int[Integer.parseInt(buffer.readLine())];
			System.out.println("Cuantas hormigas participan?");
			int hormigas = Integer.parseInt(buffer.readLine());
			int pos;
			for (int i=0;i<hormigas;i++) {
				System.out.println("Posicion de la hormiga "+(i+1));
				pos=Integer.parseInt(buffer.readLine());
				while (pos<1 || pos>track.length || track[pos-1]==1) {
					System.out.println("Posicion Incorrecta");
					System.out.println("Posicion de la hormiga "+(i+1));
					pos=Integer.parseInt(buffer.readLine());
				}
				track[pos-1]=1;
			}
			int size=track.length-1;
			int maxDist=0;
			int minDist=0;
			for (int i=0;i<=size;i++) 
				if (track[i]==1) {
					if (Math.max(i,size-i)>maxDist) maxDist=Math.max(i,size-i);
					if (Math.min(i,size-i)>minDist) minDist=Math.min(i,size-i);
				}
			System.out.println("Como maximo tardara "+maxDist+" segundos");
			System.out.println("Como minimo tardara "+minDist+" segundos");
		}
		catch (Exception e){
			System.out.println("Error al introducir los datos");
		}
	}		
}