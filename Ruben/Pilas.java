/*
Ruben Alajeandro Valenzuela Falcon

Estructura de pila basaa en areglos con sus metodos correspondientes
*/
public class Pilas{
	private static int tope=-1;
	private static int max=10;
	private static int[] pila=new int[max];
	public static void main(String[] args) {
		for(int i =1;i<=15;i++){
			meter(i);
		}
		System.out.println(sacar());
		System.out.println(verTope());
		for(int i =1;i<=11;i++){
			System.out.println(sacar());
		}
	}
	public static void meter(int n){
		tope++;
		if(tope<max){
			pila[tope]=n;
			return;
		}
		System.out.println("Se lleno xd");
		tope--;
	}
	public static int sacar(){
		int n = -9999;
		if(estaVacio()){
			System.out.println("La pila esta vacia");
			return n;
		}
		n=pila[tope];
		tope--;
		return n;
	}
	public static int verTope(){
		int n = -9999;
		if(estaVacio()){
			System.out.println("La pila esta vacia");
			return n;
		}
		n=pila[tope];
		return n;
	}
	public static boolean estaVacio(){
		return (tope<=-1)?true:false;
	}
}