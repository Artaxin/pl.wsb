package pl.wsb;

public class Human {
    String firstName;
    String lastName;
    String age;
    Animal pet;
    Car car;


    public Human(String firstName, String lastName, String age, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.car = car;


    }



    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

