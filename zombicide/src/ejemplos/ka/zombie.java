package ejemplos.ka;

public class zombie {
	
	private int da�o = 1;
	private int movimiento = 5;
	private TipoZombie tipo = TipoZombie.Caminante;
	Horda horda = new Horda();
	
	public zombie() {
		horda.caminar();
	}
	
	public int getDa�o() {
		return da�o;
	}
	
	public int getMovimiento() {
		return movimiento;
	}
	
	public TipoZombie getTipo() {
		return tipo;
	}
	
	public Horda getHorda() {
		return horda;
	}

	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	
	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
	
	public void setTipo(TipoZombie tipo) {
		this.tipo = tipo;
	}

	public void setHorda(Horda horda) {
		this.horda = horda;
	}
	
	
	

}
