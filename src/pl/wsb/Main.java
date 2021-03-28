package pl.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Astra", "Opel", "Black", 4);
        Car car2 = new Car("Galaxy", "Ford", "Silver", 5);

       Human human1 = new Human("Jan","Kowalski","33",car1);
       Human human2 = new Human("Adam", "Nowak","27", car2);


       Animal animal1 = new Animal("pies","Azor");
       Animal animal2 = new Animal("kot","Puszek");

       Phone phone1 = new Phone("2019","Galaxy S9","2000");
       Phone phone2 = new Phone("2020","Xiaomi11", "3300");



        System.out.println(human1);
        System.out.println(human1.firstName);
        System.out.println("Human: " + human1.firstName + " " + human1.lastName + " " + human1.age);

        if(animal1.getWeight() > animal2.getWeight())
            System.out.println("Cięższy jest " + animal1.name +". Jego waga: " + animal1.getWeight());
        else System.out.println("Cięższy jest " + animal2.name +". Jego waga: " + animal2.getWeight());

        System.out.println("\n-------------------\n");

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(human1);
        humanList.add(human2);

        for (Human human : humanList){
            System.out.println(human.lastName);
        }

        System.out.println("\n-------------------\n");

        animal1.feed();
        animal1.walk();
        animal1.walk();
        animal1.walk();
        animal1.walk();

        animal2.feed();
        animal2.walk();
        animal2.walk();
        animal2.walk();
        animal2.walk();
        animal2.walk();
        animal2.walk();
        animal2.walk();
        animal2.walk();


    }
}
