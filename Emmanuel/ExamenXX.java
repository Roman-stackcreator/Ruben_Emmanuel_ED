import java.io.File;
public class  ExamenXX{
public static void main(String[] args) {
	// windows c:\Users...
	// linux /backup
	// MacOS /volumens
		File ruta = new File("C:\\Users\\emmanuelrom\\itz estructura de datos");
		if (!ruta.exists()) {
		 	System.out.println("On ta el file, aqui no ");
		 	System.exit(0xFF34);
		 }//fin if ruta.exist
		  if (ruta.isFile()) {
			System.out.println("no es posible analizar un archivo, debe ser un directorio ");
			System.exit(0xFF35);
		}//fin if ruta.isffile
		recorrerDir(ruta,0);
	}//fin main
	private static void recorrerDir(File d, int nivel){
		String strNivel = "";
		for (int i=0; i<nivel ;  i++ ) {
			strNivel+="\t";
		}
		if (d.isDirectory()) {
			System.out.println(strNivel+d.getName()+"[Directorio] contenido");
			String[] lista = d.list();
			for (String elem: lista ) {
				//System.out.println(d.getAbsolutePath()+File.separator+elem);
				File dir=new File(d.getAbsolutePath()+File.separator+elem);
				if (dir.isDirectory()) {
					//System.out.println(dir.getName()+"[Directorio]");
					recorrerDir(dir,nivel+1);
				}else{
					System.out.println(strNivel+dir.getName()+"[Archivo]");
				}//else dir.isDirectory
				
			}//for
		}//if d.isDirectory
	}//recorrerDir
}//fin clase