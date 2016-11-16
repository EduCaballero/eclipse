public class ex09prueba {
	
	public static void main (String[] args) {
 
		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce el primer termino de la equacion");
			String aStr = buffer.readLine();
			int a = Integer.parseInt(aStr);
			System.out.println("Introduce el segundo termino de la equacion");
			String bStr = buffer.readLine();
			int b = Integer.parseInt(bStr);
			System.out.println("Introduce el tercer termino de la equacion");
			String cStr = buffer.readLine();
			int c = Integer.parseInt(cStr);
			
			if (b*b-4*a*c < 0) 			
				System.out.println("No tiene solucion");
			else if (b*b-4*a*c == 0) {
				System.out.println("La solucion es " + (-b/2*a));
			} 
			else {
				System.out.println("Las soluciones son " + ((-b + Math.sqrt(b*b-4*a*c))/(2*a)) + " y " + ((-b - Math.sqrt(b*b-4*a*c))/(2*a)));
			}
		}
			
		catch (Exception e){
		
			System.out.println("Error: Introduce un numero");
				
		}	
	}
}