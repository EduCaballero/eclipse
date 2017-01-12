import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prueba {

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			String [] entrada = new String[999];
			int [] restante = new int[999];
			int horas = 0;
			int min = 0;

			int i=0;
			int iniciobucle = 0;

			while (iniciobucle != 1){
				System.out.println("Introduce la hora con el formato xx:xx -24 horas-");
				System.out.println("00:00 termina el programa");
				entrada[i] = buffer.readLine();

				if (entrada[i].equals("00:00")){
					break;
				}
				
				if (entrada[i].length()==5 && Character.isDigit(entrada[i].charAt(0)) && Character.isDigit(entrada[i].charAt(1)) && Character.isDigit(entrada[i].charAt(3)) && Character.isDigit(entrada[i].charAt(4)) && entrada[i].charAt(2)==':'){
					horas= Integer.parseInt(Character.toString(entrada[i].charAt(0)) + Character.toString(entrada[i].charAt(1)));
					min= Integer.parseInt(Character.toString(entrada[i].charAt(3)) + Character.toString(entrada[i].charAt(4)));

					if (horas >=00 && horas <=23 && min >=00 && min <=59){
						restante[i]=1440-(60*horas+min);
						i++;
					}

					else System.out.println("La hora introducida no tiene formáto válido");					

				}

				else System.out.println("La hora introducida no tiene formáto válido");

			}

			for(int z=0; z<i; z++){
				System.out.println("Las campanadas son en " + restante[z] + " minutos");
			}
		}

		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
	}
}




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
