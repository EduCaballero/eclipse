import java.util.ArrayList;

public class Ex08ArrayList02 {
public static void main(String[] args) {
		
		try{
			
			// 2.	Crear un segon ArrayList amb tots els seus valors de tipus enter, amb 15 valors inicials de diferents nombres. 
			
			ArrayList<Integer> secondarray = new ArrayList<Integer>();
			
			/*for(int i=0;i<15;i++){  hacerlo as� es lo mismo que debajo
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
		        
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los n�meros " + e);
		}
		
	}
	
}