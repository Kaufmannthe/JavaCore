package by.tmstasks.objects.enum_clothes.ClothesPackage;

import by.tmstasks.objects.enum_clothes.Clothes;
import by.tmstasks.objects.enum_clothes.Women_Clothing;

public class Skirt extends Clothes implements Women_Clothing {
    public Skirt(int clothesSize, int clothesPrise, String clothesColor) {
        super(clothesSize, clothesPrise, clothesColor);
    }

    @Override
    public String toPutOnClothingOnWoman() {
        return "На женщину надели юбку.";
    }

    @Override
    public String toPutOnClothesOnMan() {
        return null;
    }
}
