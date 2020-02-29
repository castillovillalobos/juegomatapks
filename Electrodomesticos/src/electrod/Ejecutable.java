package electrod;

// TODO: Auto-generated Javadoc
/**
 * The Class Ejecutable.
 */
public class Ejecutable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Electrodomestico[] listElectrodomesticos =new Electrodomestico[10];
		
	    //Asignamos cada una de las posiciones como queramos
        listElectrodomesticos[0]=new Electrodomestico();
        listElectrodomesticos[1]=new Lavadora(150, 30);
        listElectrodomesticos[2]=new Televisión();
        listElectrodomesticos[3]=new Electrodomestico();
        listElectrodomesticos[4]=new Electrodomestico();
        listElectrodomesticos[5]=new Lavadora();
        listElectrodomesticos[6]=new Televisión();
        listElectrodomesticos[7]=new Lavadora();
        listElectrodomesticos[8]=new Televisión();
        listElectrodomesticos[9]=new Electrodomestico();
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listElectrodomesticos[i].precioFinal();
            }
            if(listElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listElectrodomesticos[i].precioFinal();
            }
            if(listElectrodomesticos[i] instanceof Televisión){
                sumaTelevisiones+=listElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
		
	}

}
