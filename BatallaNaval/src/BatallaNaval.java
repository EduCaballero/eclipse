import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BatallaNaval {

	public static void main(String[] args) {
		try {
			int anchoH = 10; // Ancho horitzontal tablero 10x
			int anchoV = 10; // Ancho vertical tablero 10x
			int numBarcos = 4; // N�mero de barcos a colocar
			int medidaMinima = 2; // Medida m�nima de los barcos
			int numIntentos = 50; // N�mero de intentos
			boolean mostrar = true;
			char[][] tablero = new char[anchoV][anchoH];
			int intento = 1;
			int x = 0;
			int[] extraidos = new int[2];
			int numX = 0;

			agua(tablero); // Llamamos a agua para rellenar el tablero -ancho y
							// alto declarado arriba-

			for (int i = numBarcos + medidaMinima - 1; i > 1; i--) {
				colocaBarco(tablero, i);
				x = x + i;
			}

			imprimir(tablero, mostrar); // Esto s�lo se muestra de cara a
										// corregir f�cilmente o ver que el
										// juego funciona. No deber�a mostrarse
										// en una versi�n final
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Dispones de 50 intentos para hundir todos los barcos. �Hundamos la flota!");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Comienza el juego");
			do {
				extraidos = jugar(tablero, intento, x); // Ejecutamos SIEMPRE
														// una vez, primero.
				intento = extraidos[1];
				numX = numX + extraidos[0];
			} while (intento <= numIntentos && numX < x); // Y despu�s repetimos
															// hasta el intento
															// 50 -que ser�a el
															// 51-.

			System.out.println("");

			if (intento >= numIntentos) {
				System.out.println("Has perdido.");
			} else if (numX >= x) {
				System.out.println("�Est�s hecho todo un Blas de Lezo! Has ganado la batalla naval.");
			}
		}

		catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// Rellenar el tablero con agua
	static void agua(char[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '*';
			}
		}
	}

	// Imprimir tablero en pantalla
	static void imprimir(char[][] tablero, boolean mostrar) {
		System.out.print("   ");
		for (int i = 0; i < tablero[tablero.length - 1].length; i++) {
			System.out.print(" " + (i + 1));
		}
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < tablero.length; i++) {
			System.out.print((i + 1) + "  ");
			if (i < 9) {
				System.out.print(" ");
			}
			for (int j = 0; j < tablero[i].length; j++) {
				if (mostrar == false && tablero[i][j] == 'o') {
					System.out.print("* ");
				} else {
					System.out.print(tablero[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}

	// Colocar los barcos de manera random, sin sobreponerse unos con otros y
	// con un espacio entre ellos
	static void colocaBarco(char[][] tablero, int mida) {
		boolean agua = true;
		int ranFila = 0;
		int ranCol = 0;
		int ranorient = 0;
		do {
			agua = true;
			ranFila = (int) (Math.random() * tablero.length + 0);
			ranCol = (int) (Math.random() * tablero[tablero.length - 1].length + 0);
			ranorient = (int) (Math.random() * 2 + 0);
			for (int e = -1, i = 0; e <= mida + 1 && agua == true; e++) { // ancho
				for (int o = -1; o < 2 && agua == true; o++) {
					if (ranorient == 0) { // avanzar en esa misma fila
						if ((ranFila + o <= tablero.length - 1 && ranFila + o >= 0)
								&& (ranCol + e <= tablero[tablero.length - 1].length - 1 && ranCol + e >= 0)) {
							if (ranCol + i <= tablero[tablero.length - 1].length - 1) {
								if (tablero[ranFila + o][ranCol + e] != '*') {
									agua = false;
								}
							} else {
								agua = false;
							}
						}
					} else if (ranorient == 1) { // avanzar en esa misma columna
						if ((ranCol + o <= tablero[tablero.length - 1].length - 1 && ranCol + o >= 0)
								&& (ranFila + e <= tablero.length - 1 && ranFila + e >= 0)) {
							if (ranFila + i <= tablero.length - 1) {
								if (tablero[ranFila + e][ranCol + o] != '*') {
									agua = false;
								}
							} else {
								agua = false;
							}
						}
					}
				}
				if (i <= mida) {
					i++;
				}
			}
		} while (agua == false);

		for (int i = 0; i < mida; i++) {
			if (ranorient == 0) {
				tablero[ranFila][ranCol + i] = 'o';
			} else if (ranorient == 1) {
				tablero[ranFila + i][ranCol] = 'o';
			}
		}
	}

	// Jugar
	static int[] jugar(char[][] tablero, int intento, int x) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int[] extraer = new int[2];
		try {
			x = 0;
			boolean mostrar = false;
			System.out.println("");
			System.out.println("Intento numero " + intento + ".");
			System.out.println("Vertical:");
			int vertical = Integer.parseInt(buffer.readLine());
			System.out.println("Horizontal:");
			int horizontal = Integer.parseInt(buffer.readLine());
			if (horizontal >= 1 && horizontal <= 10 && vertical >= 1 && vertical <= 10) {
				vertical = vertical - 1;
				horizontal = horizontal - 1;

				if (tablero[vertical][horizontal] == '*') {
					tablero[vertical][horizontal] = 'A';
					System.out.println("Agua");
					intento++;
				} else if (tablero[vertical][horizontal] == 'o') {
					tablero[vertical][horizontal] = 'B';
					x++;
					System.out.println("Tocado");
					intento++;
				} else if (tablero[vertical][horizontal] == 'A' || tablero[vertical][horizontal] == 'B') {
					System.out.println("�Ya hab�as disparado en esta casilla! Debes estar m�s atento");
				}

			}

			else {
				System.out.println("�El tablero s�lo tiene 10 posiciones! -Escoge del 1 al 10-");
			}
			System.out.println("");
			imprimir(tablero, mostrar);
			extraer[0] = x;
			extraer[1] = intento;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		return extraer;
	}
}