import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12 {
public static void main (String[] args) {
		
		try{
						
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Escribe el valor del importe");
			String num1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int num1 = Integer.parseInt(num1Str);
			System.out.println("Ahora te calcularé el cambio para " + num1 + "!");
			
			int mon50=0, mon20=0, mon10=0, mon5=0, mon2=0, mon1=0;
			
			while (num1>50){
				mon50 ++;
				num1 = num1-50;
				}

			while (num1>20){
				mon20 ++;
				num1 = num1-20;
				}
			
			while (num1>10){
				mon10 ++;
				num1 = num1-10;
				}
			
			while (num1>5){
				mon5 ++;
				num1 = num1-5;
				}
			
			while (num1>2){
				mon2 ++;
				num1 = num1-2;
				}
			
			while (num1>1){
				mon1 ++;
				num1 = num1-1;
				}
			
			System.out.println(mon50 + " monedas de 50cts");
			System.out.println(mon20 + " monedas de 20cts");
			System.out.println(mon10 + " monedas de 10cts");
			System.out.println(mon5 + " monedas de 5cts");
			System.out.println(mon2 + " monedas de 2cts");
			System.out.println(mon1 + " monedas de 1cts");

		}

	
	

		catch (Exception e){
			System.out.println("Error al introducir los nœmeros " + e);
	}
		
}

}
