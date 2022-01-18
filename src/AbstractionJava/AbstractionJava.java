package AbstractionJava;

public class AbstractionJava {
    public static void main(String[] args) {
        // Dog d = new Dog(); -> no podemos instanciar una clase abstracta, solo heredarla

        Pitbull p = new Pitbull();

        p.bark();
        p.poop();
        p.sleep();
    }
}
