import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class codigobarrasHecho {
 
        public static void main(String[] args) {
 
                try{
 
                        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                       
                        String codigoID="";
                        double suma = 0;
                        double op = 0;
                        String usuario = "";
                        
                        System.out.println("Este programa comprobará si el código introducido es un código de barras válido");
            			System.out.println();
                       
                        while(!usuario.equals("0")){
                       
                        System.out.println("Introduce codigo de barras");
                        usuario = buffer.readLine();
               
                        if(usuario.equals("0")) System.out.println("Fin del programa");
                        else{
                       
                        if (usuario.length() >= 2 && usuario.length() <= 13){
                                int codigo = 0;
                                if(usuario.length() >= 2 && usuario.length() <= 8){
                                        codigo = 8;
                                        codigoID = "EAN-8";
                                }else if(usuario.length() >= 9 && usuario.length() <= 13){
                                        codigo = 13;
                                        codigoID = "EAN-13";
                                }
                               
                                int []numero = new int [codigo];
                               
                                System.out.println(" ");
                               
                                for(int i = codigo-1, a = usuario.length()-1; a >= 0; i--, a--){
                                        numero[i]= Character.getNumericValue(usuario.charAt(a));
                                }
                               
                                for(int i=0; i < codigo; i++){
                                        System.out.print(numero[i]);
                                }
                                System.out.println();
                               
                                for (int i = codigo-2; i >= 0; i = i-2){
                                        numero[i]= numero[i]*3;                                     
                                }
                               
                                for(int i=0; i < codigo-1; i++){
                                        suma = suma + numero[i];
                                }
                               
                                op = (Math.ceil(suma/10)*10)- suma; //sirve para redondear al alza o al mínimo(el más cercano)
                               
                                if (op == numero[codigo-1]){
                                        System.out.println("El código introducido es válido. " +codigoID);
                                        numero = null;
                                        suma=0;
                                }
                                else if (op != numero[codigo-1]){
                                        System.out.println("El código introducido NO es válido. " +codigoID);
                                        numero = null;
                                        suma=0;
                                }
                        }else {
                                System.out.println("No es un codigo de barras valido.");
                        }
                       
                        }      
                        }
                }catch (Exception e){
 
                        System.out.println("Error en los números introducidos" +e);
                }      
 
        }
 
}