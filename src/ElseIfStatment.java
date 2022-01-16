import java.util.Scanner;

public class ElseIfStatment {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Inserte una calificacion entre 0 y 100: ");
		
		int numero = entrada.nextInt();
		
		entrada.close();
		
		if(numero >= 90 && numero <= 100) {
			System.out.println("A");
		} else if(numero >= 80 && numero < 90) {
			System.out.println("B");
		} else if(numero >= 70 && numero < 80) {
			System.out.println("C");
		} else if(numero >= 65 && numero < 70) {
			System.out.println("D");
		} else if(numero >= 0 && numero < 65) {
			System.out.println("F");
		} else {
			System.out.println("El numero que ingresaste no se encuentra en el rango");
		}
	}

}
