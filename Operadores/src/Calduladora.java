
public class Calduladora {

	public static void main (String[] args) {

		System.out.println("Edu"); // system... Muestra en pantalla lo que hemos puesto. con ln al final de print salta línea, sin él todo junto.

		//Integer --> Int, operador 1 --> op1, resultado --> res. Siempre que declaremos una variable debe tener un valor inicial ---> op1 = 40 x ejemplo.

		int op1 = 100;
		int op2 = 25;				

		System.out.println("El resultado de la suma de " + op1 + " y " + op2 + " es " + (op1+op2)); // Esto concatena la información.
		System.out.println("El resultado de la resta de " + op1 + " y " + op2 + " es " + (op1-op2));
		System.out.println("El resultado de la multiplicación de " + op1 + " y " + op2 + " es " + (op1*op2));
		System.out.println("El resultado de la división entre " + op1 + " y " + op2 + " es " + (op1/op2));
		System.out.println("El resto de la divisón es " + (op1%op2));
		
	}
}