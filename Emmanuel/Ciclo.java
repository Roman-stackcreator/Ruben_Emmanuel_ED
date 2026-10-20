package RomanBañuelos_ED;
//Emmanuel Roman Bañuelos
/* este codigo va a imprimir un punto 10,000 veces, 
midiendo el tiempo que tarda en ejecutarce el ciclo for  
 */
public class Ciclo{
    public static void main(String[] args) {
        long inicio= System.currentTimeMillis();
        for (int i=0 ; i<10000 ; i++) {
            System.out.print(".");
        }
        long fin=System.currentTimeMillis();
        System.out.println("tiempo total: "+(fin-inicio)+" ms");

    }
}