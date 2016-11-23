import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TortugasNinja {
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			String accStr="";
			int acc=0;	
			String malosdesStr="";
			int malosdes=0;
			String inocentessalStr="";
			int inocentessal=0;
			String nomtorrealizacionStr=""; //nombreTortugaRealizacion
			boolean michelangelor=false;
			boolean donatellor=false;
			boolean leonardor=false;
			boolean raphaelr=false;
			String realizacionmichStr="";
			double realizacionmich=-1;
			String realizaciondonStr="";
			double realizaciondon=-1;
			String realizacionleoStr="";
			double realizacionleo=-1;
			String realizacionrapStr="";
			double realizacionrap=-1;
			String realizacionmich2Str="";
			double realizacionmich2=-1;
			String realizaciondon2Str="";
			double realizaciondon2=-1;
			String realizacionleo2Str="";
			double realizacionleo2=-1;
			String realizacionrap2Str="";
			double realizacionrap2=-1;
			//int incidencia=0;
			
			while (acc!=8){
				System.out.println();
				System.out.println("-----------MEN� PRINCIPAL--------------");
				System.out.println("[1] - REGISTRAR MALOS");
				System.out.println("[2] - REGISTRAR INOCENTES");
				System.out.println("[3] - REGISTRAR REALIZACI�N");
				System.out.println("[4] - MOSTRAR GRADO DE INCIDENCIA DE LA CIUDAD");
				System.out.println("[5] - VER EQUILIBRIO");
				System.out.println("[6] - MEJORAR REALIZACI�N");
				System.out.println("[7] - RANKING REALIZACI�N");
				System.out.println("[8] - SALIR");
				System.out.println("---------------------------------------");
				System.out.println();
				System.out.println("ELIJA OPCI�N:");
				accStr = buffer.readLine();
				acc = Integer.parseInt(accStr);
				
				if (acc>8 || acc<=0) System.out.println("Error. Opci�n no v�lida");
				
				if (acc==1){
					while (malosdes<=0){				
					System.out.println("Introduce el n�mero de malos desarmados");
					malosdesStr = buffer.readLine();
					malosdes = Integer.parseInt(malosdesStr);
					}				
				}
				
				if (acc==2){
					while (inocentessal<=0){				
						System.out.println("Introduce el n�mero de inocentes salvados");
						inocentessalStr = buffer.readLine();
						inocentessal = Integer.parseInt(inocentessalStr);
					}				
				}
				
				//if (acc==3 && contrealizacion>0 ) System.out.println("Ya has introducido la valoraci�n del d�a");
				
				if (acc==3){
					System.out.println("�Cowabunga! Introduce tu nombre");
					nomtorrealizacionStr = buffer.readLine();
					nomtorrealizacionStr=nomtorrealizacionStr.toLowerCase();
					
					if (nomtorrealizacionStr.equals("leonardo") && leonardor==false){
						while (realizacionleo<0 || realizacionleo>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizacionleoStr = buffer.readLine();
							realizacionleo = Double.parseDouble(realizacionleoStr);
							leonardor=true; //aqu� creo que deber�a ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea n�mero de 0 a 10
						}
					}
						
					else if (nomtorrealizacionStr.equals("michelangelo") && michelangelor==false){
						while (realizacionmich<0 || realizacionmich>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizacionmichStr = buffer.readLine();
							realizacionmich = Double.parseDouble(realizacionmichStr);
							michelangelor=true; //aqu� creo que deber�a ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea n�mero de 0 a 10
						}
					}
						
					else if (nomtorrealizacionStr.equals("donatello") && donatellor==false){
						while (realizaciondon<0 || realizaciondon>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizaciondonStr = buffer.readLine();
							realizaciondon = Double.parseDouble(realizaciondonStr);
							donatellor=true; //aqu� creo que deber�a ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea n�mero de 0 a 10
						}
					}
							
					else if (nomtorrealizacionStr.equals("raphael") && raphaelr==false){
						while (realizacionrap<0 || realizacionrap>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizacionrapStr = buffer.readLine();
							realizacionrap = Double.parseDouble(realizacionrapStr);
							raphaelr=true; //aqu� creo que deber�a ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea n�mero de 0 a 10
						}
					}
						
					else System.out.println("�Masilla detectado! Error.");					
					}
				
				if (acc==4){// int resultado=Math.sqrt(numero);
					System.out.println("El grado de incidencia en la ciudad es de " + Math.sqrt(malosdes));
					/*double a = 5.0/2; -- para pasar un double a int
					  int b = (int)a;*/
					//incidencia=Math.sqrt(malosdes);
					//if (incidencia==0) System.out.println("�Dejad de comer pizza y a trabajar! �Todav�a no ten�is incidencia en la ciudad!");
				}
				
				if (acc==5){
					if (malosdes==inocentessal) System.out.println("Equilibrio neutro");
					if (malosdes>inocentessal) System.out.println("Equilibrio negativo");
					if (malosdes<inocentessal) System.out.println("Equilibrio positivo");
				}
				
				if (acc==6){
					System.out.println("�Cowabunga, mejorando tu realizaci�n! Introduce tu nombre");
					nomtorrealizacionStr = buffer.readLine();
					nomtorrealizacionStr=nomtorrealizacionStr.toLowerCase();
					
					if (nomtorrealizacionStr.equals("leonardo")){
						while (realizacionleo2<0 || realizacionleo2>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizacionleo2Str = buffer.readLine();
							realizacionleo2 = Double.parseDouble(realizacionleo2Str);
							if (realizacionleo2>=0 && realizacionleo2<=10) {
								realizacionleo=realizacionleo+realizacionleo2;
								realizacionleo2=-1; //esto es por si queremos volver a introducir otra mejora de realizaci�n, ya que no especifica que sea s�lo una al d�a
								break;
							}							
						}
					}
						
					else if (nomtorrealizacionStr.equals("michelangelo")){
						while (realizacionmich2<0 || realizacionmich2>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizacionmich2Str = buffer.readLine();
							realizacionmich2 = Double.parseDouble(realizacionmich2Str);
							if (realizacionmich2>=0 && realizacionmich2<=10) {
								realizacionmich=realizacionmich+realizacionmich2;
								realizacionmich2=-1;
								break;
							}	
						}
					}
						
					else if (nomtorrealizacionStr.equals("donatello")){
						while (realizaciondon2<0 || realizaciondon2>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizaciondon2Str = buffer.readLine();
							realizaciondon2 = Double.parseDouble(realizaciondon2Str);
							if (realizaciondon2>=0 && realizaciondon2<=10) {
								realizaciondon=realizaciondon+realizaciondon2;
								realizaciondon2=-1;
								break;
							}	
						}
					}
							
					else if (nomtorrealizacionStr.equals("raphael")){
						while (realizacionrap2<0 || realizacionrap2>10){
							System.out.println("Introduce la valoraci�n del d�a del 0 al 10");
							realizacionrap2Str = buffer.readLine();
							realizacionrap2 = Double.parseDouble(realizacionrap2Str);
							if (realizacionrap2>=0 && realizacionrap2<=10) {
								realizacionrap=realizacionrap+realizacionrap2;
								realizacionrap2=-1;
								break;
							}	
						}
					}
					
					else System.out.println("�Eres un masilla? �El nombre es incorrecto!");
				}
				
				if (acc==7){ //me lo ordena al rev�s y, adem�s, s�lo aparecen los n�meros y no los nombres
					//Array de double
			        double [] nombres = {realizacionmich, realizaciondon, realizacionrap, realizacionleo};
			 
			        //Ordena el array
			        Arrays.sort(nombres);
			 
			        //Mostramos el array ya ordenado
			        for (double i : nombres) {
			            System.out.print(i + ", ");
			        }
				}
				
				if (acc==8) System.out.println("�Cowabunga!");
				
				
			}
}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		}
		}