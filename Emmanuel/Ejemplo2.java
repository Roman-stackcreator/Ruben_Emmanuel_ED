package RomanBañuelos_ED;

//emmanuel roman bañuelos
/* */
public class Ejemplo2{
    public static  void dandoVueltas(int x){
        if(x>10){
            System.out.println("ya termine");
            return;
        }
        x++;
        System.out.println("voy en la vuelta "+x);
        dandoVueltas(x);
    }
    public static void main(String[]args){
        dandoVueltas(0);
    }
}