package pks;

/**
 * The Class Carro.
 * @author J_API JAVA
 */
public class Carro {
	    //Clase padre o super clase

	//variables clase carro
	private int largoDelcarro;
    private int cantidadDeOcupantes;
    private int fechaIngresoInstitucion;
	public Carro(int largoDelCarro,int cantidadDeOcupantes,int fechaIngresoInstitucion ) {
		this.largoDelcarro=largoDelCarro;
		this.cantidadDeOcupantes=cantidadDeOcupantes;
		this.fechaIngresoInstitucion=fechaIngresoInstitucion;
	}
      // metodos getter y setter 
	public int getCantidadDeOcupantes() {
		return cantidadDeOcupantes;
	}

	public void setCantidadDeOcupantes(int cantidadDeOcupantes) {
		this.cantidadDeOcupantes = cantidadDeOcupantes;
	}

	public int getFechaIngresoInstitucion() {
		return fechaIngresoInstitucion;
	}

	public void setFechaIngresoInstitucion(int fechaIngresoInstitucion) {
		this.fechaIngresoInstitucion = fechaIngresoInstitucion;
	}

	public int getLargoDelcarro() {
		return largoDelcarro;
	}

	public void setLargoDelcarro(int largoDelcarro) {
		this.largoDelcarro = largoDelcarro;
	}
	
	
//	Generador de tablero
//	Metodo para generar tablero
	
}
