
public class SwitchCase {
	public static void main(String[] args) {
		int day = 3;
		
		//switch con break statement
		switch(day) {
			case 1:
					System.out.println("Domingo");
					break;
			case 2: 
					System.out.println("Lunes");
					break;
			case 3:
					System.out.println("Martes");
					break;
			case 4: 
					System.out.println("Miercoles");
					break;
			case 5: 
					System.out.println("Jueves");
					break;
			case 6: 
					System.out.println("Viernes");
					break;
			case 7: System.out.println("Sabado");
					break;
			default:
					System.out.println("Dia no valido");
					break;
		}
		
		// switch sin break statement las flechas -> indican el break
		
//		switch(day) {
	//		case 1 -> System.out.println("Domingo");
	//		case 2 -> System.out.println("Lunes");
	//		case 3 -> System.out.println("Martes");
	//		case 4 -> System.out.println("Miercoles");
	//		case 5 -> System.out.println("Jueves");
	//		case 6 -> System.out.println("Viernes");
	//		case 7 -> System.out.println("Sabado");
	//		default -> System.out.println("Dia no valido");
//		}
	}
}
