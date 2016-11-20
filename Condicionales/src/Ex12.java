import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12 {
	
	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe las horas que has trabajado esta semana");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int num1 = Integer.parseInt(num1Str);
			System.out.println("Me has dicho " + num1 + " horas!");
			
			if (num1<=40) System.out.println("Vas a cobrar " + (num1*16));
			
			else System.out.println("Vas a cobrar " + (((num1-40)*20)+(40*16))); // numero de horas totales - 40h que ya sumamos en el último paréntesis
			
}
		catch (Exception e){
			System.out.println("Error al introducir los números");
	}
}
}
