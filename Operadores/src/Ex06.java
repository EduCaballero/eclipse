
public class Ex06 {
	public static void main (String[] args) {

		double a = 5;
		double b = 4;
		double c = 3;
		double p = (a+b+c)/2;
		
		System.out.println("El área del triangulo es según los datos introducidos es " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
}