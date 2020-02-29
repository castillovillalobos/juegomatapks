package electrod;


// TODO: Auto-generated Javadoc
/**
 * The Class Televisión.
 */
public class Televisión extends Electrodomestico {

	
	/** The resolución. */
	private int resolución;
	
	/** The sintonizador tdt. */
	boolean sintonizadorTdt;

	/**
	 * Instantiates a new televisión.
	 */
	public Televisión() {
	
	this.sintonizadorTdt=sintonizadorTdt;
	this.resolución=resolución;
	}
	
	/**
	 * Instantiates a new televisión.
	 *
	 * @param precio the precio
	 * @param peso the peso
	 */
	public Televisión(int precio, int peso) {
		
	}
	
	/**
	 * Instantiates a new televisión.
	 *
	 * @param consumoEnergetico the consumo energetico
	 * @param color the color
	 * @param preciofinal the preciofinal
	 * @param precio the precio
	 * @param peso the peso
	 */
	public Televisión(char consumoEnergetico, String  color, int preciofinal, int precio, int peso) {
		
	}

	/**
	 * Gets the resolución.
	 *
	 * @return the resolución
	 */
	public int getResolución() {
		return resolución;
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
