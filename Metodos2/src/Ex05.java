import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex05 {

	public void menu(){
		System.out.println("1. Mostrar muerte de la vida i.");
		System.out.println("2. Contar cuántas veces ha muerto de cada forma, y mostrar los resultados ordenados de mayor a menor.");
		System.out.println("3. Reiniciar el vector.");
		System.out.println("4. Salir.");

	}
	
	public void array (String[] array1, int[] arrayCont){
		try{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int contA=0;
		int contB=0;
		int contC=0;
		String ABC = "";
		
		System.out.println("Introduce de qué manera ha muerto el personaje.");
		for(int i=0; i<array1.length; i++){
			System.out.println("Personaje "+(i+1)+": Muerto por ataque enemigo(A), por caída(C) o por bomba(B)");
			//array1[i]= buffer.readLine();
			ABC = buffer.readLine();
			if(ABC.equals("A") || ABC.equals("B") || ABC.equals("C")){
				array1[i]= ABC;
				if(ABC.equals("A")) contA++;
				if(ABC.equals("B")) contB++;
				if(ABC.equals("C")) contC++;	
			}			
		}
		
	}
		catch (Exception e){
			System.out.println("error");
		}
		
	}
	
	public String[] arrayreset(String[] array1){
		array1=new String [5];
		return array1; //aquí SÍ hace falta retornarlo porque es una redeclaración
	}
	
	public void orden(int[] arrayCont){
		Arrays.sort(arrayCont, Collections.reverseOrder());
		for(int i=0; i<arrayCont.length; i++){
			
		}
	}
	
	public static void main(String[] args) {
		String [] array1=new String [5];
		int [] arrayCont=new int [3];
		
	}

}
