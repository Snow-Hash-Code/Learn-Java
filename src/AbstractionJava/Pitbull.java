package AbstractionJava;

/*
    Ya que no podemos instanciar nuestra clas abstract perro debemos heredarla.

    Heredamos de la misma forma que heredariamos una clase normal con la plabra extends
*/

public class Pitbull extends Dog{
    /*
        Una vez heredados los metodos de la clase abstract es obligatorio
        llamar todos los metodos abstractos y definir su comportamiento.

        Definimos el comoportamiento de la siguiente forma: 
    */

    public void sleep(){
        System.out.println("ZzZzZz!");
    }

    @Override // -> override invalida | anula el metodo anterior y lo sobreescribe
    public void bark(){
        System.out.println("Woof!");
    }

    @Override
    public void poop(){
        System.out.println("Poop!");
    }
}
