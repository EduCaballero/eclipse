import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hormigas2 {
    public static void main(String[] args){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try{
        	
        	//math.max y math.min
        	//cuanto mide la pista y cuantas hormigas quieres colocar
        	//en que posicion quieres colocar las hormigas
            System.out.println("�Cu�ntas hormigas hay en la pista?");
            int numerodehormigas =Integer.parseInt(buffer.readLine());
            System.out.println("�Cu�nto mide la pista");
            int x= Integer.parseInt(buffer.readLine());
            
            int min=0; //sin uso
            
           // if (numerodehormigas==4){

                int [] hormigas= new int [numerodehormigas];
                int [] posiciones = new int [x];
                int menor= 0;
                int max=0;
                int z=0;
                
                for(int i=0;i<numerodehormigas;i++){
                	System.out.println("En qu� posici�n quieres hormigas?");
                	z= Integer.parseInt(buffer.readLine());
                	posiciones[z]=1; // con esto recorremos el array entero metiendo datos
                }
                
                for (int i=0;i<x;i++){
                	if(posiciones[i]==1){
                		if(p)
                	}
                }
                
                /*for (int i= 0; i<n.length; i++){
				n[i]= Integer.parseInt(buffer.readLine()); // con esto recorremos el array entero metiendo datos
				if(n[i]==0){
					c++;
				}*/
                
                /*hormigas[0]=3;
                hormigas[1]=11;
                hormigas[2]=12;
                hormigas[3]=13;*/
                //Con esto guardo la posici�n
                //x=20; //tama�o de pista
              
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}