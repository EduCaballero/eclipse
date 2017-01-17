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
		int sumaejerciciohoras=0;
		boolean mas45=true;
		int contsinejer=0;
		int contsinfruta=0;
		int contsinprod=0;
		int conttotal=0;
		int frutatotal=0;
		int frutamedia=0;
		int diamaxconsumo=Integer.MIN_VALUE;
		int diamaxconsumovalor=0;
		int diaminconsumo=Integer.MAX_VALUE;
		int diaminconsumovalor=Integer.MAX_VALUE;
		ArrayList<Integer> productividad = new ArrayList<Integer>();
		ArrayList<Integer> productividad2 = new ArrayList<Integer>();
		ArrayList<Integer> productividad3 = new ArrayList<Integer>();
		ArrayList<Integer> productividadtotal = new ArrayList<Integer>();
		int horasProdtotal=0; //ya no lo uso, era para hacerlo sin array
		int productividadsumar=0;
		//int contgeneral=0;
		//boolean valoracionejer=false;
		//boolean valoracionefruta=false;
		//boolean valoracioneprod=false;

		
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
					 sumaejercicio+=minutosEjer.get(i);
					 if (minutosEjer.get(i)<45){
						 mas45=false;
						 productividad.add(i, 0); //�ste no me har�a falta haci�ndolo de la otra forma, pero con esta me queda m�s claro
					 }
					 if (minutosEjer.get(i)>=45){
						 productividad.add(i, 2);
					 }
					 if(minutosEjer.get(i)==0){
						 contsinejer++;
					 }
					}
				if (contsinejer<=2){
					conttotal++;
					//valoracionejer=true; esto era para sacar tb el nombre de los propositos cumplidos, pero no lo pide el programa
				}
				sumaejerciciohoras=0; //con esto hago que se vuelva a poner a cero por si acaso el usuario quiere volver a introducir los dias de la semana por alg�n error
				sumaejerciciohoras=sumaejercicio/60; //con esto lo transformo en horas
				//System.out.println(minutosEjer); //-------BORRAR
				//System.out.println(sumaejerciciohoras);
				//System.out.println(productividad);
				//System.out.println("contador total " + conttotal);
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
					 frutatotal+=piezasConsumidas.get(i);
					 if (diamaxconsumovalor<piezasConsumidas.get(i)){ //(diamaxconsumo<piezasConsumidas.get(i)){ esto ya no vale
						 diamaxconsumo=i;
						 diamaxconsumovalor=piezasConsumidas.get(i);
					 }
					 if (diaminconsumovalor>piezasConsumidas.get(i)){
						 diaminconsumo=i;
						 diaminconsumovalor=piezasConsumidas.get(i);
					 }
					 if(piezasConsumidas.get(i)<5){
						 productividad2.add(0);
					 }
					 if(piezasConsumidas.get(i)>=5){
						 productividad2.add(2);
					 }
					 if(piezasConsumidas.get(i)==0){
						 contsinfruta++;
					 }
					}
				if(contsinfruta==0){
					conttotal++;
					//valoracionefruta=true; esto era para sacar tb el nombre de los propositos cumplidos, pero no lo pide el programa
				}
				//System.out.println(piezasConsumidas);// BORRAR
				//System.out.println("dia max consumo" + diamaxconsumo);
				//System.out.println("dia min consumo" + diaminconsumo);
				//System.out.println(productividad2);
				//System.out.println("contador total " + conttotal);
				frutamedia=frutatotal/7;
			}
			
			if (opt==3){
				System.out.println("A continuaci�n introduce la cantidad de horas productivas que has tenido durante la semana");
				
				for(int i = 0;i<diasSemana.size();i++){
					 System.out.println("N�mero de horas productivas el " + diasSemana.get(i));
					 horasProd.add(Integer.parseInt(buffer.readLine()));
					 horasProdtotal+=horasProd.get(i); //no est� en uso, era para hacerlo sin tener que crear 3 array
					 if(horasProd.get(i)<8){
						 productividad3.add(0);
					 }
					 if(horasProd.get(i)==8){
						 productividad3.add(1);
					 }
					 if(horasProd.get(i)>8){
						 productividadsumar=(horasProd.get(i)-8)+1;
						 productividad3.add(productividadsumar);
					 }
					}
				//System.out.println(horasProd);//BORRAR
				//System.out.println("horas prod total" + horasProdtotal);
				//System.out.println(productividad3);
				
			}
			
			if (opt==4){				
				if (sumaejerciciohoras>7 && mas45==true){
					System.out.println("Valoraci�n positiva. �Est�s hecho un campe�n! Esta semana has hecho " + sumaejerciciohoras + " horas de ejercicio y 45 min. m�nimo cada d�a.");
				}
				if (sumaejerciciohoras<=7 || mas45==false){
					System.out.println("Valoraci�n negativa. �Tienes que trabajar m�s!");				
				}
			}
			
			if (opt==5){
				System.out.println("La media de piezas de fruta y verdura consumidas esta semana es de " + frutamedia);
				System.out.println("El d�a que m�s fruta y verdura has consumido ha sido el " + diasSemana.get(diamaxconsumo));
				System.out.println("El d�a que menos fruta y verdura has consumido ha sido el " + diasSemana.get(diaminconsumo));
				System.out.println();
			}
			
			if (opt==6){ //estos dos bucles se pueden juntar en uno, ya que tienen el mismo tama�o(size) pero lo dejo en dos para entender mejor los pasos si tengo que repasar
				for (int i = 0; i < productividad.size(); i++) { //con esto sumo los 3 arrays y guardo el resultado en otro array llamado productividadtotal
			        productividadtotal.add(productividad.get(i) + productividad2.get(i) + productividad3.get(i));
				}
				for(int i = 0;i<diasSemana.size();i++){
					if (productividadtotal.get(i)<5){
						contsinprod++;
					}
					 System.out.println("El  " + diasSemana.get(i) + " tienes " + productividadtotal.get(i) + " puntos de productividad");
				}
				if (contsinprod==0){
					conttotal++;
				}
				//System.out.println("contador total " + conttotal);
			}
			
			if(opt==7){ //se podr�a hacer m�s corto utilizando un mensaje gen�rico y el conttotal
				if (conttotal==3) System.out.println("�Felicidades, has cumplido los 3 propositos! �A por el Toblerone!");
				if (conttotal==2) System.out.println("�Felicidades, has cumplido 2 de los 3 propositos! �A por un par de onzas de Toblerone!");
				if (conttotal==1) System.out.println("Debes esforzarte m�s, s�lo has cumplido 1 de los 3 propositos.");
				if (conttotal==0) System.out.println("Eres un desastre, no has cumplido ning�n proposito!!! (0 de 3)");
			}
		}
		        
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		
	}
	
}