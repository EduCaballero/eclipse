
public class Ex08 {
public static void main (String[] args) {
		
		try{
						
			System.out.println("Introduce un caracter");
			char car;
			car = (char)System.in.read(); //lee un solo caracter
	        
	          if(Character.isUpperCase(car)) //utilizamos el m�todo isUpperCase de la clase Character
	             System.out.println("Es una letra may�scula");   
	          else
	              System.out.println("No es una letra may�scula");
}


catch (Exception e){
	System.out.println("Error al introducir los n�meros " + e);
}
}
}
