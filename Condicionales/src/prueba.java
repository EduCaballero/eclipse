
public class prueba {

	public static void main(String[] args){
		  int c,n;
		  Scanner leer= new Scanner(System.in);
		  System.out.println("Ingrese cantidad de cambio:");
		  c=leer.nextInt();
		  //validamos con un do-while la cantidad de monedas
		  do {
		   System.out.println("Ingrese cantidad de monedas:");
		   n=leer.nextInt();
		  } while (n<0 || n>100);
		  //creamos un vector para nuestras monedas y otro que alamacenará la cantidad de monedas
		  int[] vec=new int[n];
		  int[] mon=new int[n];
		  //leemos las monedas validando que estén entre el rango que nos piden
		  for (int i = 1; i < vec.length; i++) {
		   int z=i+1;
		   do {
		    System.out.print("Ingrese valor de moneda ["+z+"] :\t");
		    vec[i]=leer.nextInt();
		    System.out.println();
		   } while (vec[i]<0 || vec[i]>1000);
		   
		  }
		  //asignamos a la posición 0 el valor de uno, por que dice que todos el conjunto de monedas
		  //debe contar con una de valor uno
		  vec[0]=1;
		  //utilizamos un método de ordenamiento para poder comparar más rápido
		  //a las monedas de más valor
		  for (int i = 0; i < vec.length; i++) {
		   for (int j = 0; j < vec.length; j++) {
		   if (vec[i]>vec[j]) {
		    int op=vec[i];
		    vec[i]=vec[j];
		    vec[j]=op; 
		   }
		   } 
		  }
		  //CON UN FOR RESOLVEMOS EL EJERCICIO
		  for (int i = 0; i < mon.length; i++) {
		  //EN ESTE WHILE VALIDAREMOS QUE SE RESTE MONEDA POR MONEDA
		  while (c>=vec[i]) {
		   c=c-vec[i];
		   mon[i]++;
		  }
		  }
		  //FINALMENTE MOSTRAMOS LA SOLUCIÓN
		  System.out.print("Monedas ");
		  for (int i = 0; i < vec.length; i++) {
		   System.out.print("\t"+vec[i]);
		  }
		  System.out.println("");
		  System.out.print("Cantidad");
		  for (int i = 0; i < mon.length; i++) {
		   System.out.print("\t"+mon[i]);
		  }
		 }

		}

	
}
