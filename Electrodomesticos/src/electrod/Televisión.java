package electrod;


// TODO: Auto-generated Javadoc
/**
 * The Class Televisi�n.
 */
public class Televisi�n extends Electrodomestico {

	
	/** The resoluci�n. */
	private int resoluci�n;
	
	/** The sintonizador tdt. */
	boolean sintonizadorTdt;

	/**
	 * Instantiates a new televisi�n.
	 */
	public Televisi�n() {
	
	this.sintonizadorTdt=sintonizadorTdt;
	this.resoluci�n=resoluci�n;
	}
	
	/**
	 * Instantiates a new televisi�n.
	 *
	 * @param precio the precio
	 * @param peso the peso
	 */
	public Televisi�n(int precio, int peso) {
		
	}
	
	/**
	 * Instantiates a new televisi�n.
	 *
	 * @param consumoEnergetico the consumo energetico
	 * @param color the color
	 * @param preciofinal the preciofinal
	 * @param precio the precio
	 * @param peso the peso
	 */
	public Televisi�n(char consumoEnergetico, String  color, int preciofinal, int precio, int peso) {
		
	}

	/**
	 * Gets the resoluci�n.
	 *
	 * @return the resoluci�n
	 */
	public int getResoluci�n() {
		return resoluci�n;
	}

	/**
	 * Sets the sintonizador tdt.
	 *
	 * @param setSintonizadorTdt the new sintonizador tdt
	 */
	public void setSintonizadorTdt(boolean setSintonizadorTdt) {
		this.sintonizadorTdt = false;
	}

}
