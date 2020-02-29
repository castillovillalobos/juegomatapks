package electrod;

 

// TODO: Auto-generated Javadoc
/**
 * The Class Electrodomestico.
 */
public class Electrodomestico {

/** The Constant COLOR_DEFINIDO. */
private static final String COLOR_DEFINIDO= "blanco";

/** The Constant PRECIO_DEFINIDO. */
public static final double PRECIO_DEFINIDO=100000;

/** The Constant PESO_DEFINIDO. */
public static final double PESO_DEFINIDO = 5;

/** The Constant CONSUMO_ENERGETICO_DEFINIDO. */
public static final String CONSUMO_ENERGETICO_DEFINIDO="F";

/** The consumo energetico. */
char consumoEnergetico;

/** The color. */
String color;

/** The preciofinal. */
double preciofinal; 

/** The precio. */
double precio;

/** The peso. */
double peso;


/**
 * Instantiates a new electrodomestico.
 */
public Electrodomestico () {
	
}

/**
 * Instantiates a new electrodomestico.
 *
 * @param precio the precio
 * @param peso the peso
 */
public Electrodomestico (int precio, int peso) {
	
}

/**
 * Instantiates a new electrodomestico.
 *
 * @param consumoEnergetico the consumo energetico
 * @param color the color
 * @param preciofinal the preciofinal
 * @param precio the precio
 * @param peso the peso
 */
public Electrodomestico (char consumoEnergetico, String  color, int preciofinal, int precio, int peso) {
	
}

/**
 * Gets the consumo energetico.
 *
 * @return the consumo energetico
 */
public char getConsumoEnergetico() {
	return consumoEnergetico;
}

/**
 * Gets the color.
 *
 * @return the color
 */
public String getColor() {
	return color;
}

/**
 * Gets the preciofinal.
 *
 * @return the preciofinal
 */
public double getPreciofinal() {
	return preciofinal;
}

/**
 * Gets the precio.
 *
 * @return the precio
 */
public double getPrecio() {
	return precio;
}

/**
 * Gets the peso.
 *
 * @return the peso
 */
public double getPeso() {
	return peso;
}


/**
 * Comprobar color.
 *
 * @param color the color
 */
private void comprobarColor(String color){
	   
    
    String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
    boolean encontrado=false;
     
    for(int i=0;i<colores.length && !encontrado;i++){
        
        if(colores[i].equals(color)){
            encontrado=true;
        }
          
    }
      
    if(encontrado){
        this.color=color;
    }else{
        this.color=COLOR_DEFINIDO;
    }
} 
    
    
    /**
     * Precio final.
     *
     * @return the double
     */
    public double precioFinal(){
        double sum=0;
        switch(consumoEnergetico){
            case 'A':
                sum+=100;
                break;
            case 'B':
                sum+=80;
                break;
            case 'C':
                sum+=60;
                break;
            case 'D':
                sum+=50;
                break;
            case 'E':
                sum+=30;
                break;
            case 'F':
                sum+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            sum+=10;
        }else if(peso>=20 && peso<49){
            sum+=50;
        }else if(peso>=50 && peso<=79){
            sum+=80;
        }else if(peso>=80){
            sum+=100;
        }
   
        return PRECIO_DEFINIDO+sum;
        
        
}

	

	}





