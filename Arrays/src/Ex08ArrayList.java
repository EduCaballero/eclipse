import java.util.*;

public class Ex08ArrayList {
public static void main(String[] args) {
		
		try{
			
			// 1. Crear un primer ArrayList de tipus variable, amb 10 elements inicials, de diferents tipus de dades.
			
			ArrayList firstarray = new ArrayList();
			
			firstarray.add("Hola");
			firstarray.add("¿Qué tal?");
			firstarray.add(15);
			firstarray.add(15.5);
			firstarray.add("Mitad de array");
			firstarray.add("¿Seguimos?");
			firstarray.add(20);
			firstarray.add(85.5);
			firstarray.add("Acabando");
			firstarray.add("Fin de array");

			
			for(int i = 0;i<firstarray.size();i++){
				 System.out.println(firstarray.get(i));
				}
			
		System.out.println();
			
	// 2.	Crear un segon ArrayList amb tots els seus valors de tipus enter, amb 15 valors inicials de diferents nombres. 
			
			ArrayList<Integer> secondarray = new ArrayList<Integer>();
			
			/*for(int i=0;i<15;i++){  hacerlo así es lo mismo que debajo
				secondarray.add(i);

			}*/
			
			secondarray.add(15);
			secondarray.add(16);
			secondarray.add(17);
			secondarray.add(18);
			secondarray.add(19);
			secondarray.add(20);
			secondarray.add(21);
			secondarray.add(22);
			secondarray.add(23);
			secondarray.add(24);
			secondarray.add(25);
			secondarray.add(26);
			secondarray.add(27);
			secondarray.add(28);
			secondarray.add(29);
			
			for(int i = 0;i<secondarray.size();i++){
				 System.out.println(secondarray.get(i));
				}
			System.out.println();
			
//3 . Crear un tercer ArrayList amb tots els seus valors de tipus String, amb 8 valors inicials de diferents paraules.
			
			ArrayList<String> thirdarray = new ArrayList<String>();
			
			thirdarray.add("Hola");
			thirdarray.add("esto");
			thirdarray.add("es");
			thirdarray.add("un");
			thirdarray.add("array");
			thirdarray.add("de");
			thirdarray.add("ocho");
			thirdarray.add("strings");
			
			
			for(int i = 0;i<thirdarray.size();i++){
				 System.out.println(thirdarray.get(i));
				}
			
			System.out.println();
		 
/*5.	Treballar sobre el primer array creat: 
 
a.	Eliminar el valor de la primera posició. Com queda ara l’array? Mostra’l per pantalla. 
 
b.	Afegir un element de tipus caràcter a la primera posició. Com queda ara l’array? Mostra’l per pantalla. 
 
c.	Mostrar el contingut de la posició 3 de l’array. 
*/
			
			firstarray.remove(0);
			
			for(int i = 0;i<firstarray.size();i++){
				 System.out.println(firstarray.get(i));
				}
			
			System.out.println();
			
			firstarray.add(0, 'a');
			
			for(int i = 0;i<firstarray.size();i++){
				 System.out.println(firstarray.get(i));
				}
			
			System.out.println();
			
			System.out.println(firstarray.get(2));
			
			System.out.println();
			
	// 6.	Mostra la mida actual dels tres arrays amb un únic missatge de text per pantalla. 
			
			System.out.println("El tamaño del primer array es " + firstarray.size() + ", el tamaño del segundo array es " + secondarray.size() + " y el tamaño del tercer array es " + thirdarray.size());
			System.out.println();
			
	/* 
			7.	Treballar sobre el segon array creat: 
				 
				a.	Sumar els valors de les tres primers posicions de l’array, guardar el resultat en una variable i mostrar el resultat per pantalla. 
				b.	Afegir un nou valor a la posició 50 de l’array. Surt algun error? On s’afegeix l’element? Mostra l’array per pantalla. 
*/
			int sumaarray2=0;
			
			for(int i = 0;i<3;i++){
				sumaarray2+=secondarray.get(i);
				}
			System.out.println("El resultado de la suma de las tres primeras posiciones es " + sumaarray2);
			System.out.println();
			
			//secondarray.add(50, 4);
			
			for(int i = 0;i<secondarray.size();i++){
				 System.out.println(secondarray.get(i));
				}
			System.out.println();
			
	// 8.	Comprovar si el valor “hola” es troba en el tercer array o no. 			
			
			System.out.println(thirdarray.contains("Hola")); //Es case sensitive, la he puesto en mayúscula para que devuelva true, si pongo "hola" devuelve false.
			System.out.println();
			
	//	9.	Comprovar si el valor 5 es troba en el segon array, i si es troba, indicar en quina posició està. 
			
			System.out.println(secondarray.contains(5)); 
			System.out.println(secondarray.indexOf(5));
			System.out.println();
			
	// 10.	Eliminar el primer array creat. 
			
			firstarray.clear();
			for(int i = 0;i<firstarray.size();i++){
				 System.out.println(firstarray.get(i));
				}
			
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
		
	}
	
}
