package pl.wsb;

public class Animal {

    final String species;
    String name;
    private Double weight;

    final Double DEFAULT_CAT_WEIGHT = 5.0;
    final Double DEFAULT_DOG_WEIGHT = 15.0;
    final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public Animal(String species, String name){
        this.species = species;
        this.name = name;
        if (this.species.equals("kot"))
            this.weight = DEFAULT_CAT_WEIGHT;
        else if (this.species.equals("pies"))
            this.weight = DEFAULT_DOG_WEIGHT;
        else this.weight = DEFAULT_ANIMAL_WEIGHT;

    }

    public Double getWeight() {
        return weight;
    }


    void feed(){
        if (weight <= 0){
            System.out.println(this.species + " --> OOps, animal is dead");
        }
        else weight++;
        System.out.println(this.species + " dzieki za nakarmianie, teraz moja waga to " + this.weight);
    }


    void walk() {
        weight--;
        if (weight <= 0) {
            System.out.println(this.species + " --> OOps, animal is dead");
        } else{
            System.out.println(this.species + " dzieki za spacer, teraz moja waga to " + this.weight);
        }
    }
}
