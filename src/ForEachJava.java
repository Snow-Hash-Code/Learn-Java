public class ForEachJava {
    public static void main(String args[]){
        // for tradicional
        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("----------------");

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int numero : numeros){
            System.out.println(numero);
        }

        System.out.println("----------------");

        String[] cars = {"Dodge Challenger HellCat", "Eclipse", "MK1"};

        for(String car : cars){
            System.out.println(car);
        }
    }
}
