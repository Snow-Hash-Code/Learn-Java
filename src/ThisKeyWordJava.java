public class ThisKeyWordJava {

    int a; // this hace referencia a estos atributos
    int b;

    public void setData(int a, int b){
        //this hace referencia a los atributos de mi clase ThisKeyWordJava
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args) {
        ThisKeyWordJava t = new ThisKeyWordJava();

        t.setData(3, 4);

        System.out.println(t.a);
        System.out.println(t.b);
    }
}
