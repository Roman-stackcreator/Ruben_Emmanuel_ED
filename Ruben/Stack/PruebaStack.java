
import java.util.Stack;

public class PruebaStack{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i=0;i <10;i++) {
			s.push(i);
			
		}
		for (int j=0;j<15;j++ ) {
			try{
			System.out.println(s.pop());
			}catch(java.util.EmptyStackException e){
				System.out.println("Pila esta vacia");
				//e.printStackTrace();

			}
		}
	}
}