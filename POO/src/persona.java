class persona{

	//Atributos nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. N
	private String dni;
	private String nombre="";
	private int edad=0;
	private char sexo='H';
	private double peso=0;
	private double altura=0;

	// Constructores

	// Constructor vacío
	public persona(){
	}

	// Constructor con parámetros
	public persona(String nombre, int edad, char sexo, double peso, double altura){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setSexo(sexo);
		this.setPeso(peso);
		this.setAltura(altura);
		generaDni();
		
	}
	
	//o Un constructor con el nombre, edad y sexo, el resto por defecto.
	public persona(String nombre, int edad, char sexo){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setSexo(sexo);
		generaDni();
	}
	

	//Setters

	
	public void setNombre(String nombreNuevo){
		this.nombre = nombreNuevo;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	
	/*public void setSexo(char sexo){   ------Con esto podríamos comprobarlo directamente sin usar el método creado abajo
		if(sexo=='H' || sexo=='M' || sexo=='h' || sexo=='m')this.sexo = sexo;
		else this.sexo='H';
	}	*/
	
	public void setPeso(double peso){
		this.peso=peso;
	}
	
	public void setAltura(double altura){
		this.altura=altura;
	}

	//Getters
	//(String dniNuevo, String nombre, int edad, String sexo, double peso, double altura)

	public String getDni(){
		return this.dni;
	}
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	public char getSexo(){
		return this.sexo;
	}
	public double getPeso(){
		return this.peso;
	}
	public double getAltura(){
		return this.altura;
	}

	//Otros metodos de la clase
	
	public void generaDni(){
		int x=(int) (99999999*Math.random()+10000000);
		char letra = generaLetra(x);
		this.dni = Integer.toString(x)+ letra;
	}

	public char generaLetra(int dni){

		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo= dni % 23;
		char letra = juegoCaracteres.charAt(modulo);
		return letra; 
	}

	public String mostrarInfo(){
		return ("El nombre es " + this.nombre + " y el DNI es " + this.dni);
				
	}
	
	/*calcularIMC(): calculará si la persona está en su peso ideal (peso en kg/(altura^2
	en m)), devuelve un -1 si está por debajo de su peso ideal, un 0 si está en su peso
	ideal y un 1 si tiene sobrepeso.
	Math.pow(a, b) donde a es la base y b el exponente. 
	*/
	
	public int imc(){
		double imc=this.peso/(Math.pow(this.altura,2));
		if(imc>18.5) return -1;
		else if(imc<25 && imc>=18.5) return 0;
		else return 1;
	}
	
	//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano

	public boolean esMayorDeEdad(){
		if (this.edad>17) return true;
		else return false;		
	}
	
	/*comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
	no es correcto, será H. No será visible al exterior.*/
	
	public char comprobarSexo(char sexo){
		if (sexo=='H' || sexo=='M' || sexo=='h' || sexo=='m') return sexo;
		else{
			sexo='H';
			return sexo;
		}		
	}
	
	
	//toString(): devuelve toda la información del objeto.
	//Atributos nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
	
	public String to_String(){
		return("Nombre: "+this.nombre+ " Edad: "+this.edad+ " DNI: "+this.dni+" Sexo: "+this.sexo+" Peso: "+this.peso+
				" Altura: "+this.altura);
		/*System.out.println("El nombre es: "+ this.nombre);
		System.out.println("La edad es: " + this.edad);
		System.out.println("DNI: "+ this.dni);
		System.out.println("Sexo: "+ this.sexo);
		System.out.println("Peso: "+this.peso);
		System.out.println("Altura: "+this.altura);*/
	}

	

	
	
}