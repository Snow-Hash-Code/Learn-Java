import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		File file = new File("C:/Users/lgnra/Desktop/textoJava.txt");
		String fileContent = "";
		
		try {
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()) {
				fileContent = fileContent.concat(scan.nextLine() + "\n");
			}
			
			scan.close();
			
			FileWriter writer = new FileWriter("C:/Users/lgnra/Desktop/nuevoTextoJava.txt");
			
			try {
				writer.write(fileContent);
				writer.close();
			} catch (Exception e) {
				System.out.println("No se pudo generar el archivo Exception: "+ e);
			}
			
		} catch (Exception e) {
			System.out.println("Ruta no encontrada");
		}
		
	}

}
