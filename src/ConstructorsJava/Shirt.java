package ConstructorsJava;

public class Shirt {
    private String color;
    private char size;

    // Forma de hacer un constructor en la clase
    
    Shirt(String color, char size){
        // todo el codigo dentro de este constructor se ejectuara automaticamente despues de crear un objeto de esta clase
        // al crear un objeto de esta clase en el constructor se le pasara el color y talla;
        // de esta forma la asignación es automatica. Para ello, cuando se crea el objeto se le debera pasar los 
        // parametros necesarios (en este caso color y size)

       this.color = color;
       this.size = size;
    }

    public void putOn(){
        System.out.println("Shirt is on!");
    }

    public void takeOff(){
        System.out.println("Shirt is off!");
    }

    public String getColor() {
        return color;
    }

    public char getSize() {
        return size;
    }

   
}
