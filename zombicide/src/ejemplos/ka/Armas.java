package ejemplos.ka;

public class Armas {
	
	private int da�o = 1;
	private int distancia = 0;
	private TipoArma tipo = TipoArma.Sarten;
	
	public Armas() {
		super();
	}
	
	public Armas(int da�o, int distancia) {
		super();
		this.da�o = da�o;
		this.distancia = distancia;
	}
	
	public Armas(int da�o, int distancia, TipoArma tipo) {
		this.da�o = da�o;
		this.distancia = distancia;
		this.tipo = tipo;
	}

	public int getDa�o() {
		return da�o;
	}
	public int getDistancia() {
		return distancia;
	}
	public TipoArma getTipo() {
		return tipo;
	}
	
	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public void setTipo(TipoArma tipo) {
		this.tipo = tipo;
	}
	
	public void armarse(){
		System.out.println("AL FIN UN APOCALIPSIS ZOMBIE!!!!!! !u!");
	}
	
	
}