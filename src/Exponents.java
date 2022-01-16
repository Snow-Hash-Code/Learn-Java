
public class Exponents {
	public static void main(String []args) {
		int a = 5;
		//Regresa un valor con decimal para quitar el decima debemos poner "(int) antes de Math.pow()
		System.out.println((int) Math.pow(a, 2));
		
		//Tambien se puede hacer con numeros decimales pero se debe almacenar en una variable double
		double exponente = Math.pow(2.3, 3.4);
		System.out.println(exponente);
	}
}
