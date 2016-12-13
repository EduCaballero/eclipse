import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {
	
	public static void main(String[] args) {
		
		try{
			
			 //creamos un buffer de lectura
		    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		    
		                //pedimos que escriban una cadena
		        System.out.print("Escribe una palabra para saber si es palíndromo o no");
		                
		                //metemos en cadena lo que entre por teclado
		        String cadena = buffer.readLine();
		                
		                //metemos cada uno de los caracteres de la variable cadena dentro de un array
		        char array[] = cadena.toCharArray();

		 

		 

		/*

		* declaramos i como integer y le damos valor 0, declaramos j con el tamaño del valor del array (menos una posición ya

		* que se cuenta la posición 0 también). Mientras i valga menos que la mitad del temaño del array, se le sumará uno al

		* valor de i y se le restará uno al valor de j.

		*/
		        for (int i = 0, j = (array.length - 1); i < (array.length / 2); i++, j--)
		        {

		           //si los caracteres del array según la posición  i  es distinto a los caracteres del array asigandos según el valor de j            // no es  un palíndromo
		            if (array[i] != array[j])
		            {

		                //Imprimos en pantalla
		                System.out.println("La palabra " + cadena + " no es un palíndromo");
		               

		                //Salimos del programa para no evaluar la siguiente condición

		                break;
		            }

		            //Si el valor de i es igual a la mitad del tamaño del array menos uno, es un palíndromo
		            if (i == array.length / 2 - 1)
		            {
		                System.out.println("La palabra " + cadena + " es un palíndromo");
		            }
		            
		        }
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
	}
		

}
