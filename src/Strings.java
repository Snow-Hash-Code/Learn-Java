import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		System.out.println("Madlibs!");
		
//		String username = "AGeraNR";
		
		System.out.println("My ____ sister accidentally ____ed all over her new ____:");
		
		String adjective = "flamboyant";
		String verb = "fart";
		String noun = "pogo stick";
		
		System.out.println("My " + adjective + " sister accidentally " + verb + "ed" + " all over her new " + noun);
		
		//Get strings from an user
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese tu pokemon1: ");
		String pokemon1 = entrada.nextLine();
		
		System.out.print("Ingrese tu pokemon2: ");
		String pokemon2 = entrada.nextLine();
		
		System.out.print("Ingrese tu pokemon3: ");
		String pokemon3 = entrada.nextLine();
		
		System.out.print("Ingrese tu pokemon4: ");
		String pokemon4 = entrada.nextLine();
		
		System.out.print("Ingrese tu pokemon5: ");
		String pokemon5 = entrada.nextLine();
		
		System.out.print("Ingrese tu pokemon6: ");
		String pokemon6 = entrada.nextLine();
		
		entrada.close();
		
		System.out.println(pokemon1);
		System.out.println(pokemon2);
		System.out.println(pokemon3);
		System.out.println(pokemon4);
		System.out.println(pokemon5);
		System.out.println(pokemon6);
	}

}
