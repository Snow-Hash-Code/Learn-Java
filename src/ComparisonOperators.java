
public class ComparisonOperators {
	public static void main(String []args) {
//		int a = 5;
//		int b = 4;
//		
//		boolean c = a == b;
//		boolean c = a > b;
//		boolean c = a < b;
//		boolean c = a >= b;
//		boolean c = a <= b;
//		boolean c = a != b;
		
//		System.out.println(c);
		
		double a = 2.4;
		
		if(a == 2.4) {
			System.out.println("Son iguales");
		}
		
		if(a > 7) {
			System.out.println("Mayror a 7");
		}
		
		if(a == 2.4 || a == 2.5) {
			System.out.println("a es 2.4 o 2.5");
		}
		
		if(a > 0 && a < 100) {
			System.out.println("Es mayor a 0 y menor a 100");
		}
	}
}
