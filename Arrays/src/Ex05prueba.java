
	/* 5. Escriure un programa en Java que llegeixi de teclat 10 nombres enters, 
	 * els quals haureu díemmagatzemar en un array. El programa haur‡ de comptar el nombre 
	 * de canvis de signe que hi ha. Un canvi de signe Ès líapariciÛ de dos enters de signes diferents, 
	 * separats com a m‡xim per zeros.
	 */
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class Ex05prueba{

		public static void main(String[] args) {

			try{
				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				int[]num = new int[10];
				int a = 0;
				int e = 0;
				int canvi = 0;

				System.out.println("Escriu 10 nombres enters (positius, negatius o ceros):");

				for(int i = 0; i <10; i++){
					System.out.println("Numero " +(i+1) +" :");
					num[i] = Integer.parseInt(buffer.readLine());
				}
				
				while(a<9){
					e = a;
					a++;
					while(num[a]==0 && a<9){
						a++;
					}

					if (num[e]>0 && num[a]<0){
						canvi++;
					}
					
					if (num[e]<0 && num[a]>0){
						canvi++;
					}

				}
				System.out.println(canvi);
				
			}

			catch (Exception e){
				System.out.println("error: " + e);
			}
		}
	}
