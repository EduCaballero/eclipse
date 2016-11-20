import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex16 {
	
	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Dime el dividendo");
			String code1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code1 = Integer.parseInt(code1Str);
			
			System.out.println("Dime el divisor");
			String code2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code2 = Integer.parseInt(code2Str);
			
			if(code2==0)
			       System.out.println("No se puede dividir por cero");   
			    else{
			        System.out.println(code1 + " / " + code2 + " = " + code1/code2);
			
		}
		}

	catch (Exception e){
		System.out.println("Error al introducir los números");
	}
	
}
	
}
