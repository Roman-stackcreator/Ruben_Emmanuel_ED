/*
Ruben Alejandro Valenzuela Falcon
Arreglo para guardar 100,000 elementos en java 
*/

public class Arreglo {
    public static void main(String[] args){
        int[] arreglo = new int[100000];
        
        for(int i=0 ; i<100000 ; i++)
            {
                arreglo[i] = i;
            
            }
    if(arreglo.length == 100000){
        System.out.println("El arreglo tiene 100,000 elementos");
    }
    else{
        System.out.println("El arreglo no tiene 100,000 elementos");
    }
        }
    
}
