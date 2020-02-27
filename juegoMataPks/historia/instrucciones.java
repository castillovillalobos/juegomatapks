package historia;

public class instrucciones {

	String[] instruccion=new String[30];

	public String[] llamainstruccion() {
		
		instruccion[0]= "************************************************************ \n";
		instruccion[1]="*                     INSTRUCCIONES                        * \n";
		instruccion[2]="* 1.- Tiene un arsenal ilimitado de huevos, los que pueden * \n";
		instruccion[3]="* lanzar libremente dentro del espacio considerado.        * \n"; 
		instruccion[4]="* 2.- Ingrese un número de fila y de columna, ambos        * \n"; 
		instruccion[5]="* válidos.                                                 * \n"; 	
		instruccion[6]="* Si el proyectil da:                                      * \n"; 
		instruccion[7]="* 3.- Si da sobre una Kromi, se asignan 3  puntos          * \n";  
		instruccion[8]="* 4.- Si da sobre un Caguano se asignan 2 puntos           * \n"; 
		instruccion[9]="* 5.- Si da sobre un Trupalla se asigna un punto           * \n"; 
		instruccion[10]="* 6.- Si una Kromi ha sido inutilizada completamente se    * \n"; 
		instruccion[11]="* asignan 10 puntos adicionales.                           * \n"; 
		instruccion[12]="* 7.- Si se inutiliza un Caguano se asignan 7 puntos       * \n"; 
		instruccion[13]="* adicionales.                                             * \n"; 
		instruccion[14]="* 8.- Un Trupalla queda inutilizado automáticamente al     * \n"; 
		instruccion[15]="* recibir un huevo, por tanto no existe puntaje adicional  * \n"; 
		instruccion[16]="* por estos efectos.                                       * \n"; 
		instruccion[17]="* 9.- No hay una cantidad límite de huevos a lanzar, y un  * \n"; 
		instruccion[18]="* huevo puede caer más de una vez sobre una misma          * \n"; 
		instruccion[19]="* posición.                                                * \n"; 
		instruccion[20]="* 10.- Cada posición sea atacada por un huevo, el          * \n"; 
		instruccion[21]="* valor de la celda en la matriz original debe ser         * \n"; 
		instruccion[22]="* expresado como “H”.                                      * \n"; 
		instruccion[23]="* 11.- Si la celda sobre la que se lanza un huevo ya había * \n"; 
		instruccion[24]="* sido atacada previamente, no se debe asignar puntaje     * \n"; 
		instruccion[25]="* por este concepto.                                       * \n"; 
		instruccion[26]="* 12.- Finalmente, al terminar el programa se debe indicar * \n"; 
		instruccion[27]="* el puntaje total obtenido por el usuario.                * \n"; 
		instruccion[28]="*                                                          * \n"; 
		instruccion[29]="************************************************************ \n";
		
		return instruccion;
	}

}
