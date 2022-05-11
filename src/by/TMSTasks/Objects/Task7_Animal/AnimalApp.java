package by.TMSTasks.Objects.Task7_Animal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal dog = new Dog("кость","Минск","Артём");
        Animal cat = new Cat("рыбу","Минск","белый");
        Animal horse = new Horse("траву","Минск", 30);

        Animal[] animals = {dog,cat,horse};
        Vet vet = new Vet("Артём");

        for(Animal animal1 : animals ){
            vet.treatAnimal(animal1);
        }
    }
}
