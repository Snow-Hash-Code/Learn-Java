import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		//Para agregar mas elementos tambien debemos cambiar el tamaño del arreglo
		String frutas[] = new String[3];
		frutas[0] = "Mango";
		frutas[1] = "Manzana";
		frutas[2] = "Cereza";
		System.out.println(frutas[1]);
		
		//Para agregar mas elementos no necesitamos cambiar el tamaño del arreglo
		ArrayList<String> listaFrutas = new ArrayList<String>();
		listaFrutas.add("Mango");
		listaFrutas.add("Manzana");
		listaFrutas.add("Cereza");
		listaFrutas.add("Sandia");
		
		listaFrutas.remove("Sandia");
		listaFrutas.clear();
		System.out.println(listaFrutas.contains("raspberry"));
		System.out.println(listaFrutas);
	}

}
