
package pks;

import java.io.*;
import java.util.*;

import historia.*;

public class pksAccion {


/**
 * The main method.
 *
 * @param args the arguments
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String tableroPrueba[][] = {
				{"T",".",".",".",".",".",".",".",".",".",".",".",".",".","."},
				{".",".","K",".",".",".","T",".",".",".",".",".",".","C","C"},
				{".",".","K",".",".",".",".",".",".",".",".",".",".",".","."},
				{".",".","K",".",".",".",".",".",".","C","C","T",".",".","."},
				{".",".","T",".",".",".",".",".",".",".",".",".",".",".","."},
				{".",".",".",".","C","C",".",".",".",".",".",".","T",".","."},
				{".",".",".",".",".",".",".",".",".",".",".",".",".",".","."},
				{".",".","T",".",".",".",".","T",".",".",".","K",".",".","."},
				{".",".",".",".",".",".",".",".",".",".",".","K",".",".","."},
				{".",".",".","K",".",".",".",".",".",".",".","K",".",".","."},
				{".",".",".","K",".",".",".",".","T",".",".",".","T",".","."},
				{".",".",".","K",".",".",".",".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".",".",".",".",".",".",".",".","."},
				{".","C","C",".",".",".",".",".","C","C",".",".",".",".","."},
				{".",".",".",".",".",".",".",".",".",".",".",".",".",".","T"}};


		int sal=-1;
		
		String tablero[][] = new String[15][15];
		String salida="";
		
		// Inicializo matriz tablero

		for (int i = 0; i < 15; i++) {

			for (int j = 0; j < 15; j++) {

				tablero[i][j] = ".";
			}
		}
		
		
		
		do {
			
			menu obj = new menu();
			
			String[] muestraMenu=obj.llamaMenu();
			
			for (int i=0; i<muestraMenu.length;i++) {
				System.out.print(muestraMenu[i]);
			}

		int opc = entrada.nextInt();
		
		
		switch (opc) {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		case 1: { //Historia
			
			historia objM = new historia();
			
			String[] cuentaHistoria=objM.llamaHistoria();
			
			for (int i=0; i<cuentaHistoria.length;i++) {
				System.out.print(cuentaHistoria[i]);
			}
			
	          String seguir;
	          Scanner teclado = new Scanner(System.in);
	          System.out.println("Presione Enter para continuar...");
	          try
	            {
	             seguir = teclado.nextLine();
	            }   
	         catch(Exception e)
	          {}  

			break;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		case 2: { //Instrucciones

			instrucciones objI = new instrucciones();
			
			String[] cuentaInstrucciones=objI.llamainstruccion();
			
			for (int i=0; i<cuentaInstrucciones.length;i++) {
				System.out.print(cuentaInstrucciones[i]);
			}

			
	          String seguir;
	          Scanner teclado = new Scanner(System.in);
	          System.out.println("Presione Enter para continuar...");
	          try
	            {
	             seguir = teclado.nextLine();
	            }   
	         catch(Exception e)
	          {}  
	          
			break;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		case 3: { //Ingreso de datos
			String nombrejugador;
			int estaspreparado; 

	        Scanner teclado = new Scanner(System.in);
	        System.out.print("Introduzca su nombre: ");
	        nombrejugador = teclado.nextLine();
	        System.out.println("¡Hola " + nombrejugador + "! comienza tu  juego");
	        Scanner teclado1 = new Scanner(System.in);
	        System.out.print("¿estas preparado para comenzar? (si=1/no=2) ");
	        estaspreparado = teclado1.nextInt();
	        
if (estaspreparado == 1) {
	opc=4;
	} else {

			break;
		}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		case 4: { // Jugar
			
			
			
			boolean almenu=true;
			

	
				int[][] puntos = new int[15][15];
				int puntosGenerales=0;

				int coordFila=0,valorColumna=0,valorFila=0;
				String coordColumna="";
				boolean valido=true;
				
				// Inicializo matriz tablero
	
				for (int i = 0; i < 15; i++) {
	
					for (int j = 0; j < 15; j++) {
	
						puntos[i][j] = 0;
					}
				}
			
				
				do {

					
							char I;
			
							System.out.print("  ");
			
							for (I = 65; I < 80; I++) {
								System.out.print(" ");
								System.out.print(I + " ");
							}
							System.out.print(" \n");
			
							for (int i = 0; i < 15; i++) {
			
								System.out.printf("%02d", (i + 1));
			
								for (int j = 0; j < 15; j++) {
			
									System.out.print(" ");
									System.out.print(tablero[i][j] + " ");
								}
			
								System.out.print(" \n");
			
							}
			
							System.out.println(" \n");
							
							System.out.println("Puntos generales: "+puntosGenerales);
							
							Scanner ingreso=new Scanner(System.in);{
							
							System.out.println("Diga coordenadas de tiro");
							
							do {
								
								System.out.print("Columna (A...O): ");
								coordColumna = ingreso.next();
								
								if (coordColumna.equalsIgnoreCase("A") |coordColumna.equalsIgnoreCase("B") 
										|coordColumna.equalsIgnoreCase("C") |coordColumna.equalsIgnoreCase("D") 
										|coordColumna.equalsIgnoreCase("E") |coordColumna.equalsIgnoreCase("F") 
										|coordColumna.equalsIgnoreCase("G") |coordColumna.equalsIgnoreCase("H") 
										|coordColumna.equalsIgnoreCase("I") |coordColumna.equalsIgnoreCase("J") 
										|coordColumna.equalsIgnoreCase("K") |coordColumna.equalsIgnoreCase("L") 
										|coordColumna.equalsIgnoreCase("M") |coordColumna.equalsIgnoreCase("N") 
										|coordColumna.equalsIgnoreCase("O") ) {
									valido=false;
								}
							}while(valido);
							
				
							if (coordColumna.equalsIgnoreCase("A")){
								valorColumna=0;
							}else if (coordColumna.equalsIgnoreCase("B")){
								valorColumna=1;
							}else if (coordColumna.equalsIgnoreCase("C")){
								valorColumna=2;
							}else if (coordColumna.equalsIgnoreCase("D")){
								valorColumna=3;
							}else if (coordColumna.equalsIgnoreCase("E")){
								valorColumna=4;
							}else if (coordColumna.equalsIgnoreCase("F")){
								valorColumna=5;
							}else if (coordColumna.equalsIgnoreCase("G")){
								valorColumna=6;
							}else if (coordColumna.equalsIgnoreCase("H")){
								valorColumna=7;
							}else if (coordColumna.equalsIgnoreCase("I")){
								valorColumna=8;
							}else if (coordColumna.equalsIgnoreCase("J")){
								valorColumna=9;
							}else if (coordColumna.equalsIgnoreCase("K")){
								valorColumna=10;
							}else if (coordColumna.equalsIgnoreCase("L")){
								valorColumna=11;
							}else if (coordColumna.equalsIgnoreCase("M")){
								valorColumna=12;
							}else if (coordColumna.equalsIgnoreCase("N")){
								valorColumna=13;
							}else if (coordColumna.equalsIgnoreCase("O")){
								valorColumna=14;
							}
							
							valido=true;
							
							do {
								
								System.out.print("Fila (1...15): ");
								coordFila = ingreso.nextInt();
								
								if ( coordFila>0 && coordFila<16 ) {
									valido=false;			
								}
								
							}while (valido);
				
							valorFila=coordFila-1;
							
							//System.out.println("Fila: "+valorFila+" Columna: "+valorColumna);
							
							/**
							 * Esta secciÃ³n llamaba al tablero para buscar si 
							 * se dio a una unidad pero dejo de funcionar
							 * se anexa directamente para cumplir la funcion sin
							 * llamarla.
							 * 
							*tablero objTablero = new tablero();
							*
							*String[][] zonaAtaque=objTablero.llamadaTablero();
							**/
							
