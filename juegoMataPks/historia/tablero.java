package historia;

public class tablero {

	public static void main(String[] args) {
	
		String matriz[][] = new String[15][15];
		String puntos[][] = new String[15][15];
		String tablero[][] = new String[15][15];


		int limiteMatriz = matriz.length;
		int limitePuntos = puntos.length;
		int limiteTablero = tablero.length;

		//public String[][] llamadaTablero(){
			
		
		int a = 0, b = 0; // Trupalla
		int c = 0, d = 0, e = 0, f = 0; // Caguano
		int g = 0, h = 0, l = 0, m = 0, p = 0, q = 0; // Kromi
		boolean valido = true;
		
		


		// Inicializo matriz con .

		for (int i = 0; i < limiteMatriz; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = ".";
			}
		}


		
		// Ingreso de kromis

		for (int i = 0; i < 3; i++) {

			do {
				g = (int) (Math.random() * 14);
				h = (int) (Math.random() * 14);

				switch (g) {
				case 0: {
					l = g + 1;
					p = g + 2;
					m = h;
					q = h;
					break;
				}
				case 15: {
					l = g - 1;
					p = g - 2;
					m = h;
					q = h;
					break;
				}
				default:
					// secuencia de sentencias por omisión

					if (g > 0 && g < 7) {
						l = g + 1;
						p = g + 2;
						m = h;
						q = h;
					} else if (g > 6 && g < 15) {
						l = g - 1;
						p = g - 2;
						m = h;
						q = h;
					}

				} // Switch

				if (matriz[g][h].equals(".") && matriz[l][m].equals(".") && matriz[p][q].equals(".")) {
					valido = false;
				}
				if (matriz[g][h].equals("K") | matriz[l][m].equals("K") | matriz[p][q].equals("K")) {
					valido = true;
				}

			} while (valido);

			matriz[g][h] = "K";
			matriz[l][m] = "K";
			matriz[p][q] = "K";

		} // for

		// Ingreso de caguanos

		valido = true;

		for (int i = 0; i < 5; i++) {

			do {

				c = (int) (Math.random() * 15);
				d = (int) (Math.random() * 15);

				switch (d) {
				case 0: {
					f = d + 1;
					e = c;
					break;
				}
				case 15: {
					f = d - 1;
					e = c;
					break;
				}
				default:
					// secuencia de sentencias por omisión
					if (d > 0 && d < 7) {
						f = d + 1;
						e = c;
					} else if (d > 6 && d < 15) {
						f = d - 1;
						e = c;
					}

				} // switch

				if (matriz[c][d].equals(".") && matriz[e][f].equals(".")) {
					valido = false;
				
				}
				if (matriz[c][d].equals("K") | matriz[e][f].equals("K")) {
					valido = true;
				
				}
				if (matriz[c][d].equals("C") | matriz[e][f].equals("C")) {
					valido = true;
				
				}
				if (matriz[c][d].equals("T") | matriz[e][f].equals("T")) {
					valido = true;
				
				}

			} while (valido);

			matriz[c][d] = "C";
			matriz[e][f] = "C";

		} // for

		// Ingreso de Trupallas

		valido = true;

		for (int i = 0; i < 10; i++) {

			do {

				a = (int) (Math.random() * 15);
				b = (int) (Math.random() * 15);

				if (matriz[a][b].equals(".")) {
					valido = false;
				}
				if (matriz[a][b].equals("K")) {
					valido = true;
				}
				if (matriz[a][b].equals("C")) {
					valido = true;
				}
				if (matriz[a][b].equals("T")) {
					valido = true;
				}

			} while (valido);

			matriz[a][b] = "T";

		} // for

		char I;

		System.out.print("  ");

		for (I = 65; I < 80; I++) {
			System.out.print(" ");
			System.out.print(I + " ");
		}
		System.out.print(" \n");

		for (int i = 0; i < limiteMatriz; i++) {

			System.out.printf("%02d", (i + 1));

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(" ");
				System.out.print(matriz[i][j] + " ");
			}

			System.out.print(" \n");

		}

		System.out.println(" \n");
		
	

		}	
	
	//} // main
} // class
