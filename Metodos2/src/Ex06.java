import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex06 {
	
	public static void sumar(int [][] recorrer){
		int suma=0;
		for (int x = 0; x < recorrer.length; x++) { 
			suma=0;
			for (int j = 0; j < recorrer[x].length; j++) {
				suma= suma + recorrer[x][j];
			}
			System.out.println("El comercial "+x+" ha vendido: "+suma);
		}
	}
	
	//---------------------LAS DOS SIGUIENTES HACEN LO MISMO------------------------
	
	public static void obtenerTotalProducto(int k[][]) {
		int sumacolumnas = 0;
		int fila=k.length;
		int columnas=k[0].length;		
			/*recorro las columnas*/        
		for (int j = 0; j < columnas; j++) {
			sumacolumnas = 0;            /*recorro las filas*/
			for (int i = 0; i < fila;i++) { /*ahora se en que fila y columna estoy, sumo toda la columna*/
				sumacolumnas = sumacolumnas + k[i][j];
				}
			System.out.println(sumacolumnas);
			}
		}
	
	
	public static void sumarProductos(int [][] recorrer){
		int suma=0;
		for (int x = 0; x < recorrer[0].length; x++) { 
			suma=0;
			for (int j = 0; j < recorrer.length; j++) {
				suma= suma + recorrer[j][x];
			}
			System.out.println("El producto "+x+" ha vendido: "+suma);
		}
	}
	
	//---------------------LAS DOS ANTERIORES HACEN LO MISMO------------------------

	
	public static void max(int [][] recorrer){
		int suma=0;
		int max=0;
		int comercial=0;
		for (int x = 0; x < recorrer.length; x++) { 
			suma=0;
			for (int j = 0; j < recorrer[x].length; j++) {
				suma= suma + recorrer[x][j];
			}
			if(suma>max){
				comercial=x;
				max=suma;
			}
		}
		System.out.println("El comercial que m�s ha vendido es "+comercial+" con "+max+" unidades");
	}
	
	
	public static void min(int [][] recorrer){
		int suma=0;
		int min=999999999;
		int producto=0;
		for (int x = 0; x < recorrer[0].length; x++) { 
			suma=0;
			for (int j = 0; j < recorrer.length; j++) {
				suma= suma + recorrer[j][x];
			}
			if(suma<min){
				producto=x;
				min=suma;
			}
		}
		System.out.println("El producto que menos ha vendido es "+producto+" con "+min+" unidades");
	}
	

	public static void main(String[] args) {
		
		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int n, m;
			int opt = 0;
			System.out.println("N�mero de comerciales a introducir:");
			n = Integer.parseInt(buffer.readLine());
			System.out.println("N�mero de productos a introducir:");
			m = Integer.parseInt(buffer.readLine());

			int[][] ventasMatriz = new int[n][m];

			for (int x = 0; x < ventasMatriz.length; x++) { // con esto recorro la matriz llen�ndola de n�meros random
				for (int j = 0; j < ventasMatriz[x].length; j++) {
					ventasMatriz[x][j] = (int) (Math.random() * 10);
					// System.out.print ("En la posici�n " + x + " " + j + " has introducido " + ventasMatriz[x][j]);
				}
				// System.out.println(""); // este y el de arriba s�lo los utilizo para comprobar que random mete los n�meros bien
			}

			while (opt != 5) {

				System.out.println();
				System.out.println("Pulsa el n�mero correspondiente para seleccionar la opci�n:");
				System.out.println("===============================================================");
				System.out.println("1. Ventas totales de cada comercial");
				System.out.println("2. Ventas totales de cada producto");
				System.out.println("3. Comercial que m�s ha vendido");
				System.out.println("4. Producto menos vendido");
				System.out.println("5. Salir");
				System.out.println();
				opt = Integer.parseInt(buffer.readLine());

				if (opt == 5)
					System.out.println("Adeu!");

				if (opt > 5 || opt <= 0) {
					System.out.println("Error. Opci�n no v�lida");
					System.out.println();
				}
				
				if (opt==1){
					sumar(ventasMatriz);
				}
				
				if (opt==2){
					sumarProductos(ventasMatriz);
				}

				if (opt==3){
					max(ventasMatriz);
				}

				if (opt==4){
					min(ventasMatriz);
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
