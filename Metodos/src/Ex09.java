import java.io.IOException;

public class Ex09 {
	
	public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.print("Introduzca primer car�cter: ");
        car1 = (char)System.in.read(); //lee un car�cter
        
        System.out.print("Introduzca segundo car�cter: ");
        car2 = (char)System.in.read(); //lee el segundo car�cter
        Character c1 = new Character(car1);
        Character c2 = new Character(car2);
        if(c1.equals(c2))  //comparamos dos objetos Character mediante el m�todo equals
            System.out.println("Son iguales");   
        else
            System.out.println("No son iguales");
	    }
	} 

	 