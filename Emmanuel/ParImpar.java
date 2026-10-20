package RomanBañuelos_ED;
import java.util.Scanner;
    public class ParImpar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");
        int numero = in.nextInt();
        if (numero % 2 == 0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }

    }
}