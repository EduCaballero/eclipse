import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04corregido {

public static void main(String[] args) {
		
		try{
			
			//creamos un buffer de lectura
		    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		    
		                //pedimos que escriban una cadena
		        System.out.print("Escribe una palabra para saber si es pal�ndromo o no");
		                
		                //metemos en cadena lo que entre por teclado
		        String palabra = buffer.readLine();
			
		        char[] letra= palabra.toCharArray();
		        int j=letra.length-1;
		        boolean l=false;
		        
		        for(int i=0; i<letra.length && l==false; i++,j--){
		        	if(letra[i]!=letra[j]){
		        		l=true;		        		
		        	}
		        }
		        
		        if(l==false) System.out.println("Es pal�ndromo");
		        else System.out.println("NO es pal�ndromo");		        
		        
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		
	}
	
}
