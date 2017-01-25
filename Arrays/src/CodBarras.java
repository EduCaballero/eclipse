import java.io.*;
import java.util.ArrayList;

public class CodBarras {
	public static void main(String[] args) {
		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			int opt=1;
			int[]ean8=new int[8];
			int[]ean13=new int[13];
			int[]ean=new int[13];
			
			System.out.println("Este programa comprobar� si el c�digo introducido es un c�digo de barras v�lido");
			System.out.println();
			
			while (opt!=0){
				
				System.out.println("Pulsa el n�mero correspondiente para seleccionar la opci�n:");
				System.out.println();
				System.out.println("===============================================================");
				System.out.println();
				System.out.println("0. SALIR");
				System.out.println();
				System.out.println("1. INTRODUCIR C�DIGO DE BARRAS");
				System.out.println();
				opt= Integer.parseInt(buffer.readLine());
				
				if(opt==0)System.out.println("FIN DEL PROGRAMA");
				
				if(opt==1){
					System.out.println("Introduce el c�digo de barras a comprobar:");
					
					for (int i= 0; i<ean8.length; i++){
						ean8[i]= Integer.parseInt(buffer.readLine()); // con esto recorremos el array entero metiendo datos
					}
					
				}
				
				else {
					System.out.println("Opci�n incorrecta");
				}

				
				
				
				/*char cad[100];
int array[100], index = 0;
cin >> cad;
for(int i = 0; i < strlen(cad); i++) {
    if(cad[i] >= '0' && cad[i] <= '9') {
        array[index] = cad[i] - '0'; // El - '0' para pasar a int
        index++;
    } else {
        cout << cad[i] << " no es un numero";
    }
}
 
//Mostramos el array
for(int i = 0; i < index; i++) {
    cout << array[i] << endl;
}
 */
				
				
				
			}			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
