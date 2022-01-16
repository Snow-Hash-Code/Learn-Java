
public class ReturnStatement {

	public static void main(String[] args) {
		String gritos = mayusculas("Por que modificaste mi codigooo!!!!");
		System.out.println(gritos);
		
		int arregloIncreible[] = arreglosDeEnteros(15,4,3);
		
		for(int i = 0; i < arregloIncreible.length; i++) {
			System.out.print(arregloIncreible[i]  + " ");
		}
	}
	
	public static String mayusculas(String s) {
		return s.toUpperCase();
	}
	
	public static int[] arreglosDeEnteros(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		
		return array;
	}
}
