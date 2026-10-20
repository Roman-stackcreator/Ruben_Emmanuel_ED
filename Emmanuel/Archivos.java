  // Emmanuel Roman Bañuelos
/* */
import java.io.File;
//import java.io.FileNotFoundExeption;
public class Archivos{
	public static void main(String[] args) {
	String carpeta = "C:\\Users\\emmanuelrom\\operaciones_basica.psc";
	File manejador = new File(carpeta);
	if (!manejador.exists()) {
		System.out.println("No existe");
		
	}
	if (manejador.isDirectory()) {
		System.out.println("es un directorio");
	}//if1
	if (manejador.isFile()) {
		System.out.println("es un archivo");
	}//if2
	}//fin main
}