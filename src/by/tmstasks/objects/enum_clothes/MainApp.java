package by.tmstasks.objects.enum_clothes;

import by.tmstasks.objects.enum_clothes.ClothesPackage.Pants;
import by.tmstasks.objects.enum_clothes.ClothesPackage.Skirt;
import by.tmstasks.objects.enum_clothes.ClothesPackage.TeeShirt;
import by.tmstasks.objects.enum_clothes.ClothesPackage.Tie;

public class MainApp {
    public static void main(String[] args) {
        Pants pants = new Pants(38, 150, "чёрные");
        TeeShirt teeShirt = new TeeShirt(40, 90, "белая");
        Skirt skirt = new Skirt(34, 200, "серая");
        Tie tie = new Tie(38, 30, "красный");

        Clothes[] clothes = {pants,teeShirt,skirt,tie};

        Aletier aletier = new Aletier();

        aletier.toPutOnClothesOnMan(clothes);
        System.out.println("\n");
        aletier.toPutOnClothingOnWoman(clothes);

    }
}
