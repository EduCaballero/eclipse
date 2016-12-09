
public class Ex1 {
	
	public static void main(String[] args) {
		
		int [] pares = new int[20]; //Declaro e inicio el array
		int i;
		int cont=2;
		
		for (i = 0; i < pares.length; i++ ){ //i =0 y hasta que i no sea igual de largo que el array (20 en este caso) sumará 1 a i
			pares[i]=cont; // cada posición, que será igual que i, tendrá el valor de cont, que empieza en 2
			cont+=2; // a cada vuelta le sumamos 2 a contador
		}
		
		for (i=0; i<pares.length; i++){
			System.out.println(pares[i]);
		}
		
		
	}

}
