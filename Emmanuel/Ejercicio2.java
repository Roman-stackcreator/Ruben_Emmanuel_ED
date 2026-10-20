//Emmanuel roman bañuelos
/* algoritmo para saver el resultado de sumar n-1+n-1+n-1... hasta llegar a 0 */
public class Ejercicio2{
    public static void main(String[] args) {
    	System.out.println("el resultado de la suma es "+sumaDecreciente(5));

    }//fin main
    public static int sumaDecreciente(int x){
    	if (x<=0) {
    		return x;
    	}//primer if
    	return x+sumaDecreciente(x-1);

    }//fin sumDec
}