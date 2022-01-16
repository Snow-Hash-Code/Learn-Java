public class GetterSetterJava {
    
    String name;
    int age;

    public static void main(String[] args) {
        sayHappyBirthDay("Luis");
        
        // los getters y setters es la forma que tenemos para obtener y definir una variable dentro de una clase
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void sayHappyBirthDay(String name){
        System.out.println("Happy Birthday "+ name);
    }
}
