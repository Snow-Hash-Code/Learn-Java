package EncapsulationJava;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Nombre: ");
        s.setName("Gerardo");
        System.out.println(s.getName());

        System.out.println("Edad: ");
        s.setAge(20);
        System.out.println(s.getAge());
    }
}
