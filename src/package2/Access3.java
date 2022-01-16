package package2;

import package1.Access1;

public class Access3 extends Access1 {
    public static void main(String[] args) {
        /*
            Una forma para acceder a los protected es hacer que nuestra clase herede de la clase 
            que tiene dicho protected | esto se hace con la palabra reservada extends.

            Ahoara Access3 pasa a ser una subclase de Access1 
            por esto en vez de usar Access1() usamos la sublclase Access3() para acceder a 
            los valores protected
        */

        Access3 a = new Access3();
        //System.out.println(a.seconds); | no tenemos acceso a seconds porque es protected
        System.out.println(a.milisSeconds);
        System.out.println(a.getHours());
        System.out.println(a.getMinutes());
    }

    /*public static void main(String []args){
        Access1 a = new Access1();
        System.out.println(a.hours);
        System.out.println(a.minutes);
        //System.out.println(a.seconds); | seconds es privado
       //System.out.println(a.milisSeconds); | milisSeconds es protected
        //System.out.println(a.getSeconds()); | getSeconds() es private
    }
    */
}
