import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NocheVieja {

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			String [] entrada = new String[999]; //en este array meto los datos de entrada que leo con el buffer, tal cual ejemplo "15:30"
			int [] restante = new int[999]; //aquí guardo, en la misma posición que en el anterior array, el tiempo restante hasta las campanadas para cada entrada
			int horas = 0; //para cuando las paso a int
			int min = 0; //ídem

			int i=0; //contador para las posiciones de bucle y para su lectura
			int iniciobucle = 0; //para que inicie el while y poder hacer control de errores. Podría hacerse con un boolean

			while (iniciobucle != 1){
				System.out.println("Introduce la hora con el formato xx:xx -24 horas-");
				System.out.println("00:00 termina el programa");
				entrada[i] = buffer.readLine(); //guardo cada entrada del buffer en el array y utilizo como posicion el int i declarado anteriormente

				if (entrada[i].equals("00:00")){
					break; //si el usuario mete 00:00 interrumpo el bucle para que salga de él y continue el programa
				}
				
				if (entrada[i].length()==5 && Character.isDigit(entrada[i].charAt(0)) && Character.isDigit(entrada[i].charAt(1)) && Character.isDigit(entrada[i].charAt(3)) && Character.isDigit(entrada[i].charAt(4)) && entrada[i].charAt(2)==':'){
					horas= Integer.parseInt(Character.toString(entrada[i].charAt(0)) + Character.toString(entrada[i].charAt(1)));
					min= Integer.parseInt(Character.toString(entrada[i].charAt(3)) + Character.toString(entrada[i].charAt(4)));
					// control de errores. asegurarme de que la posición tiene 5 caracteres y que las posiciones 0,1,3,4 son dígitos ¿se podría usar salto de línea para no quedar tan largo sin afectar al programa?
					// pasar la posición 0 y 1 a integer y juntarlas
					// pasar la posición 3 y 4 a integer y juntarlas

					if (horas >=00 && horas <=23 && min >=00 && min <=59){ //control errores
						restante[i]=1440-(60*horas+min); //operación para calcular minutos restantes
						i++; // incrementamos el int i del principio, contador
					}

					else System.out.println("La hora introducida no tiene formáto válido");					

				}

				else System.out.println("La hora introducida no tiene formáto válido");

			}

			for(int z=0; z<i; z++){ //sacamos los datos por pantalla
				System.out.println("Las campanadas son en " + restante[z] + " minutos");
			}
		}

		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
	}
}


// pruebas anteriores y cosas encontradas en stackoverflow

/*String a = "jklmn489pjro635ops";

    int sum = 0;

    String num = "";

    boolean notFirst = false;{

    for (char c : a.toCharArray()) {

        if (Character.isDigit(c)) {
            sum = sum + Character.getNumericValue(c);
            System.out.print((notFirst? " + " : "") + c);
            notFirst = true;

        }
    }

    System.out.println(" = " + sum);
    
}*/


/*import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NocheVieja {
	
public static void main(String[] args) {
		
		try{
			
			int hora = 0;
			String h1="";
			String h2="";
			String h3="";
			String h4="";
			int[] hora1 = new int[2]; // array hora1
			int[] hora2 = new int[2]; // array hora2
			int[] hora3 = new int[2]; // array hora3
			int[] hora4 = new int[2]; // array hora4
			 
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce 4 horas con el formato 00:00 -24 horas-");
			System.out.println("Introduce la primera hora");
			h1 = buffer.readLine();
			System.out.println("Introduce la segunda hora");
			h2 = buffer.readLine();
			System.out.println("Introduce la tercera hora");
			h3 = buffer.readLine();
			System.out.println("Introduce la cuarta hora");
			h4 = buffer.readLine();
			
			
			
			for(int i=0; i<numeros.length; i++){
				num = Integer.parseInt(buffer.readLine());
				numeros[i]=num;
			}
			
			for(int i : hora1) System.out.println(i); // recorrer array numeros
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}

	}
	
}


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NocheVieja2 {
	
public static void main(String[] args) {
		
		try{
			
			/*
			 * 
			 * String element = "el5";
				String s;
				int x = element.charAt(2)-'0';
			 */
/*			
			int hora = 0;
			String h1="";
			int h1hor=0;
			int h1min=0;
			String h2="";
			int h2hor=0;
			int h2min=0;
			String h3="";
			int h3hor=0;
			int h3min=0;
			String h4="";
			int h4hor=0;
			int h4min=0;
			int[] hora1 = new int[2]; // array hora1
			int[] hora2 = new int[2]; // array hora2
			int[] hora3 = new int[2]; // array hora3
			int[] hora4 = new int[2]; // array hora4
			 
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce 4 horas con el formato 00:00 -24 horas-");
			System.out.println("Introduce la primera hora");
			h1 = buffer.readLine();
			System.out.println("Introduce la segunda hora");
			h2 = buffer.readLine();
			System.out.println("Introduce la tercera hora");
			h3 = buffer.readLine();
			System.out.println("Introduce la cuarta hora");
			h4 = buffer.readLine();
			
			
			
			
			for(int i=0; i<numeros.length; i++){
				num = Integer.parseInt(buffer.readLine());
				numeros[i]=num;
			}
			
			for(int i : hora1) System.out.println(i); // recorrer array numeros
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}

	}
	
}

-------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NocheVieja3 {
	
public static void main(String[] args) {
		
		try{
			
			/*
			 * 
			 * String element = "el5";
				String s;
				int x = element.charAt(2)-'0';
			 */
/*			
			int hora = 0;
			String h1="";
			int h1hor=0;
			int h1min=0;
			String h2="";
			int h2hor=0;
			int h2min=0;
			String h3="";
			int h3hor=0;
			int h3min=0;
			String h4="";
			int h4hor=0;
			int h4min=0;
			int[] hora1 = new int[2]; // array hora1
			int[] hora2 = new int[2]; // array hora2
			int[] hora3 = new int[2]; // array hora3
			int[] hora4 = new int[2]; // array hora4
			 
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce 4 horas con el formato 00:00 -24 horas-");
			System.out.println("Introduce la primera hora");
			h1 = buffer.readLine();
			System.out.println("Introduce la segunda hora");
			h2 = buffer.readLine();
			System.out.println("Introduce la tercera hora");
			h3 = buffer.readLine();
			System.out.println("Introduce la cuarta hora");
			h4 = buffer.readLine();
			
			
			String h1mod=h1.replace(':',',');
			String h2mod=h2.replace(':',',');
			String h3mod=h3.replace(':',',');
			String h4mod=h4.replace(':',',');
			
			
			/*System.out.println(h1mod);
			System.out.println(h2mod);
			System.out.println(h3mod);
			System.out.println(h4mod);*/
/*			
			
			int [] hora1 = {h1mod};
			
		
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}

	}
	
}
*/
