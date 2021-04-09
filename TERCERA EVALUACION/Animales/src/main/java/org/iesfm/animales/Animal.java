package org.iesfm.animales;

import java.util.Objects;

public abstract class Animal {
    private String color;
    private int age;

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello, my color is " + color + " I am " + age + " years old");
    }

    public abstract void saySomething();//Muestra Oink o Miau dependiendo del animal que sea
                                        //Hay que implementar el metodo en cada clase que se
                                        //quiera utilizar

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
