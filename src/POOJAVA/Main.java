package POOJAVA;
class Main{
    public static void main(String args[]){
        Pen p = new Pen();

        System.out.println(p.clicked);
        p.click();
        System.out.println(p.clicked);
        p.unclick();
        System.out.println(p.clicked);
    }
}