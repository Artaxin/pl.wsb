package pl.wsb;

public class Main {

    public static void main(String[] args) {

       Human human1 = new Human("Jan", "Kowalski","33");
       Human human2 = new Human("Adam", "Nowak","27");

       Animal animal1 = new Animal("pies","Azor","4");
       Animal animal2 = new Animal("kot","Puszek","8");

       Phone phone1 = new Phone("2019","Galaxy S9","2000");
       Phone phone2 = new Phone("2020","Xiaomi11", "3300");

        System.out.println(human1);
        System.out.println(human1.firstName);
        System.out.println("Human: " + human1.firstName + " " + human1.lastName + " " + human1.age);
    }
}
