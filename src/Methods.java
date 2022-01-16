
public class Methods {
	public static void main(String []args) {
		int a = 5;
		int b = 10;
		System.out.println(a * b);
		
		int c = 2;
		int d = 3;
		System.out.println(c * d);
		
		int e = 6;
		int f = 8;
		System.out.println(e * f);
		
		multiply(20,2);
		
		int multiplicacion = multiplicar(6, 3);
		System.out.println(multiplicacion);
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
}
