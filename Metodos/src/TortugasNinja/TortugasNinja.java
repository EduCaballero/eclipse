package TortugasNinja;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
			String realizacionStr="";
			int realizacion=0;
			String nomtorrealizacionStr="";
			boolean realizacionmich=false;
			boolean realizaciondon=false;
			boolean realizacionleo=false;
			boolean realizacionrap=false;
			
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
					
					if (nomtorrealizacionStr.equals("leonardo"))
						
					else if (nomtorrealizacionStr.equals("michelangelo"))
						
					else if (nomtorrealizacionStr.equals("donatello"))
							
					else if (nomtorrealizacionStr.equals("raphael"))
						
					else System.out.println("�Masilla detectado! Error.");
					
					while (realizacion<0 || realizacion>10){
						System.out.println("Introduce la valoraci�n del d�a");
						realizacionStr = buffer.readLine();
						realizacion = Integer.parseInt(realizacionStr);
						realizacionmich=true;
					}
				}
				
				
				
				
				
			}
}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		}
		}