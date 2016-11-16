
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class diadespuesprueba {
	
	public static void main (String[] args) {
		 
		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce el dia en cifras");
			String diaStr = buffer.readLine();
			int dia = Integer.parseInt(diaStr);
			
			System.out.println("Introduce el mes en cifras");
			String mesStr = buffer.readLine();
			int mes = Integer.parseInt(mesStr);
			
			System.out.println("Introduce el a–o en cifras");
			String anyStr = buffer.readLine();
			int any = Integer.parseInt(anyStr);
			
		
			/*meses 31--> 1, 3, 5, 7, 8, 10, 12
			 meses 30--> 4, 6 , 9, 11
			(any % 4 == 0 && any % 100 != 0 || any % 400 == 0) f—rmula a–o bisiesto
			recordar preguntar si es igual de v‡lido usar los s’mbolos para operadores l—gicos ||->or &&->and*/
			
			if (dia<=0 || mes<=0 || dia>31 || mes>12) { 
				System.out.println("La fecha introducida no es correcta");
			}
			
			else if (dia>=31 && (mes==4||mes==6||mes==9||mes==11) || dia>=30 && mes==2 || mes==2 && dia==29&&(any%4!=0||any%100==0)&&any%400!=0) {
				System.out.println("La fecha introducida es incorrecta");
			}
			
			//else if (mes==2 && dia==28 || mes==2 && any%4==0 && any%100!=0 || any % 400 == 0 && dia==29) { 
			else if (mes==2&&(dia==29||(dia==28&&(any%4!=0||any%100==0)&&any%400!=0))) {
				
				System.out.println("El d’a siguiente al que has introducido es el 1 del 3 del a–o " + any);
			}
			
			else if (dia==30 && (mes==4||mes==6||mes==9||mes==11) || dia==31 && (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10)) {
				System.out.println("El d’a siguiente al que has introducido es el 1 del " + (mes+1) + " del a–o " + any);
			}
			
			else if (dia==31 && mes==12) {
				System.out.println("El d’a siguiente al que has introducido es el 1 del 1 del a–o " + (any+1));
			}
				
			else { 
				System.out.println("El d’a siguiente al que has introducido es el "+ (dia+1) + " del " + mes + " del a–o " + any);
			}
			
			
	    }
		
		catch (Exception e){
			System.out.println("Error al introducir los nœmeros");
		}
		
	}

	}