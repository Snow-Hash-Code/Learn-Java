public class MathLibrary {
    public static void main(String[] args) {
        System.out.println(Math.class);
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-12.34));
        System.out.println(Math.acos(.54));
        System.out.println(Math.addExact(10, 30));
        System.out.println(Math.asin(1));
        System.out.println(Math.atan2(6, 3));
        System.out.println(Math.cbrt(27));
        //ceil redondea "hacia arriba" un numero dado
        System.out.println(Math.ceil(5.4));
        //floor redondea "hacia abajo" un numero dado
        System.out.println(Math.floor(7.9));
        System.out.println(Math.copySign(4, -2));
        System.out.println(Math.copySign(-4, 2));
        System.out.println(Math.cos(0.5));
        System.out.println(Math.cosh(-0.2));
        //decrementExact le resta 1 a un valor entero
        System.out.println(Math.decrementExact(10));
        System.out.println(Math.exp(5));
        System.out.println(Math.expm1(5));
        //floorDiv dive los numeros y los redondea "hacia abajo"
        System.out.println(Math.floorDiv(5, 2));
        System.out.println(Math.getExponent(64));
        //hypot retorna la raiz cuadrado de x^2 + y^2 | (9 + 16) = 25 raiz cuadrada de 25 = 5
        System.out.println(Math.hypot(3, 4));
        //incrementExact incrementa en 1 un valor dado
        System.out.println(Math.incrementExact(8));
        System.out.println(Math.log(Math.E));
        //retorna el numero mas grande de dos numeros dados ya sean enteros o flotantes
        System.out.println(Math.max(98, 222));
        //retorna el numero mas pequeño de dos numeros dados ya sean enteros o flotantes
        System.out.println(Math.min(3, 5));
        //multiplyExact multiplica dos numeros dados enteros; en caso de ser flotantes lanza un exception
        System.out.println(Math.multiplyExact(2, 3));
        //negateExact pone en negativo un numero dado | si el numero dado es negativo obedeciendo la ley de signos se retornara el mismo numero pero positvio
        System.out.println(Math.negateExact(-45));
        //pow retorna el valor del primer argumento elevado al segundo argumento
        System.out.println(Math.pow(2, 6));
        /*Radom retorna un numero double aleatorio entre 0.0 y 1.0
        Siempre salen decimales por ello multiplicamos por 10 para que salgan numeros enteros
        y ponemos (int) enfrente de Math.random() * 10 para forzar a ser un numero entero sin decimales
        */
        System.out.println((int) (Math.random() * 10));
        //sqrt retorna la raiz cuadrada de un numero dado
        System.out.println(Math.sqrt(25));
        //substracExact quita al primer parametro la cantidad que se le pase en el segundo parametro
        System.out.println(Math.subtractExact(9, 2));
        //toIntExact retorn un el numero entero exacto el parametro debe ser de tipo long 
        System.out.println(Math.toIntExact((long) 8.5));
    }
}
