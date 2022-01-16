
public class Animal {
	public static void main(String []args) {
		String texto = imADog();
		System.out.println(texto);
		
		doStuff();
	}
	
	public static String imADog() {
		return "I'm a Dog";
	}
	
	public static void doStuff() {
		int a = 5;
		while(a < 50) {
			System.out.println(a +": Hi!");
			a++;
		}
		
		try {
			
		} catch(Exception e) {
			
		}
	}
}
