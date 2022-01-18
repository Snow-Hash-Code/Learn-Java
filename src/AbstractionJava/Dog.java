package AbstractionJava;

/*
    Una clase abstracta es aquella que tiene por los menos un método abstracto
*/

public abstract class Dog {
    /*
        Esto es un método abstracto. Es un método "vacío" el cual nos dice que hacer pero no como hacerlo.
        Las clases que hereden la clase abstracta (en este caso Dog) y, por lo tanto los métodos abstractos
        deberan definir el comportamiento de dichos métodos
    */
    public abstract void bark();

    public abstract void poop();
}
