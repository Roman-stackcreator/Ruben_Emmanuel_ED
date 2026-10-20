/*
Metodo paraverificar si un numero es primo, de forma recursiva
@param n el numero a verificar
@param divisor a probar 2
@return true si el numero es primo, false en caso contrario
 */
public class Primos {
    public static boolean esPrimo(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return esPrimo(n, divisor + 1);
    }

    public static void main(String[] args) {
        int numero = 1000003; // Cambia este número para probar otros casos
        if (esPrimo(numero, 2)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }
}
