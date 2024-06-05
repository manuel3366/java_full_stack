public class Animal {
	private String familia;
	private int numeroPatas;

	public void setFamilia(String familia){
		this.familia = familia;
	}

	public String getFamilia() {
		return this.familia;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public int getNumeroPatas() {
		return this.numeroPatas;
	}
	
	public void alimentarse(){
		System.out.println("El animal esta alimentandose sobre sus " + this.numeroPatas + " patas." );
	}

	public void imprimirFamilia() {
		System.out.println("Mi familia es " + this.familia);
	}
}