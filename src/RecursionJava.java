public class RecursionJava {
    public static void main(String[] args) {
        sayHi(5);
    }

    // Necestiamos un caso base para saber cuando parar en la recursion

    public static void sayHi(int n){
        if(n != 0){
            System.out.println("Hola");
            n--;
            sayHi(n);
        }
    }
}
