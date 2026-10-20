//Ruben Alejandro Valenzuela Falcon
/*
CicloFor que repite un punto 100000 veces, 
midiendo el tiempo que tarda en ejecutarse el ciclo for
 */
public class CicloFor {
    public static void main(String[] args){
        long inicio = System.currentTimeMillis();
        
        for(int i=0 ; i<100000 ; i++)
            {
                System.out.print(".");
            }
        long fin = System.currentTimeMillis();

        System.out.println("Tiempo Total: " + (fin - inicio)+ "ms");
    
        }
}
