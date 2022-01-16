public class FinallyKeywordJava {
    public static void main(String[] args) {

        try{
            int a = 5 / 0;
            System.out.println(a);
        }catch(Exception e){
            System.out.println("No se puede dividir un numero enetre cero");
        }finally{
            System.out.println("Esto esta en finally, siempre se ejecuta");
        }
    }
}
