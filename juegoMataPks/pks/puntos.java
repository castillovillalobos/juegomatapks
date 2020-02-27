package pks;

public class puntos {

	private int[][] puntos = new int[15][15];
	private int puntosKromis = 0, puntosCaguanos = 0, puntosTrupallas = 0, puntosTotales = 0;
	private int cont = 0;

	int limitePuntos = puntos.length;

	public puntos(int[][] puntos, int puntosKromis, int puntosCaguanos, int puntosTrupallas, int puntosTotales) {

		super();
		this.puntos = puntos;
		this.puntosKromis = puntosKromis;
		this.puntosCaguanos = puntosCaguanos;
		this.puntosTrupallas = puntosTrupallas;
		this.puntosTotales = puntosTotales;
	} // constructor

	public void operacion() {

		for (int i = 0; i < limitePuntos; i++) {
			for (int j = 0; j < puntos[i].length; j++) {
				
				
				if (puntos[j][i] == 3) {
					puntosKromis = puntosKromis + 3;
					cont++;
					if (cont==3) {
						puntosKromis = puntosKromis + 10;
						cont = 0;
					}
				}

			} // for 2
		} // for 1
	} // metodo operacion

} // class
