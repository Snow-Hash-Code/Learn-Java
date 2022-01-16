package ConstructorsJava;

public class Main {
    public static void main(String[] args) {
        Shirt s = new Shirt("blue", 'm'); //new Shirt() es el constructor por defecto

        s.putOn();
        s.takeOff();
        s.getSize();
        s.getColor();
    }
}
