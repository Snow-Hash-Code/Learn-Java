public class JavaMethodsParameters {
    public static void main(String args[]){
        sayHi("Gerardo");
        sayHi("Pablo");
        sayHi("Dael");

        saySomething("Luis", 20);
        System.out.println(sum(50.3, 23.343));
    }

    public static void sayHi(String name){
        System.out.println("Hi " + name);
    }

    public static void saySomething(String name, int age){
        System.out.println(name + " is " + age + " years old");
    }

    public static double sum(double a, double b){
        return a + b;
    }
}
