
public class Ex08 {
public static void main (String[] args) {
		
		try{
						
			System.out.println("Introduce un caracter");
			char car;
			car = (char)System.in.read(); //lee un solo caracter
	        
	          if(Character.isUpperCase(car)) //utilizamos el método isUpperCase de la clase Character
	             System.out.println("Es una letra mayúscula");   
	          else
	              System.out.println("No es una letra mayúscula");
}


catch (Exception e){
	System.out.println("Error al introducir los nœmeros " + e);
}
}
}
