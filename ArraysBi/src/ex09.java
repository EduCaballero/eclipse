import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex09 {
	public static void main(String[] args) throws IOException {
		
		/*9. EL JUEGO DE LAS 3 PUERTAS. Realizar un programa que simule un juego. Éste consta de
			tres niveles, con tres puertas en cada nivel, de las cuales una es buena y las otras dos son
			malas. El jugador debe ir eligiendo por qué puerta pasar hasta llegar al final del juego. El juego
			constará de tres niveles de dificultad. Puertas.java
			Inicialmente, las puertas buenas son asignadas de manera aleatoria mediante el método
			RANDOM de Java.
			
			NIVEL FÁCIL: Cuando el usuario falla una puerta buena, se queda en el nivel donde está.
			Cuando el usuario acierta una puerta buena, pasa al siguiente nivel. Gana cuando pasa el
			tercer nivel.
			
			NIVEL MEDIO: Cuando el usuario falla una puerta buena, retrocede un nivel o bien se queda
			donde está si ya estaba en el primer nivel. Cuando el usuario acierta una puerta buena, pasa
			al siguiente nivel. Gana cuando pasa el tercer nivel.
			
			NIVEL AVANZADO: Cuando el usuario falla una puerta buena, retrocede un nivel o bien se
			queda donde está si ya estaba en el primer nivel. Cuando el usuario acierta una puerta buena,
			pasa al siguiente nivel. Gana cuando pasa el tercer nivel. Cada vez que el usuario retrocede
			un nivel, las puertas buenas son generadas de nuevo de manera aleatoria. El usuario tiene 7
			oportunidades para ganar el juego.*/
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int[][] matrix = new int[3][3];
		int random = 0;
		int puertaSelect = Integer.MAX_VALUE;

		System.out.println("Juego de las 3 puertas");
		System.out.println("---------NIVEL--------");
		System.out.println("1-Fácil");
		System.out.println("2-Medio");
		System.out.println("3-Difícil");
		System.out.println("-----------------");
		System.out.println("");
		System.out.println("Selecciona opción");
		String op = buffer.readLine();
		int opcion = Integer.parseInt(op);

		switch (opcion) {

		case 1:

			for (int i = 0; i < matrix.length; i++) {
				puertaSelect = Integer.MAX_VALUE;
				random = (int) (Math.random() * ((matrix.length - 1) - 0 + 1) + 0);
				matrix[i][random] = 1;

				while (puertaSelect != random) {
					System.out.println("Nivel:" + i + " Selecciona una puerta del 0 al " + (matrix.length - 1));
					String ps = buffer.readLine();
					puertaSelect = Integer.parseInt(ps);
					if (puertaSelect == random)
						System.out.println("Puerta acertada");
					else
						System.out.println("Puerta incorrecta");
				}

			}
			System.out.println(" ");
			System.out.println("Enhorabuena has salido");

			break;

		case 2:

			ArrayList<Integer> puertas = new ArrayList<Integer>();

			for (int i = 0; i < matrix.length; i++) {
				puertas.add(i, (int) (Math.random() * ((matrix.length - 1) - 0 + 1) + 0));
			}

			int i = 0;

			while (i < matrix.length) {
				System.out.println("Nivel:" + i + " Selecciona una puerta del 0 al " + (matrix.length - 1));
				String ps = buffer.readLine();
				puertaSelect = Integer.parseInt(ps);
				if (puertaSelect == puertas.get(i)) {
					System.out.println("Puerta acertada");
					i++;
				} else {
					System.out.println("Puerta incorrecta");
					if (i > 0)
						i--;
				}
			}

			System.out.println(" ");
			System.out.println("Enhorabuena has salido");

			break;

		case 3:

			int j = 0;
			int vidas = 7;
			int random2 = 0;

			while (j < matrix.length && vidas > 0) {
				System.out.println(
						"Nivel:" + j + ", Selecciona una puerta del 0 al " + (matrix.length - 1) + ", Vidas:" + vidas);
				String ps = buffer.readLine();
				puertaSelect = Integer.parseInt(ps);
				random2 = (int) (Math.random() * ((matrix.length - 1) - 0 + 1) + 0);
				if (puertaSelect == random2) {
					System.out.println("Puerta acertada");
					j++;
				} else {
					System.out.println("Puerta incorrecta");
					if (j > 0)
						j--;
					vidas--;
				}

			}

			if (vidas == 0)
				System.out.println("Te has quedado sin vidas");
			else
				System.out.println("Enhorabuena has salido");

			break;

		}

	}
}
