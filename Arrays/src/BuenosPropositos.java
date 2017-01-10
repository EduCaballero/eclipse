import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BuenosPropositos {
public static void main(String[] args) {
		
		try{
			
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
		int opt=0;
		ArrayList<Integer> minutosEjer = new ArrayList<Integer>();
		ArrayList<String> diasSemana = new ArrayList<String>();
		diasSemana.add("lunes");
		diasSemana.add("martes");
		diasSemana.add("mi�rcoles");
		diasSemana.add("jueves");
		diasSemana.add("viernes");
		diasSemana.add("s�bado");
		diasSemana.add("domingo");		
		// System.out.println(diasSemana); con esto comprobar�a si funciona los datos que he metido anteriormente en el array diasSemana
		ArrayList<Integer> piezasConsumidas = new ArrayList<Integer>();
		ArrayList<Integer> horasProd = new ArrayList<Integer>();
		int sumaejercicio=0;
		boolean mas45=true;


		
		System.out.println("Este programa va a ayudarte con la realizaci�n de los propositos que tienes para este a�o");
		System.out.println();
		
		while (opt!=8){
			
			System.out.println("Pulsa el n�mero correspondiente para seleccionar la opci�n:");
			System.out.println();
			System.out.println("===============================================================");
			System.out.println();
			System.out.println("1. Prop�sito hacer ejercicio:");
			System.out.println();
			System.out.println("2. Prop�sito alimentarse bien:");
			System.out.println();
			System.out.println("3. Prop�sito aprovechar el tiempo y trabajar m�s:");
			System.out.println();
			System.out.println("4. Valorar ejercicio hecho:");
			System.out.println();
			System.out.println("5. Valorar alimentaci�n:");
			System.out.println();
			System.out.println("6. Valorar productividad de cada d�a:");
			System.out.println();
			System.out.println("7. Valoraci�n general:");
			System.out.println();
			System.out.println("8. Salir:");
			System.out.println();
			System.out.println("Elije una opci�n:");
			opt= Integer.parseInt(buffer.readLine());
			
			if (opt>8 || opt<=0) {
				System.out.println("Error. Opci�n no v�lida");
				System.out.println();
			}
			
			if (opt==8) System.out.println("��nimo, t� puedes!");
			
			if (opt==1){
				System.out.println("A continuaci�n introduce los minutos de ejrecicio que has realizado durante la semana.");
				
				for(int i = 0;i<diasSemana.size();i++){
					 System.out.println("Minutos que has hecho de ejercicio el " + diasSemana.get(i));
					 minutosEjer.add(Integer.parseInt(buffer.readLine()));
					 if (minutosEjer.get(i)<45){
						 mas45=false;
					 }
					}
				
				// System.out.println(minutosEjer); ---- esto lo he usado para comprobar los datos----
				
				/*///////////////for (int i= 0; i<7; i++){ sucio, no vale!!!!!!!
					/////////////minutosEjer[i]= Integer.parseInt(buffer.readLine()); // con esto recorremos el array entero metiendo datos
					/////////////}*/
			}
			
			if (opt==2){
				System.out.println("A continuaci�n introduce las piezas de fruta y verdura consumidas cada d�a de la semana");
				
				for(int i = 0;i<diasSemana.size();i++){
					 System.out.println("Cantidad de piezas de fruta y verdura consumidas el " + diasSemana.get(i));
					 piezasConsumidas.add(Integer.parseInt(buffer.readLine()));
					}				
			}
			
			if (opt==3){
				System.out.println("A continuaci�n introduce la cantidad de horas productivas que has tenido durante la semana");
				
				for(int i = 0;i<diasSemana.size();i++){
					 System.out.println("N�mero de horas productivas el " + diasSemana.get(i));
					 horasProd.add(Integer.parseInt(buffer.readLine()));
					}				
			}
			
			if (opt==4){
				/*Valorar ejercicio hecho: En esta opci�n evaluaremos el ejercicio semanal con una
				valoraci�n. Si el n�mero de horas de ejercicio durante toda la semana es superior a 7, y
				adem�s, todos los d�as se han hecho al menos 45 minutos de ejercicio, la valoraci�n ser�
				positiva, en caso contrario, ser� negativa. Esta informaci�n se deber� mostrar con un
				mensaje por pantalla*/
				
				
			}
			
		}
		        
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		
	}
	
}