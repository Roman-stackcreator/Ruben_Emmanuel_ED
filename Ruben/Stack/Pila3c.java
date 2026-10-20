/*
Ruben Alejandro Valenzuela Falcon
*/

public class Pila3c{
	private int[]pila ;
	private int tope;
	public static final int MAX = 100;
	public Pila3c(){
		pila = new int[MAX];
		tope = -1;
	}
	public  void meter(int n){
		tope++;
		if(tope<MAX){
			pila[tope]=n;
			return;
		}
		System.out.println("Se lleno xd");
		tope--;
	}
	public  int sacar(){
		int n = -9999;
		if(estaVacio()){
			System.out.println("La pila esta vacia");
			return n;
		}
		n=pila[tope];
		tope--;
		return n;
	}
	public  int verTope(){
		int n = -9999;
		if(estaVacio()){
			System.out.println("La pila esta vacia");
			return n;
		}
		n=pila[tope];
		return n;
	}
	public  boolean estaVacio(){
		return (tope<=-1)?true:false;
	}

}