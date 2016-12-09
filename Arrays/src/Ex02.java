import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02 {
public static void main(String[] args) {
		
		try{
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Vamos a introducir 10 notas");
		    String nota_str = ""; // declaramos el string para leer los datos dentro del bucle
		    int nota = 0; // cada nota se guardará aquí
		    int[] notas = new int[10]; // array notas
		    double total=0;
		    int mayor= Integer.MIN_VALUE;
		    int menor= Integer.MAX_VALUE;
		    
		    for(int i=0; i<notas.length; i++){
		    	System.out.println("Introduzca las notas del alumno " + (i+1)); // con esto hago que me muestre el número del alumno, pero empezando desde el 1, aunque realmente el array se guarde en la posición empezando desde el 0
		        nota_str = buffer.readLine(); // con esto leemos los datos (el string)
		        nota = Integer.parseInt(nota_str); // pasamos el string a integer
		        total+=nota;
		        if (mayor<nota){
		        	mayor=nota;
		        }
		        if (menor>nota){
		        	menor=nota;
		        }
		        notas[i]=nota; //array notas[posicion]=nota que leemos del buffer.readline
		    }
		    
			System.out.println("");
			System.out.println("La nota media es de " + (total/10));
			System.out.println("");
			System.out.println("La nota mínima es " + menor);
			System.out.println("");
			System.out.println("La nota máxima es " + mayor);
		    for (int i=0; i<notas.length; i++){
				System.out.println(notas[i]);
			}
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
	}

}
