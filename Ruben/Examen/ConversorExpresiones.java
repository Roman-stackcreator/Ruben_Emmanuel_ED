import java.util.Stack;

public class ConversorExpresiones {

    // Jerarquía de operaciones
    public static int jerarquia(char op) {
        switch (op) {
            case '^':
                return 5;
            case '*':
            case '/':
                return 4;
            case '+':
            case '-':
                return 3;
            case '=':
                return 2;
            case '(':
            case ')':
                return 1;
            default:
                return 0;
        }//switch
    }//jerarquia

    // Verifica si el carácter es un operador o paréntesis
    public static boolean esOperador(char c) {
        return c == '^' || c == '*' || c == '/' || c == '+' || c == '-' || c == '=' || c == '(' || c == ')';
    }//esOperador

    // Conversión de Infijo a Posfijo
    public static String convertirAPosfijo(String orig) {
        Stack<Character> pila = new Stack<>();
        String res = "";

        for (int i = 0; i < orig.length(); i++) {
            char c = orig.charAt(i);

            if (c == ' ') {
                continue;
            }//if

            if (!esOperador(c)) {
                res += c;
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    res += pila.pop();
                }
                if (!pila.isEmpty() && pila.peek() == '(') {
                    pila.pop();
                }
            } else {
                while (!pila.isEmpty() && pila.peek() != '(' && jerarquia(pila.peek()) >= jerarquia(c)) {
                    res += pila.pop();
                }
                pila.push(c);
            }//if 2
        }//for

        while (!pila.isEmpty()) {
            res += pila.pop();
        }//while

        return res;
    }//convertirAPosfijo

    // Conversión de Infijo a Prefijo
    public static String convertirAPrefijo(String orig) {
        Stack<Character> op = new Stack<>();
        Stack<Character> opnd = new Stack<>();

        for (int i = orig.length() - 1; i >= 0; i--) {
            char c = orig.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (!esOperador(c)) {
                opnd.push(c);
            } else if (c == ')') {
                op.push(c);
            } else if (c == '(') {
                while (!op.isEmpty() && op.peek() != ')') {
                    opnd.push(op.pop());
                }
                if (!op.isEmpty() && op.peek() == ')') {
                    op.pop();
                }
            } else {
                while (!op.isEmpty() && op.peek() != ')' && jerarquia(op.peek()) > jerarquia(c)) {
                    opnd.push(op.pop());
                }
                op.push(c);
            }//if
        }//for

        while (!op.isEmpty()) {
            opnd.push(op.pop());
        }

        String res = "";
        while (!opnd.isEmpty()) {
            res += opnd.pop();
        }

        return res;
    }//convertirAPrefijo

    public static void main(String[] args) {
        String exp1 = "x=a+(b*c-d)/e";
        String exp2 = "m*(n+p^2)-q/r";
        String exp3 = "(a+b)*(c-d)^e/f";

        String[] expresiones = {exp1, exp2, exp3};

        for (int i = 0; i < expresiones.length; i++) {
            System.out.println("Expresión " + (i + 1) + " (Infijo) : " + expresiones[i]);
            System.out.println("Posfijo: " + convertirAPosfijo(expresiones[i]));
            System.out.println("Prefijo: " + convertirAPrefijo(expresiones[i]));
            System.out.println("------------------------------------------");
        }
    }//main
}