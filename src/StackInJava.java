import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();

        games.add("Fortnite");
        games.add("Halo");
        games.add("Minecraft");

        //Remover el elemento que esta en el tope del Stack
        // System.out.println(games.pop());
        // System.out.println(games.pop());
        // System.out.println(games.pop());
        // System.out.println(games);

        // Ver el elemento que esta en el tope del Stack
        // System.out.println(games.peek());

        Stack<Character> tower = new Stack<Character>();


        /*
            Y
            B
            R
        */
        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower);
        System.out.println(tower.peek());

        // contains verifica si la pila contiene cierto valor
        System.out.println(tower.contains('B'));

        // empty verifica si la pila tiene elementos
        System.out.println(tower.empty());

        // isEmpty verifica si el tamaño del arreglo es cero
        System.out.println(tower.isEmpty());

        // get obtiene el elemento que se enuentre en la posicion que le pasemos
        System.out.println(tower.get(0));

        // set reemplaza el elemento en la posicion que le pasemos por el elemento que le pasemos
        System.out.println(tower.set(1, 'P'));

        // size muestra la longitud del stack
        System.out.println(tower.size());
    }
}
