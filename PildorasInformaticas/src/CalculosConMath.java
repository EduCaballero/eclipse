import javax.swing.JOptionPane;

public class CalculosConMath {

	public static void main(String[] args) {

		double raiz=Math.sqrt(9); //m�todo para la raiz cuadrada. siempre debe ser double
		
		System.out.println(raiz); //dar� 3.0
		
		float num1=5.85F;
		int resultado=Math.round(num1); //con esto hacemos el redondeo.
		//debemos fijarnos bien en el intellisense que utilicemos el m�todo adecuado, en este caso le damos un float y 
		//nos devuelve un int en un double nos devolver�a un long
		
		System.out.println(resultado);
		
		//Refundici�n: convertir un tipo de dato en otro. ejemplo:
		//int raiz=(int)Math.round(num1); es decir, el primer par�ntesis es el que fuerza a int lo que nos devuelve round, en este caso Long
		
		double num2=5.85;
		
		int resultado2=(int)Math.round(num2); //con esto coger�amos el double de num 2 y forzar�amos el reusltado de long a int
		
		System.out.println(resultado2);
		
		//Math.pow: elevar n�mero a potencia
		
		double base=5;
		
		double exponente=3;
		
		int resultado3=(int)Math.pow(base, exponente); //le pasamos dos doubles y nos devuelve un double, aunque ahora lo forzamos a int
		
		System.out.println("el resultado de "+base+" elevado a "+exponente+" es "+resultado3);
		
		//Para formatear los datos, por ejemplo los deciamles, lo podemos hacer as�
		double x=100000.0;
		
		System.out.printf("%1.2f", x/3); //con esto sacar�amos 2 decimales. Con "%1.4f" etc. printf, ojo, no print
		
		//Otro ejemplo
		
		String number=JOptionPane.showInputDialog("Introduce un n�mero");
		
		double num3=Double.parseDouble(number);//guardamos en un double llamado num3=dentro de la clase Double llam�mos al m�todo parseDouble
												//y le metemos el number que hemos guardado recogido con JOptionPane
		
		System.out.print("La ra�z de "+num3+" es: ");//print, OJO, no println. sin salto de l�nea, as� nos sale lo de debajo justo a continuaci�n
		
		System.out.printf("%1.4f", Math.sqrt(num3));
		
		
		
		
		
		
		
	}

}
