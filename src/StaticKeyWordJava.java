public class StaticKeyWordJava {

    static int a = 0;
    public static void main(String[] args) {
        int b = 1;

        //No podemos usar una variable que esta en un scope diferente aqui, para ello debemos agregar la palabra reservada static
        // System.out.println(a); -> esto da un error ya que a no tiene la palabra static y esta en un scope diferente

        System.out.println(a); //esto si funciona ya que a es static
    }
}
