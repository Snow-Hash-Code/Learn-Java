/*
    una interface sirve para tener una cierta herencia multiple, ya que java no permite herencia multiplie.
    Una interface es una colección de métodos abstractos y propiedades constantes en las que se especifica 
    que hacer pero no el como; serán las clases hijas, las clases que la implementan; las encargadas de 
    definir el como se debe hacer. Para que una clase implemente dicha interface se usa la palabra reservada
    implements 
*/

/*
    Una clase abstracta es aquella qeu tiene atributos, constructores y por lo menos un método abstracto.
    Las clases abstractas no pueden ser instanciadas (crear un objeto de ella); solo pueden ser heredadas.

    Un método abstracto es aquel que al momento de la clase hija herdarlo de la clase padre tiene que reescribirlo
    para ello se crean metodos vacios que son a su vez los metodos abstractos, los cuales dicen que se debe hacer
    pero no el como. Seran la clases que hereden estos metodos las que indiquen como se debe hacer. 

    Ej. de clase abstracta

    public abstract class Figura{
        private int numeroLados;

        public figura(){
            this.numeroLados = 0;
        }

        //este es el metodo abstracto o un metodo vacio
        public abstract float area();
    }

    Ej. de como heredar de una clase abstracta | para ello se hace uso de la palabra resservada extends seguido
    del nombre de la clase que estsamos heredando

    public class Circulo extends Figura {

        public float radio;

        //de esta forma ocupamos los metodos de la clase que heredamos
        @Override
        public float area(){
            return 3.1415f * (this.radio * this.radio);
        }
    }
*/

package InterfacesJava;

interface WatterBottleInterface{
    void fillUp();
}

interface Amb{
    void sayHello();
}

public class InterfacesJava implements WatterBottleInterface, Amb{
    public static void main(String[] args) {
        InterfacesJava ex = new InterfacesJava();

        ex.fillUp();
        ex.sayHello();
    }
    
    @Override
    public void fillUp() {
        System.out.println("It is filled!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
