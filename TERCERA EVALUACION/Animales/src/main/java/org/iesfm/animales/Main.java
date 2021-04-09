package org.iesfm.animales;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("LISTA DE GATOS");
        List<Cat> cats = new LinkedList<>();
        cats.add(new Cat("red",1,7));
        cats.add(new Cat("red",5,4));

        for (Cat cat : cats){
            cat.sayHello();
            cat.kill();
            cat.saySomething();
        }
        System.out.println("-----------------");
        System.out.println();

        System.out.println("-----------------");
        System.out.println("LISTA DE CERDOS");
        List<Pig> pigs = new LinkedList<>();
        pigs.add(new Pig("Blue",2,100));
        pigs.add(new Pig("Blue",4,200));

        for (Pig pig : pigs){
            pig.sayHello();
            pig.saySomething();
        }
        System.out.println("-----------------");
        System.out.println();

        System.out.println("-----------------");
        System.out.println("LISTA DE ANIMALES");
        List<Animal> animals = new LinkedList<>();
        animals.add(new Cat("red",1,7));//Mete unicanente el animal pasado
        animals.add(new Pig("Blue",4,200));
        animals.addAll(cats);//Mete todos los gatos
        animals.addAll(pigs);//Mete todos los cerdos
        animals.add(cats.get(0));//Mete el primer gato
        animals.add(pigs.get(1));//Mete el segundo cerdo

        for (Animal animal : animals){
            animal.sayHello();
            animal.saySomething();
        }
        System.out.println("-----------------");
        System.out.println();




    }
}