							if(tableroPrueba[valorFila][valorColumna].equals(".")) {
								tablero[valorFila][valorColumna]="H";
							}
					
							if(tableroPrueba[valorFila][valorColumna].equals("K")) {
								puntos[valorFila][valorColumna]=3;
								tablero[valorFila][valorColumna]="H";
							}
							
							if(tableroPrueba[valorFila][valorColumna].equals("C")) {
								puntos[valorFila][valorColumna]=2;
								tablero[valorFila][valorColumna]="H";
							}
							
							if(tableroPrueba[valorFila][valorColumna].equals("T")) {
								puntos[valorFila][valorColumna]=1;
								tablero[valorFila][valorColumna]="H";
							}
							
							int cont3=0;
							int cont2=0;
							
							for(int i=0;i<15;i++) {
								for(int j=0;j<15;j++) {
									puntosGenerales=puntosGenerales +puntos[i][j];
								}
							}
							
							
							
							

							System.out.println("\n");							
							System.out.print("Quiere lanzar (si/no): ");
							salida = ingreso.next();
							
							if (salida.equalsIgnoreCase("no")){
								almenu=false;
							}
							
							}
							
				}while(almenu);			

	
		}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		case 5: { // Salida
			
			System.out.print("\n");
			System.out.print("GRACIAS!! Por jugar MATA PKS !!!");	
			sal=5;
			break;
		}

		
		}

	entrada.close();

		}while(sal!=5);
	}
}
