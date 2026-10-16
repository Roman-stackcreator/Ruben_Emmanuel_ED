 /*
Ruben Alejandro Valenzuela Falcon

*/
import java.util.Stack;
public class ChecaPares{
	public static void main(String[] args) {
	 String cad1 = "{hola[adios(l)d]tristan}.";
	 String cad2 = "{hola[adios(l]d)tristan}.";
	 Stack<Character> pila = new Stack<>();
	 verificarAgrupadores(cad1,pila);	
	 System.out.println("*******************");
	 verificarAgrupadores(cad2,pila);

	}//main

	public static void verificarAgrupadores(String cad, Stack<Character> p){
		for (int i = 0;i<cad.length() ;i++ ) {
			char a = cad.charAt(i);
			if (a == '{'|| a=='['|| a== '(') {
				p.push(a);
				continue;
			}//if
			String msg = switch (a){
				case ')'-> (p.pop()!= '(')?"Error: Se esperaba (":"";
				case ']'-> (p.pop()!= '[')?"Error: Se esperaba [":"";
				case '}'-> (p.pop()!= '{')?"Error: Se esperaba {":"";
				default-> "";
			};//switch
			if(!msg.equals(""))System.out.println(msg);
		}//for
	}//metodo
}