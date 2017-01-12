import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10{

	public static void main(String[] args) {

		try{
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Buscador de palabras");
			int z=1;
			int positivo = 0;
			
			while (z!=0){
			System.out.println("Escribe una frase");
			String frase = buffer.readLine();
			char[]letrasfrase = frase.toCharArray();

			System.out.println("Ahora, di que conjunto de caracteres quieres buscar");
			String palabra = buffer.readLine();
			char[]letraspalabra = palabra.toCharArray();
						
			if(letraspalabra.length<=letrasfrase.length){

				for(int i=0; i<letrasfrase.length && letraspalabra.length<=(letrasfrase.length -i); i++){
					
					if(letrasfrase[i] == letraspalabra[0]){

						for(int a=0; a<letraspalabra.length; a++){
														
							if(letrasfrase[i]==letraspalabra[a]){
								
								String coincide = "";
								
								for(int e=0; e<letraspalabra.length; e++){
									coincide = coincide.concat(Character.toString(letrasfrase[i+e]));
								}

								if(coincide.equals(palabra)){
									positivo++;
								}
								
							}
							
						}
						
					}
					
				}
				
				if(positivo>0){
					System.out.println("El conjunto de caracteres que buscas SI está en la frase que has escrito anteriormente");
				}
				else{
					System.out.println("El conjunto de caracteres que buscas NO está en la frase que has escrito anteriormente");
				}

			}
			else {
				System.out.println("Error al introducir la búsqueda: la búsqueda es más larga que el array");
			}
			
			System.out.println("Si quieres salir del programa, pulsa 0. Si quieres continuar buscando, pulsa cualquier otro número"); 
	        z = Integer.parseInt(buffer.readLine());
			
			}

		}

		catch (Exception e){
			System.out.println("Error al introducir los datos" + e);
		}
	}
}