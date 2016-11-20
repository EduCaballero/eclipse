import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex13 {

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //siempre igual
			System.out.println("Primera factura");
			System.out.println("Dime el código del artículo");
			String code1Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code1 = Integer.parseInt(code1Str);

			System.out.println("Dime la cantidad de de litros vendidos");
			String litros1Str = buffer.readLine();
			double litros1 = Double.parseDouble(litros1Str);
			
			System.out.println("Dime el precio por litro");
			String importe1Str = buffer.readLine();
			double importe1 = Double.parseDouble(importe1Str);
			

			System.out.println("Segunda factura");
			System.out.println("Dime el código del artículo");
			String code2Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code2 = Integer.parseInt(code2Str);

			System.out.println("Dime la cantidad de de litros vendidos");
			String litros2Str = buffer.readLine();
			double litros2 = Double.parseDouble(litros2Str);
			
			System.out.println("Dime el precio por litro");
			String importe2Str = buffer.readLine();
			double importe2 = Double.parseDouble(importe2Str);
			
	
			System.out.println("Tercera factura");
			System.out.println("Dime el código del artículo");
			String code3Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code3 = Integer.parseInt(code3Str);

			System.out.println("Dime la cantidad de de litros vendidos");
			String litros3Str = buffer.readLine();
			double litros3 = Double.parseDouble(litros3Str);
			
			System.out.println("Dime el precio por litro");
			String importe3Str = buffer.readLine();
			double importe3 = Double.parseDouble(importe3Str);
			
	
			System.out.println("Cuarta factura");
			System.out.println("Dime el código del artículo");
			String code4Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code4 = Integer.parseInt(code4Str);

			System.out.println("Dime la cantidad de de litros vendidos");
			String litros4Str = buffer.readLine();
			double litros4 = Double.parseDouble(litros4Str);
			
			System.out.println("Dime el precio por litro");
			String importe4Str = buffer.readLine();
			double importe4 = Double.parseDouble(importe4Str);
			
	
			System.out.println("Quinta factura");
			System.out.println("Dime el código del artículo");
			String code5Str = buffer.readLine(); // con esto captamos lo que escribimos con el teclado
			int code5 = Integer.parseInt(code5Str);

			System.out.println("Dime la cantidad de de litros vendidos");
			String litros5Str = buffer.readLine();
			double litros5 = Double.parseDouble(litros5Str);
			
			System.out.println("Dime el precio por litro");
			String importe5Str = buffer.readLine();
			double importe5 = Double.parseDouble(importe5Str);
			
			double total = (importe1+importe2+importe3+importe4+importe5);
			int facturas = 0;
			double litros = 0;
			
			if (code1 == 1) {
				litros+=litros1;
			}
			
			if (code2 == 1) {
				litros+=litros2;
			}
			
			if (code3 == 1) {
				litros+=litros3;
			}
			
			if (code4 == 1) {
				litros+=litros4;
			}
			
			if (code5 == 1) {
				litros+=litros5;
			}
			
			if (importe1>600) {
				facturas++;
			}
			
			if (importe2>600) {
				facturas++;
			}
			
			if (importe3>600) {
				facturas++;
			}
			
			if (importe4>600) {
				facturas++;
			}
			
			if (importe5>600) {
				facturas++;
			}
			
			System.out.println("La facturación total es de " + total);
			System.out.println("La cantidad de litros del artículo 1 es de " + litros);
			System.out.println("El número de facturas con importe mayor de 600€ es de " + facturas);
			
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números");
	}
		
	}
	
}
