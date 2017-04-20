
public class Zombie {
	
	/*Atributos: nombre, a�o de conversi�n a zombie, nivel que ocupa dentro de la comunidad
	(se debe comprobar que el nivel s�lo puede contener los valores de 1 a 10) y n�mero de
	personas a las que ha convertido en zombie en los �ltimos 5 a�os (para esta informaci�n,
	se debe guardar el n�mero por a�o, es decir, conversiones del a�o 1, conversiones del
	a�o 2, conversiones del a�o 3, conversiones del a�o 4 y conversiones del a�o 5, todo por
	separado).*/
	private String nombre="";
	private int yearToZombie=0;
	private int comunityLevel=0;
	private int[] peopleConverted = new int [5];
	
	
	// Constructores

	//Constructor por defecto, con los valores de los tipos de datos por defecto (nombre: ���,	a�os: 0�)
	public Zombie(){
		
	}
	
	//Constructor con todos los par�metros
	public Zombie(String nombre, int yearToZombie, int comunityLevel){
		this.setNombre(nombre);
		this.setYearToZombie(yearToZombie);
		this.setComunityLevel(comunityLevel);
	}
	
	//Setters
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setYearToZombie(int yearToZombie){
		this.yearToZombie=yearToZombie;
	}
	
	public void setComunityLevel(int comunityLevel){
		this.comunityLevel=comunityLevel;
	}	
	
	
	//Getters
	
	
	
	public String getDni(){
		return this.dni;
	}
	
	
	
	
}
