package pks;

import java.util.*;

public class lanzamiento {
	
	int coordFila=0,valorColumna=0,valorFila=0;
	String coordColumna="";
	boolean valido=true;

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
	
	System.out.println("Fila: "+valorFila+" Columna: "+valorColumna);
	}
}
	

	



