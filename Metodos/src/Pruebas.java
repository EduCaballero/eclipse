import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pruebas {
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
			//double aux=0;
			//int incidencia=0;
			
			while (acc!=8){
				System.out.println();
				System.out.println("-----------MENÚ PRINCIPAL--------------");
				System.out.println("[1] - REGISTRAR MALOS");
				System.out.println("[2] - REGISTRAR INOCENTES");
				System.out.println("[3] - REGISTRAR REALIZACIÓN");
				System.out.println("[4] - MOSTRAR GRADO DE INCIDENCIA DE LA CIUDAD");
				System.out.println("[5] - VER EQUILIBRIO");
				System.out.println("[6] - MEJORAR REALIZACIÓN");
				System.out.println("[7] - RANKING REALIZACIÓN");
				System.out.println("[8] - SALIR");
				System.out.println("---------------------------------------");
				System.out.println();
				System.out.println("ELIJA OPCIÓN:");
				accStr = buffer.readLine();
				acc = Integer.parseInt(accStr);
				
				if (acc>8 || acc<=0) System.out.println("Error. Opción no válida");
				
				if (acc==1){
					while (malosdes<=0){				
					System.out.println("Introduce el número de malos desarmados");
					malosdesStr = buffer.readLine();
					malosdes = Integer.parseInt(malosdesStr);
					}				
				}
				
				if (acc==2){
					while (inocentessal<=0){				
						System.out.println("Introduce el número de inocentes salvados");
						inocentessalStr = buffer.readLine();
						inocentessal = Integer.parseInt(inocentessalStr);
					}				
				}
				
				//if (acc==3 && contrealizacion>0 ) System.out.println("Ya has introducido la valoración del día");
				
				if (acc==3){
					System.out.println("¡Cowabunga! Introduce tu nombre");
					nomtorrealizacionStr = buffer.readLine();
					nomtorrealizacionStr=nomtorrealizacionStr.toLowerCase();
					
					if (nomtorrealizacionStr.equals("leonardo") && leonardor==false){
						while (realizacionleo<0 || realizacionleo>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizacionleoStr = buffer.readLine();
							realizacionleo = Double.parseDouble(realizacionleoStr);
							leonardor=true; //aquí creo que debería ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea número de 0 a 10
						}
					}
						
					else if (nomtorrealizacionStr.equals("michelangelo") && michelangelor==false){
						while (realizacionmich<0 || realizacionmich>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizacionmichStr = buffer.readLine();
							realizacionmich = Double.parseDouble(realizacionmichStr);
							michelangelor=true; //aquí creo que debería ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea número de 0 a 10
						}
					}
						
					else if (nomtorrealizacionStr.equals("donatello") && donatellor==false){
						while (realizaciondon<0 || realizaciondon>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizaciondonStr = buffer.readLine();
							realizaciondon = Double.parseDouble(realizaciondonStr);
							donatellor=true; //aquí creo que debería ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea número de 0 a 10
						}
					}
							
					else if (nomtorrealizacionStr.equals("raphael") && raphaelr==false){
						while (realizacionrap<0 || realizacionrap>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizacionrapStr = buffer.readLine();
							realizacionrap = Double.parseDouble(realizacionrapStr);
							raphaelr=true; //aquí creo que debería ir un if, xq si no cuando entra en el bucle ya lo pone en true aunque no sea número de 0 a 10
						}
					}
						
					else System.out.println("¡Masilla detectado! Error.");					
					}
				
				if (acc==4){// int resultado=Math.sqrt(numero);
					System.out.println("El grado de incidencia en la ciudad es de " + Math.sqrt(malosdes));
					/*double a = 5.0/2; -- para pasar un double a int
					  int b = (int)a;*/
					//incidencia=Math.sqrt(malosdes);
					//if (incidencia==0) System.out.println("¡Dejad de comer pizza y a trabajar! ¡Todavía no tenéis incidencia en la ciudad!");
				}
				
				if (acc==5){
					if (malosdes==inocentessal) System.out.println("Equilibrio neutro");
					if (malosdes>inocentessal) System.out.println("Equilibrio negativo");
					if (malosdes<inocentessal) System.out.println("Equilibrio positivo");
				}
				
				if (acc==6){
					System.out.println("¡Cowabunga, mejorando tu realización! Introduce tu nombre");
					nomtorrealizacionStr = buffer.readLine();
					nomtorrealizacionStr=nomtorrealizacionStr.toLowerCase();
					
					if (nomtorrealizacionStr.equals("leonardo")){
						while (realizacionleo2<0 || realizacionleo2>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizacionleo2Str = buffer.readLine();
							realizacionleo2 = Double.parseDouble(realizacionleo2Str);
							if (realizacionleo2>=0 && realizacionleo2<=10) {
								realizacionleo=realizacionleo+realizacionleo2;
								if (realizacionleo>10) {
									System.out.println("Error, la realización no puede ser mayor de 10");
									realizacionleo=realizacionleo-realizacionleo2;
								}
								realizacionleo2=-1; //esto es por si queremos volver a introducir otra mejora de realización, ya que no especifica que sea sólo una al día
								break;
							}							
						}
					}
						
					else if (nomtorrealizacionStr.equals("michelangelo")){
						while (realizacionmich2<0 || realizacionmich2>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizacionmich2Str = buffer.readLine();
							realizacionmich2 = Double.parseDouble(realizacionmich2Str);
							if (realizacionmich2>=0 && realizacionmich2<=10) {
								realizacionmich=realizacionmich+realizacionmich2;
								if (realizacionmich>10){
									System.out.println("Error, la realización no puede ser mayor de 10");
									realizacionmich=realizacionmich-realizacionmich2;
								}
								realizacionmich2=-1;
								break;
							}	
						}
					}
						
					else if (nomtorrealizacionStr.equals("donatello")){
						while (realizaciondon2<0 || realizaciondon2>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizaciondon2Str = buffer.readLine();
							realizaciondon2 = Double.parseDouble(realizaciondon2Str);
							if (realizaciondon2>=0 && realizaciondon2<=10) {
								realizaciondon=realizaciondon-realizaciondon2;
								if (realizaciondon>10){
									System.out.println("Error, la realización no puede ser mayor de 10");
									realizaciondon=realizaciondon-realizaciondon2;
								}
								realizaciondon2=-1;
								break;
							}	
						}
					}
							
					else if (nomtorrealizacionStr.equals("raphael")){
						while (realizacionrap2<0 || realizacionrap2>10){
							System.out.println("Introduce la valoración del día del 0 al 10");
							realizacionrap2Str = buffer.readLine();
							realizacionrap2 = Double.parseDouble(realizacionrap2Str);
							if (realizacionrap2>=0 && realizacionrap2<=10) {
								realizacionrap=realizacionrap+realizacionrap2;
								if (realizacionrap>10){
									realizacionrap=realizacionrap-realizacionrap2;
									System.out.println("Error, la realización no puede ser mayor de 10");
								}
								realizacionrap2=-1;
								break;
							}	
						}
					}
					
					else System.out.println("¿Eres un masilla? ¡El nombre es incorrecto!");
				}
				
				if (acc==7){ /*//me lo ordena al revés y, además, sólo aparecen los números y no los nombres
					//Array de double
			        double [] nombres = {realizacionmich, realizaciondon, realizacionrap, realizacionleo};
			 
			        //Ordena el array
			        Arrays.sort(nombres);
			 
			        //Mostramos el array ya ordenado --- este no vale, es de menor a mayor
			        //for (double i : nombres) {
			        //    System.out.print(i + ", ");
			        //}
			        //for(int i =nombres.length-1; i>=0; i--){ // con esto lo ordena de mayor a menor, pero no muestra el nombre
			        //	System.out.println(nombres[i]);*/
					
					
						
						///*/*/*/*/*/*/*/* if(realizacionmich > realizaciondon){
						   /*Intercambiar los numeros de menor a medio1*/
						 //   aux=realizaciondon;
						//    realizaciondon=realizacionmich;
						//    realizacionmich=aux;
						// }
						// if(realizacionmich > realizacionrap){
						   /*Intercambiar los numeros de menor a medio2*/
						 //      aux=realizacionrap;
						 //      realizacionrap=realizacionmich;
						 //   realizacionmich=aux;
						 //}
						// if(realizaciondon > realizacionleo){
						      /*Intercambiar los numeros de medio1  a mayor*/
						//   aux=realizacionleo;
						//   realizacionleo=realizaciondon;
						 //  realizaciondon=aux;
						// }
						// if(realizacionrap > realizacionleo){
						   /*Intercambiar los numeros de medio2 a mayor*/
						 //  aux=realizacionleo;
						 //  realizacionleo=realizacionrap;
						  // realizacionrap=aux;
						// }
						// if(realizacionmich > realizaciondon){
						    /*Intercambiar los numeros de menor a medio1*/
						 //   aux=realizaciondon;
						 //   realizaciondon=realizacionmich;
						 //   realizacionmich=aux;
						// }
						 
						// System.out.println("El mayor es " + realizacionleo);
						// System.out.println("El menor es " + realizacionmich);
						// System.out.println("El medio1 es " + realizaciondon);
						// System.out.println("El medio2 es " + realizacionrap);
					
					if (realizacionleo>realizacionmich && realizacionleo>realizaciondon && realizacionleo>realizacionrap){
						System.out.println("Leonardo: " + realizacionleo);
						if (realizacionmich>realizaciondon && realizacionmich>realizacionrap){
							System.out.println("Michelangelo" + realizacionmich);
							if (realizaciondon>realizacionrap){ 
								System.out.println("Donatello: " + realizaciondon);
								System.out.println("Raphael" + realizacionrap);
							}
							else {System.out.println("Raphael" + realizacionrap);
								  System.out.println("Donatello: " + realizaciondon);
							}
						}
						if (realizaciondon>realizacionmich && realizaciondon>realizacionrap){
							System.out.println("Donatello: " + realizaciondon);
							if (realizacionmich>realizacionrap){
								System.out.println("Michelangelo: " + realizacionmich);
								System.out.println("Raphael: " + realizacionrap);
							}
							else {System.out.println("Raphael: " + realizacionrap);
								  System.out.println("Michelangelo: " + realizacionmich);
							}
						}
						if (realizacionrap>realizacionmich && realizacionrap>realizaciondon){
							System.out.println("Raphael: " + realizacionrap);
							if (realizacionmich>realizaciondon){
								System.out.println("Michelangelo: " + realizacionmich);
								System.out.println("Donatello: " + realizaciondon);
							}
							else {
								System.out.println("Donatello: " + realizaciondon);
								System.out.println("Michelangelo: " + realizacionmich);
							}
						}
					}
					////////////////////////////////
					if (realizacionmich>realizacionleo && realizacionmich>realizaciondon && realizacionmich>realizacionrap){
						System.out.println("Michelangelo: " + realizacionmich);
						if (realizacionleo>realizaciondon && realizacionleo>realizacionrap){
							System.out.println("Leonardo" + realizacionleo);
							if (realizaciondon>realizacionrap){ 
								System.out.println("Donatello: " + realizaciondon);
								System.out.println("Raphael: " + realizacionrap);
							}
							else {System.out.println("Raphael: " + realizacionrap);
								  System.out.println("Donatello: " + realizaciondon);
							}
						}
						if (realizaciondon>realizacionleo && realizaciondon>realizacionrap){
							System.out.println("Donatello: " + realizaciondon);
							if (realizacionleo>realizacionrap){
								System.out.println("Leonardo: " + realizacionleo);
								System.out.println("Raphael: " + realizacionrap);
							}
							else {System.out.println("Raphael" + realizacionrap);
								  System.out.println("Leonardo: " + realizacionleo);
							}
						}
						if (realizacionrap>realizacionleo && realizacionrap>realizaciondon){
							System.out.println("Raphael" + realizacionrap);
							if (realizacionmich>realizaciondon){
								System.out.println("Leonardo: " + realizacionleo);
								System.out.println("Donatello: " + realizaciondon);
							}
							else {
								System.out.println("Donatello: " + realizaciondon);
								System.out.println("Michelangelo: " + realizacionmich);
							}
						}
					}
					////////////////////////////////	 
					if (realizaciondon>realizacionmich && realizaciondon>realizacionleo && realizaciondon>realizacionrap){
						System.out.println("Donatello: " + realizaciondon);
						if (realizacionmich>realizacionleo && realizacionmich>realizacionrap){
							System.out.println("Michelangelo" + realizacionmich);
							if (realizacionleo>realizacionrap){ 
								System.out.println("Leonardo: " + realizacionleo);
								System.out.println("Raphael" + realizacionrap);
							}
							else {System.out.println("Raphael" + realizacionrap);
								  System.out.println("Leonardo: " + realizacionleo);
							}
						}
						if (realizacionleo>realizacionmich && realizacionleo>realizacionrap){
							System.out.println("Leonardo: " + realizacionleo);
							if (realizacionmich>realizacionrap){
								System.out.println("Michelangelo: " + realizacionmich);
								System.out.println("Raphael: " + realizacionrap);
							}
							else {System.out.println("Raphael: " + realizacionrap);
								  System.out.println("Michelangelo: " + realizacionmich);
							}
						}
						if (realizacionrap>realizacionmich && realizacionrap>realizacionleo){
							System.out.println("Raphael: " + realizacionrap);
							if (realizacionmich>realizacionleo){
								System.out.println("Michelangelo: " + realizacionmich);
								System.out.println("Leonardo: " + realizacionleo);
							}
							else {
								System.out.println("Leonardo: " + realizacionleo);
								System.out.println("Michelangelo: " + realizacionmich);
							}
						}
					}
					//////////////////////////////////////
					if (realizacionrap>realizacionmich && realizacionrap>realizaciondon && realizacionrap>realizacionleo){
						System.out.println("Raphael: " + realizacionrap);
						if (realizacionmich>realizaciondon && realizacionmich>realizacionleo){
							System.out.println("Michelangelo: " + realizacionmich);
							if (realizaciondon>realizacionleo){ 
								System.out.println("Donatello: " + realizaciondon);
								System.out.println("Leonardo: " + realizacionleo);
							}
							else {System.out.println("Leonardo: " + realizacionleo);
								  System.out.println("Donatello: " + realizaciondon);
							}
						}
						if (realizaciondon>realizacionmich && realizaciondon>realizacionleo){
							System.out.println("Donatello: " + realizaciondon);
							if (realizacionmich>realizacionleo){
								System.out.println("Michelangelo: " + realizacionmich);
								System.out.println("Leonardo: " + realizacionleo);
							}
							else {System.out.println("Leonardo: " + realizacionleo);
								  System.out.println("Michelangelo: " + realizacionmich);
							}
						}
						if (realizacionleo>realizacionmich && realizacionleo>realizaciondon){
							System.out.println("Leonardo: " + realizacionleo);
							if (realizacionmich>realizaciondon){
								System.out.println("Michelangelo: " + realizacionmich);
								System.out.println("Donatello: " + realizaciondon);
							}
							else {
								System.out.println("Donatello: " + realizaciondon);
								System.out.println("Michelangelo: " + realizacionmich);
							}
						}
					}
					
				}
				
				if (acc==8) System.out.println("¡Cowabunga!");			
				
			
}
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
		}
		}