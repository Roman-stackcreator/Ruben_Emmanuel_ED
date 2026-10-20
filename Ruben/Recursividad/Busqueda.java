/*
*Ruben Alejandro Valenzuela Falcon
/*Codigo donde se define un arreglo y despues se usa un metodo de busqueda recursiva 
*para encontrar la posiciondel numero a buscar
*/

public class Busqueda {

	public  static int busqueda(int arr[], int valor,int inicio, int fin){
		if (inicio >= fin) {
			return -1;
		}
		if (valor == arr[inicio]) {

			return inicio;
		}
		return busqueda(arr, valor, inicio+1, fin);
	}//fin de busqueda
	public static void main(String[] args) {
		int arr[]={20,5,67,2,10,56,32,57};
		System.out.println(busqueda(arr, 57, 0, arr.length));

		}//main

}
