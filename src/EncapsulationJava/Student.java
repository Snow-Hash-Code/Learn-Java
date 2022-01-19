package EncapsulationJava;

public class Student {
    private String name;
    private int age;

    // Basicamente encapsulation es hacer getters and setters para los atributos de nuestra clase
    // ya que los atributos son privados

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
