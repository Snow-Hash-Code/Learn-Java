public class Account {
    String name;
    int age;
    public static void main(String[] args) {
        Account a = new Account();

        a.setName("Gerardo");
        a.setAge(20);

        System.out.println("-----------------");

        System.out.println(a.getAge());
        System.out.println(a.getName());

        a.printInformation();
    }

    // Setters

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Getters

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void printInformation(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

