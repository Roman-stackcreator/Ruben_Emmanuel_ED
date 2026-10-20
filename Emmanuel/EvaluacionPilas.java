//Emmanuel Roman Bañuelos
/* Este codigo pasa una exprecion infja a posfija y prefija */
import java.util.Stack;

public class EvaluacionPilas {
    public static void main(String[] args) {  
        System.out.println("cadena original 1 : A+B*(C^D-E)^(F+G*H)-I");//cadena original
        System.out.println("cadena original 2 : b+c*(d^e-f)^(g+h*i)-j ");
        System.out.println("Posfijo: " + posfijo("A+B*(C^D-E)^(F+G*H)-I"));////resultados en posfijo
        System.out.println("Prefijo: " + prefijo("b+c*(d^e-f)^(g+h*i)-j"));//resultados en prefijo

    }

    private static int jerarquia(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }//validacion de la jerarquia de los operadores, usando numeros enteros para comparar despues
    }

    private static String posfijo(String o) {
        StringBuilder res = new StringBuilder();// Cadena que guarda el resultado
        Stack<Character> p = new Stack<>();//pila para guardar operadores
        for (int i = 0; i < o.length(); i++) //se recorre la cadena
            {
            char c = o.charAt(i);
            if (Character.isLetterOrDigit(c)) //verificar si es valor en letra o dijito
                {
                res.append(c);//si es letra o dijito se añade a res
            } else if (c == '(') {
                p.push(c);//introduce al parentesis que abre  sin restriccion (amigo del cadenero)
            } else if (c == ')') {
                while (p.peek() != '(') res.append(p.pop());//aqui se van sacando los operadores de la pila y se añaden a res hasta encontrar al parentesis que abre (SAT)
                p.pop(); // saca el '('
            } else {
                while (!p.isEmpty() && jerarquia(c) <= jerarquia(p.peek())) 
                    {
                    res.append(p.pop());//aqui se comparan los operadores y se van sacando de la pila y añadiendo a res
                }
                p.push(c);//aqui se introduce el operador a la pila
            }
        }
        while (!p.isEmpty()) res.append(p.pop());// vaciar lo que quedó
        return res.toString();//retorna el resultado
    }

    private static String prefijo(String o) {
        StringBuilder res = new StringBuilder();//cadena vacia de el resultado
        Stack<Character> p = new Stack<>();//pila para guardar operadores
        for (int i = o.length() - 1; i >= 0; i--) //se recorre la cadena de atras hacia adelante
            {
            char c = o.charAt(i);//se almacena en c el valor de i
            if (Character.isLetterOrDigit(c))//verificar si es valor en letra o dijito
                 {
                res.append(c);//si es letra o dijito se añade a res
            } else if (c == ')')//introduce al parentesis que cierra   sin restriccion (amigo del cadenero) 
                {
                p.push(c);//introduce al parentesis que cierra   sin restriccion (amigo del cadenero)
            } else if (c == '(')
                 {
                while (p.peek() != ')') res.append(p.pop());//aqui se van sacando los operadores de la pila y se añaden a res hasta encontrar al parentesis que cierra (SAT)
                p.pop(); // saca el ')'
            } else {
                while (!p.isEmpty() && jerarquia(c) < jerarquia(p.peek()))//aqui se comparan los operadores y se van sacando de la pila y añadiendo a res
                     {
                    res.append(p.pop());
                }
                p.push(c);
            }
        }
        while (!p.isEmpty()) res.append(p.pop());// vaciar lo que quedó
        return res.reverse().toString();//retorna el resultado
    }
}