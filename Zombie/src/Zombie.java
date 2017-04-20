
public class Zombie {
	
	/*Atributos: nombre, año de conversión a zombie, nivel que ocupa dentro de la comunidad
	(se debe comprobar que el nivel sólo puede contener los valores de 1 a 10) y número de
	personas a las que ha convertido en zombie en los últimos 5 años (para esta información,
	se debe guardar el número por año, es decir, conversiones del año 1, conversiones del
	año 2, conversiones del año 3, conversiones del año 4 y conversiones del año 5, todo por
	separado).*/
	private String nombre="";
	private int yearToZombie=0;
	private int comunityLevel=0;
	private int[] peopleConverted = new int [5];
	
	
	// Constructores

	//Constructor por defecto, con los valores de los tipos de datos por defecto (nombre: “””,	años: 0…)
	public Zombie(){
		
	}
	
	//Constructor con todos los parámetros
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
