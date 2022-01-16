
public class BreakInJava {
	public static void main(String []args) {
		String colores[] = {"rojo", "verde", "AMariLLo", "azul", "naranja"};
		
		for(int i = 0; i < colores.length; i++) {
			System.out.println(i);
			if(colores[i].toLowerCase().equals("amarillo")) {
				System.out.println("AMARILLO!");
				break;
			}
		}
		
		int a = 1;
		int b = 2;
		
		switch(a) {
			case 1: 
				System.out.println("Uno!");
				break;
			case 2:
				System.out.println("Dos!");
				break;
			case 3:
				System.out.println("Tres!");
				break;
			default: 
					break;
		}
		
		switch(b) {
			case 1 -> System.out.println("Uno!");
			case 2 -> System.out.println("Dos!");
			case 3 -> System.out.println("Tres!");
			default -> System.out.println("Número no listado");
		}
	}
}
