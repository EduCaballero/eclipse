public class Electro {

	private String color;
	private double precio;
	private char consumo;
	private double peso;

	public Electro() {
		this.peso = 5;
		this.precio = 100.00;
		this.consumo = 'F';
		this.color = "BLANCO";
	}

	public Electro(double peso, double precio) {
		this.peso = peso;
		this.precio = precio;
		this.consumo = 'F';
		this.color = "BLANCO";	
	}
	
	public Electro(double peso, double precio, char consumo, String color){
		this.peso = peso;
		this.precio = precio;
		this.consumo = consumo;
		compruebaConsumo();
		this.color = color;
		compruebaColor();	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		compruebaColor();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
		compruebaConsumo();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	private void compruebaConsumo(){
		String consumo = Character.toString(this.consumo);
		consumo = consumo.toUpperCase();
		this.consumo = consumo.charAt(0);
		if(this.consumo != 'A' && this.consumo != 'B' && this.consumo != 'C' && this.consumo != 'D' && this.consumo != 'E' && this.consumo != 'F' ){
			this.consumo = 'F';			
		}
		
	}
	private void compruebaColor(){
		String color = this.color;
		color = color.toUpperCase();
		this.color = color;
		if(this.color.equals("BLANCO") && this.color.equals("NEGRO") && this.color.equals("ROJO") && this.color.equals("AZUL") && this.color.equals("GRIS")){
			this.color = "BLANCO";			
		}
	}
	public double precioFinal(){
		double precio = this.precio;
		switch(this.consumo){
		case 'A':
			precio = precio + 100;
			break;
		case 'B':
			precio = precio + 80;
			break;			
		case 'C':
			precio= precio + 60;
			break;			
		case 'D':
			precio = precio + 50;
			break;
		case 'E':
			precio = precio + 30;
			break;
		case 'F':
			precio = precio + 10;
			break;		
		}
		if(this.peso >= 0.00 && this.peso<=19.00 ){
			precio = precio + 10;
		}
		else if(this.peso > 19.00 && this.peso<=49.00 ){
			precio = precio + 50;
		}
		else if(this.peso > 49.00 && this.peso<=79.00 ){
			precio = precio + 80;
		}
		else if(this.peso > 79.00 ){
			precio = precio + 100;
		}
		
		return precio;
	}
	
}
