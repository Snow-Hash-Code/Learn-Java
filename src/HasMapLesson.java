import java.util.HashMap;

public class HasMapLesson {
    public static void main(String[] args) {

        HashMap<String, Integer> happy = new HashMap<String, Integer>();

        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy.get("c"));
        // System.out.println(happy.keySet());
        // System.out.println(happy.values());

        HashMap<String, String> fun = new HashMap<String, String>();

        fun.put("AGeraNR", "holamundo;");
        fun.put("JnJ0s", "Fortnite!");
        fun.put("Redux", "fldsmdfr");


        System.out.println(fun.containsValue("holamundo;"));
        System.out.println(fun.containsKey("JnJ0s"));
        System.out.println(fun.replace("AGeraNR", "holamundo;", "betterpasswordomgtoohards"));

        fun.remove("Redux");

        System.out.println(fun);
    }
}
