
import java.io.File;
public class ExamenXX{

	public static void main(String[] args) {
	  //Windows C:\Users..
	  //Linux /backup
	  //MacOS /Volumen	
	  //Obejto			Constructor
		File ruta = new File("/home/ruben/Descargas");
		if(!ruta.exists()){
			System.out.println("On ta el File, aqui no ta");
			System.exit(0xFF34);
		}
		if (ruta.isFile()){
			System.out.println("No es posible analizarun archivo, debe ser directorio");
			System.exit(0xFF35);
		}
		recorreDir(ruta, 0);
	}
	private static void recorreDir(File d, int nivel){
		String strNivel = "";
		for (int i= 0; i<nivel; i++ ) {
			strNivel += "\t";
			
		}
		if(d.isDirectory()){
			System.out.println(strNivel + d.getName() + " [Directorio]");
			String[] lista = d.list();
			for(String elem : lista){
				//System.out.println(d.getAbsolutePath()+File.separator+elem);
				File dir = new File(d.getAbsolutePath()+File.separator+elem);
				if (dir.isDirectory()){
					System.out.println(dir.getName() + " [Directorio]");
					recorreDir(dir, nivel+1);
				}else{
					System.out.println(dir.getName() + " [Archivo]");
				}//else
			}//for elem:lista

			
		}//if d.isDirectory
	}//recorreDir
}//class