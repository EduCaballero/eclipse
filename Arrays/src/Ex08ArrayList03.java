import java.util.ArrayList;

public class Ex08ArrayList03 {
public static void main(String[] args) {
		
		try{
			
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
		        
		}
		
		catch (Exception e){
			System.out.println("Error al introducir los números " + e);
		}
		
	}
	
}
