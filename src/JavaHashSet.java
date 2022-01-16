import java.util.HashSet;

public class JavaHashSet {
    public static void main(String []args){
        HashSet<String> h = new HashSet<String>();
        h.add("Cat");
        h.add("Panda");
        h.add("Koala");
        h.add("Dog");

        //Remove one value int HashSet
        h.remove("Dog");
        System.out.println(h);

        //Remove all elements in the HasSet
        // h.clear();
        // System.out.println(h);

        //Verifica si el HasSet contiene cierto elemento returns true or false
        System.out.println(h.contains("Cat"));

        //Verifica si el HashSet esta vacio o no returns true or false
        System.out.println(h.isEmpty());

        System.out.println(h);
    }
}
