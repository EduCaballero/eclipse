
public class endsWith {
	
	 String s = "ola k ase";
	 boolean b = s.endsWith("ase");
	 System.out.println(b);
	 b = s.endsWith("dfa");
	 System.out.println(b);
	 
	 String Str = new String("This is really not immutable!!");
     boolean retVal;

      retVal = Str.endsWith( "immutable!!" );
      System.out.println("Returned Value = " + retVal );

      retVal = Str.endsWith( "immu" );
      System.out.println("Returned Value = " + retVal );

}


String str6 = "ola k ase";
boolean var6 = str6.endsWith("ase");
System.out.println("La frase acaba con " + var6);
var6 = str6.endsWith("dfa");
System.out.println("La frase NO acaba con " + var6);