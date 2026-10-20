/*
Ruben Alejandro Valenzuela Falcon
*/

public class Ejemplo2 {
    public static void dandoVueltas(int x){
        if(x > 10 ){
            System.out.print("Ya Termine");
           return;
        }
        x++;
        System.out.print("Voy en la vuelta" + x);
        dandoVueltas(x);
        
        }//dandoVueltas
    }
    public static void main(String[] args) {
        
    }//main

