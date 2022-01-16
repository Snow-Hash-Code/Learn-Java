import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String args[]){
        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");

        // peek sirve para ver el primer elemento en la fila
        System.out.println(bbqLine.peek());

        // poll saca el primer elemento que se encuentre en la fila
        bbqLine.poll();
        System.out.println(bbqLine);

        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");

        q.poll();

        // size muestra el tamaño de la fila
        System.out.println(q.size());

        // contains verifica si contiene algun elemento que le pasemos com parametro
        System.out.println(q.contains("G"));

        // toArray permite acceder a las posiciones de la fila como si fuese un arreglo
        System.out.println(q.toArray()[1]);

        System.out.println(q);
    }
}