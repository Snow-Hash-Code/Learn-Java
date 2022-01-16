import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			System.out.println("A");
			i++;
		}
		
		do {
			System.out.println("a");
		}while(i == 1);
		
		String texto = "hola mi nombre es luis gerardo nava ruiz";
		Scanner scan = new Scanner(texto);
		ArrayList<String> word = new ArrayList<String>();
		
		while(scan.hasNext()) {
			word.add(scan.next());
		}
		scan.close();
		System.out.println(word);
		
	}

}
