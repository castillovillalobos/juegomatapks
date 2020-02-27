package pks;
     //clase hija de clase carro.
public class Trupalla extends Carro {  
	//variables clase trupalla
	 private int nivelDeArmadura1hasta5;
	 private String nombreDelConductor;
	public Trupalla() {
		super(1,1,2017);
	}
	
	

	public int getNivelDeArmadura1hasta5() {
		return nivelDeArmadura1hasta5;
	}

	public void setNivelDeArmadura1hasta5(int nivelDeArmadura1hasta5) {
		this.nivelDeArmadura1hasta5 = nivelDeArmadura1hasta5;
	}

	public String getNombreDelConductor() {
		return nombreDelConductor;
	}

	public void setNombreDelConductor(String nombreDelConductor) {
		this.nombreDelConductor = nombreDelConductor;
	}

}
