import java.io.IOException;

public class Ex10 {
	
	public static void main(String[] args) throws IOException {
        char car1, car2;
        System.out.println("Introduzca primer car�cter: ");
        car1 = (char)System.in.read(); //lee un car�cter
        System.in.read();  //saltar el intro que ha quedado
        System.out.println("Introduzca segundo car�cter: ");
        car2 = (char)System.in.read(); //lee el segundo car�cter     
        if(Character.isLowerCase(car1)){ //utilizamos el m�todo isLowerCase de la clase Character
           if(Character.isLowerCase(car2))
               System.out.println("Los dos son letras min�sculas");
           else
               System.out.println("El primero es una letra min�scula pero el segundo no");
        }
        else{
            if(Character.isLowerCase(car2))
               System.out.println("El segundo es una letra min�scula pero el primero no");
           else
               System.out.println("Ninguno es una letra min�scula");
        }
   }
}