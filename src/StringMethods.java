
public class StringMethods {
	public static void main(String[] args) {
		String nombre = "Luis Gerardo Nava Ruiz";
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Minusculas: " + nombre.toLowerCase());
		System.out.println("Mayusculas: " + nombre.toUpperCase());
		System.out.println("Primer caracter: " + nombre.charAt(0));
		System.out.println("Longitud: " + nombre.length());
		System.out.println("Ultimo caracter: " + nombre.charAt(nombre.length() - 1));
		System.out.println("Substring: " + nombre.substring(18, 22));
	}
}
