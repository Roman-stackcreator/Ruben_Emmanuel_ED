//Emmanuel Roman bañuelos
/* codigo que busque y encuentre la posicion de un objeto dentro de un arreglo de manera recursiva*/
public class  Buscar{
	public static void main(String[] args) {
		int arr[]={20,10,45,30,90,70,1,5,7,90};
		System.out.println(buscar(arr,70,0,arr.length));
	}//main
	public static int buscar(int arr[],int valor,int inicio,int fin){
		if (inicio>=fin) {
			return -1;
		}//if1
		if (valor==arr[inicio]) {
			return inicio;
		}//if 2
		return buscar(arr,valor,inicio+1,fin);
		
	}//busqueda 
}//class