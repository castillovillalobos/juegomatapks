package pks;

public class Kromi extends Carro {  //clase kromi hija clase carro.
private int anoDeFabricacion;
private String marca;
	public Kromi() {
		super(3,20,2015);
	}
	//metodos getter y setter
	public int getAnoDeFabricacion() {
		return anoDeFabricacion;
	}
	public void setAnoDeFabricacion(int anoDeFabricacion) {
		this.anoDeFabricacion = anoDeFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}