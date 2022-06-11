package by.tmstasks.objects.clothes;

import by.tmstasks.objects.clothes.Jackets.AdidasJacket;
import by.tmstasks.objects.clothes.Jackets.NikeJacket;
import by.tmstasks.objects.clothes.Jackets.PumaJacket;
import by.tmstasks.objects.clothes.Pants.AdidasPants;
import by.tmstasks.objects.clothes.Pants.NikePants;
import by.tmstasks.objects.clothes.Pants.PumaPants;
import by.tmstasks.objects.clothes.Shoes.AdidasShoes;
import by.tmstasks.objects.clothes.Shoes.NikeShoes;
import by.tmstasks.objects.clothes.Shoes.PumaShoes;


public class ClothesApp {
    public static void main(String[] args) {
        AdidasJacket adidasJacket = new AdidasJacket(500);
        NikeJacket nikeJacket = new NikeJacket(400);
        PumaJacket pumaJacket = new PumaJacket(450);

        AdidasPants adidasPants = new AdidasPants(300);
        NikePants nikePants = new NikePants(300);
        PumaPants pumaPants = new PumaPants(310);

        AdidasShoes adidasShoes = new AdidasShoes(350);
        NikeShoes nikeShoes = new NikeShoes(400);
        PumaShoes pumaShoes = new PumaShoes(390);

        Person person1 = new Person(pumaJacket, adidasPants, pumaShoes);
        Person person2 = new Person(adidasJacket, nikePants, nikeShoes);
        Person person3 = new Person(nikeJacket, pumaPants, adidasShoes);

        Person[] people = {person1, person2, person3};

        for (Person person : people) {
            person.putOn();
            System.out.println("Стоимость набора одежды: " + person.getPrice());
            System.out.println("///////////////////////////////////");
        }

        System.out.println("_________________________________");

    /*    for (Person person : people){
            person.takeOff();
            System.out.println("///////////////////////////////////");
        }*/

        if (person1.getPrice() - person2.getPrice() > 0 &&
                person1.getPrice() - person3.getPrice() > 0) {
            System.out.println("Наибольшая стоимость из наборов: " + person1.getPrice());}

            if (person2.getPrice() - person1.getPrice() > 0
                    && person2.getPrice() - person3.getPrice() > 0){
                System.out.println("Наибольшая стоимость из наборов: " + person2.getPrice());}

                if (person3.getPrice() - person1.getPrice() > 0
                        && person3.getPrice() - person2.getPrice() > 0){
                    System.out.println("Наибольшая стоимость из наборов: " + person3.getPrice());
                }
    }
}

