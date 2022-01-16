package InheritanceJava;

public class Main {
    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();
        Mouse3 m3 = new Mouse3();
        
        System.out.println("\tMouse1");

        m1.leftClick();
        m1.rightClick();
        m1.scrollUp();
        m1.scrollDown();

        System.out.println("\n\tMouse2");
        m2.rightClick();
        m2.leftClick();
        m2.scrollUp();
        m2.scrollDown();
        m2.connectB();

        System.out.println("\n\tMouse2");

        m3.rightClick();
        m3.leftClick();
        m3.scrollUp();
        m3.scrollDown();
        System.out.println(m3.ambidextrous);
    }
}
