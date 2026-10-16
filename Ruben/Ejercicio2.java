/*
Ruben Alejandro Valenzuela Falon
Codigo que da el resultado de sumar n + n-1 + n-1 + n-1... hasta llegar a 0
*/

public class Ejercicio2 {

    public static void main(String[] args) {
    	System.out.println("El resultado es " + sumaDecreciente(5));
    }//main
    	public static int sumaDecreciente(int x){
    	if (x <= 0) {
    		return x;
    	}//primer if
        System.out.println(x + " + " + (x-1));
    	return x+sumaDecreciente(x-1);

    	}//sumaDecreciente
}
