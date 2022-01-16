package POOJAVA;

public class Pen {
    String type = "gel";
    String color = "blue";
    int point = 10;

    boolean clicked = false;

    public void click(){
        clicked = true;
    }

    public void unclick(){
        clicked = false;
    }
}
