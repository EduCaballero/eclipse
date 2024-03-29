package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

public class pruebas {
	public static void main(String[] args) {
		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			int opt = 0;
			double opt4 = 0;
			int sel = 0;
			int pass = 0;
			int ocho = 0;
			String intuicion = "IGUAL";
			String intuicion2 = "LO MISMO";
			int[][] avengers = new int[4][5];
			ArrayList<String> nombres = new ArrayList<String>();
			nombres.add("Capit�n Am�rica");
			nombres.add("Iron Man");
			nombres.add("Viuda Negra");
			nombres.add("Thor");
			ArrayList<String> habilidades = new ArrayList<String>();
			habilidades.add("Fuerza");
			habilidades.add("Inteligencia");
			habilidades.add("Velocidad");
			habilidades.add("Intuici�n");
			habilidades.add("Inmortalidad");
			double puntos = 0;
			double[] puntosTodos = new double[4];
			double[] operacion = { 0.3, 0.3, 0.2, 0.1, 0.1 };
			double[][] ranked = new double[4][2];
			DecimalFormat df = new DecimalFormat("0"); // esto es para decir cuantos decimales quiero, en este caso, ninguno.
														//Va junto a el syso de abajo
			// System.out.println(df.format(nombreVariableDouble));
			DecimalFormat df2 = new DecimalFormat("0.00");// En este caso, 2 decimales
			double mision = 0;
			double puntostotales = 0;
			double puntostotales2 = 0;
			double[] puntajedesc = new double[4];
			String[] nombredesc = new String[4];
			int cont = 1;
			boolean opcion1 = false;

			while (opt != 5) {

				System.out.println();
				System.out.println("Pulsa el n�mero correspondiente para seleccionar la opci�n:");
				System.out.println("===============================================================");
				System.out.println("1. Registrar datos aleatorios");
				System.out.println("2. Evaluar el m�s superh�roe");
				System.out.println("3. Analizar misiones");
				System.out.println("4. Reponer habilidades");
				System.out.println("5. Salir");
				System.out.println();
				opt = Integer.parseInt(buffer.readLine());

				if (opt == 5)
					System.out.println("El mundo sigue a salvo con nosotros, aunque seamos menos");

				if (opt > 5 || opt <= 0) {
					System.out.println("Error. Opci�n no v�lida");
					System.out.println();
				}

				if (opt == 1) {
					opcion1 = true;
					while (pass != 1234) {
						System.out.println("Introduce la contrase�a supersecreta:");
						pass = Integer.parseInt(buffer.readLine());
					}

					for (int x = 0; x < avengers.length; x++) {
						System.out.println(nombres.get(x) + ":"); // esto se utiliza para los arraylist NO sirve para los array normales
						for (int j = 0; j < avengers[x].length; j++) {
							avengers[x][j] = (int) (Math.random() * 10);
							// System.out.print ("En la posici�n " + x + " " + j + " has introducido " + avengers[x][j]);

							System.out.println(habilidades.get(j) + ": " + avengers[x][j]);
						}

						System.out.println("");
					}
					pass = 0;
				}

				if (opt == 2) {
					if (opcion1 == true) {
						// esto se podr�a hacer arriba, en el mismo bucle, pero mejor as� para entenderlo m�s adelante
						for (int x = 0; x < avengers.length; x++) {
							for (int j = 0; j < avengers[x].length; j++) {
								// System.out.print ("En la posici�n " + x + " " + j + " has introducido " + avengers[x][j]);
								/*
								 * System.out.println("PUNTOS: "+puntos); ---ESTO Y LO DE ABAJO ES S�LO para comprobar la operaci�n.
								 * System.out.println("OPERACION: "+avengers[x][j]+" x "+ operacion[j]+ " = "+avengers[x][j]*operacion[j] );
								 */
								puntos = puntos + (avengers[x][j] * operacion[j]);
								// System.out.println("PUNTOS A COMPROBAR: "+puntos);
								puntosTodos[x] = 0;// por si vuelves a ejecutar que no vaya sumando puntos infinito
							}
							puntosTodos[x] = puntos;
							puntos = 0;
						}
						// -----------------------------------con esto hago ranking!--------------------------------------------------------

						for (int i = 0; i < puntosTodos.length; i++)
							ranked[i][0] = puntosTodos[i];
						Arrays.sort(puntosTodos);

						for (int i = 0; i < puntosTodos.length; i++)
							for (int n = 0; n < puntosTodos.length; n++)
								if (ranked[n][0] == puntosTodos[i] && ranked[n][1] == 0)
									ranked[n][1] = puntosTodos.length - i;
						// -----------------------------------------------------------------------------------------------------------------

						for (int i = 0; i < ranked.length; i++) {
							System.out.print(nombres.get(i) + " ha quedado en " + df.format(ranked[i][1])
									+ "� posici�n con " + df2.format(ranked[i][0]) + " puntos");
							System.out.println();
						}
					} else
						System.out.println("Debes seleccionar la primera opci�n del men� primero!");
				}

				if (opt == 3) {
					if (opcion1 == true) {
						mision = 0;
						puntostotales = 0;
						puntostotales2 = 0;
						cont = 1;
						System.out.println("Escribe la dificultad de la misi�n:");
						mision = Double.parseDouble(buffer.readLine());

						for (int i = 0; i < 4; i++) {// Con esto creo un array ordenado descendente desde el array bidimensional ranked
														// y, a la vez, creo otro con los nombres en el mismo orden
							if (ranked[i][1] == 1.0) {
								puntajedesc[0] = ranked[i][0];
								nombredesc[0] = nombres.get(i);
							}
							if (ranked[i][1] == 2.0) {
								puntajedesc[1] = ranked[i][0];
								nombredesc[1] = nombres.get(i);
							}
							if (ranked[i][1] == 3.0) {
								puntajedesc[2] = ranked[i][0];
								nombredesc[2] = nombres.get(i);
							}
							if (ranked[i][1] == 4.0) {
								puntajedesc[3] = ranked[i][0];
								nombredesc[3] = nombres.get(i);
							}
							puntostotales += puntosTodos[i];
						}

						/*
						 * System.out.println("los puntos totales son----------"+puntostotales);-------PARA PRUEBAS!! 
						 * for(int i=0;i<4;i++){
						 * System.out.println(nombredesc[i]+": "+puntajedesc[i]+" puntos"); }
						 */
						System.out.println();
						if (mision > puntostotales) {
							System.out.println("�Todos a la misi�n! �Tened con cuidado!");
							for (int i = 0; i < 4; i++) {
								System.out.println(nombredesc[i] + ": " + df2.format(puntajedesc[i]) + " puntos");
							}
						}
						// int mision=0;
						// double puntostotales=0;
						if (mision < puntostotales) {
							puntostotales2 += puntajedesc[0];
							while (mision > puntostotales2) {
								puntostotales2 += puntajedesc[cont];
								cont++;
							}
							System.out
									.println("Los vengadores que van a ir a la misi�n y su puntaje son los siguientes");
							System.out
									.println("_______________________________________________________________________");
							for (int i = 0; i < cont; i++) {
								System.out.println(nombredesc[i] + ": " + df2.format(puntajedesc[i]) + " puntos");
							}
						}
					} else
						System.out.println("Debes seleccionar la primera opci�n del men� primero!");
				}

				if (opt == 4) {
					if (opcion1 == true) {
						while (opt4 != 4.6) {
							System.out.println("4.1 Mejorar fuerza");
							System.out.println("4.2 Mejorar inteligencia");
							System.out.println("4.3 Mejorar velocidad");
							System.out.println("4.4 Mejorar intuici�n");
							System.out.println("4.5 Mejorar inmortalidad");
							System.out.println("4.6 Atr�s");
							System.out.println();
							
							opt4 = Double.parseDouble(buffer.readLine());
							if (opt4 != 4.1 && opt4 != 4.2 && opt4 != 4.3 && opt4 != 4.4 && opt4 != 4.5 && opt4 != 4.6){
								System.out.println("Error. Selecciona la opci�n correcta (4.1, 4.2, 4.3... o 4.6");
							}

							if (opt4 == 4.1) {
								System.out.println("Selecciona el n�mero que corresponde a tu superh�roe:");
								System.out.println("1. Capit�n Am�rica");
								System.out.println("2. Iron Man");
								System.out.println("3. Viuda Negra");
								System.out.println("4. Thor");
								System.out.println();
								sel = Integer.parseInt(buffer.readLine());
								if (sel == 1) {
									System.out.println("El Capit�n Am�rica ten�a " + avengers[0][0] + " puntos fuerza");
									avengers[0][0] += 1;
									System.out.println("Ahora tiene " + avengers[0][0] + " puntos fuerza");
								}
								if (sel == 2) {
									System.out.println("Iron Man ten�a " + avengers[1][0] + " puntos fuerza");
									avengers[1][0] += 1;
									System.out.println("Ahora tiene " + avengers[1][0] + " puntos fuerza");
								}
								if (sel == 3) {
									System.out.println("La Viuda Negra ten�a " + avengers[2][0] + " puntos fuerza");
									avengers[2][0] += 1;
									System.out.println("Ahora tiene " + avengers[2][0] + " puntos fuerza");
								}
								if (sel == 4) {
									System.out.println("Thor ten�a " + avengers[3][0] + " puntos fuerza");
									avengers[3][0] += 1;
									System.out.println("Ahora tiene " + avengers[3][0] + " puntos fuerza");
								}
							}

							if (opt4 == 4.2) {
								System.out.println("Selecciona el n�mero que corresponde a tu superh�roe:");
								System.out.println("1. Capit�n Am�rica");
								System.out.println("2. Iron Man");
								System.out.println("3. Viuda Negra");
								System.out.println("4. Thor");
								System.out.println();
								sel = Integer.parseInt(buffer.readLine());
								System.out.println("Pregunta de seguridad: �C�anto es 4+4?");
								ocho = Integer.parseInt(buffer.readLine());
								if (ocho == 8) {
									if (sel == 1) {
										System.out.println(
												"El Capit�n Am�rica ten�a " + avengers[0][1] + " puntos inteligencia");
										avengers[0][1] += 1;
										System.out.println("Ahora tiene " + avengers[0][1] + " puntos");
									}
									if (sel == 2) {
										System.out.println("Iron Man ten�a " + avengers[1][1] + " puntos inteligencia");
										avengers[1][1] += 1;
										System.out.println("Ahora tiene " + avengers[1][1] + " puntos");
									}
									if (sel == 3) {
										System.out.println(
												"La Viuda Negra ten�a " + avengers[2][1] + " puntos inteligencia");
										avengers[2][1] += 1;
										System.out.println("Ahora tiene " + avengers[2][1] + " puntos");
									}
									if (sel == 4) {
										System.out.println("Thor ten�a " + avengers[3][1] + " puntos inteligencia");
										avengers[3][1] += 1;
										System.out.println("Ahora tiene " + avengers[3][1] + " puntos");
									}
								}
								if (ocho != 8)
									System.out.println("Te quedas con las ganas mentirosillo...");
							}

							if (opt4 == 4.3) {
								System.out.println("Selecciona el n�mero que corresponde a tu superh�roe:");
								System.out.println("1. Capit�n Am�rica");
								System.out.println("2. Iron Man");
								System.out.println("3. Viuda Negra");
								System.out.println("4. Thor");
								System.out.println();
								sel = Integer.parseInt(buffer.readLine());
								if (sel == 1) {
									System.out.println(
											"El Capit�n Am�rica ten�a " + avengers[0][2] + " puntos velocidad");
									avengers[0][2] += 1;
									System.out.println("Ahora tiene " + avengers[0][2] + " puntos");
								}
								if (sel == 2) {
									System.out.println("Iron Man ten�a " + avengers[1][2] + " puntos velocidad");
									avengers[1][2] += 1;
									System.out.println("Ahora tiene " + avengers[1][2] + " puntos");
								}
								if (sel == 3) {
									System.out.println("La Viuda Negra ten�a " + avengers[2][2] + " puntos velocidad");
									avengers[2][2] += 1;
									System.out.println("Ahora tiene " + avengers[2][2] + " puntos");
								}
								if (sel == 4) {
									System.out.println("Thor ten�a " + avengers[3][2] + " puntos velocidad");
									avengers[3][2] += 1;
									System.out.println("Ahora tiene " + avengers[3][2] + " puntos");
								}
							}

							if (opt4 == 4.4) {
								System.out.println("Selecciona el n�mero que corresponde a tu superh�roe:");
								System.out.println("1. Capit�n Am�rica");
								System.out.println("2. Iron Man");
								System.out.println("3. Viuda Negra");
								System.out.println("4. Thor");
								System.out.println();
								sel = Integer.parseInt(buffer.readLine());
								System.out.println(
										"�Pesa m�s un quilo de hierro o un quilo de plumas? Responde EN MAY�SCULAS");
								intuicion = buffer.readLine();
								intuicion2 = buffer.readLine();
								ocho = Integer.parseInt(buffer.readLine());
								if (intuicion == "IGUAL" || intuicion2 == "LO MISMO") {
									if (sel == 1) {
										System.out.println(
												"El Capit�n Am�rica ten�a " + avengers[0][3] + " puntos intuici�n");
										avengers[0][3] += 1;
										System.out.println("Ahora tiene " + avengers[0][3] + " puntos");
									}
									if (sel == 2) {
										System.out.println("Iron Man ten�a " + avengers[1][3] + " puntos intuici�n");
										avengers[1][3] += 1;
										System.out.println("Ahora tiene " + avengers[1][3] + " puntos");
									}
									if (sel == 3) {
										System.out.println(
												"La Viuda Negra ten�a " + avengers[2][3] + " puntos intuici�n");
										avengers[2][3] += 1;
										System.out.println("Ahora tiene " + avengers[2][3] + " puntos");
									}
									if (sel == 4) {
										System.out.println("Thor ten�a " + avengers[3][3] + " puntos intuici�n");
										avengers[3][3] += 1;
										System.out.println("Ahora tiene " + avengers[3][3] + " puntos");
									}
								}
							}

							if (opt4 == 4.5)
								System.out.println(
										"No es posible mejorar tu inmortalidad. Cuando te llegue el momento deber�s aceptarlo");

						}
					} else
						System.out.println("Debes seleccionar la primera opci�n del men� primero!");
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
