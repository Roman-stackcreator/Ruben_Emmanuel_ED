/*
Ruben Alejandro Valenzuela Falcon
*/
public class PruebaPila3c{
	public static void main(String[] args) {
		System.out.println(Pila3c.MAX);
		Pila3c p= new Pila3c();
		for (int i=0;i<10 ;i++ ) {
			p.meter(i);
			
		}
		for (int i=0;i<15 ;i++ ) {
			System.out.println(p.sacar());
			
		}
		
	}
}