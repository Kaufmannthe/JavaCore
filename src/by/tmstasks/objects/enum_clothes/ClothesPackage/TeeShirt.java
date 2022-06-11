package by.tmstasks.objects.enum_clothes.ClothesPackage;

import by.tmstasks.objects.enum_clothes.Clothes;
import by.tmstasks.objects.enum_clothes.Mans_Clothing;
import by.tmstasks.objects.enum_clothes.Women_Clothing;

public class TeeShirt extends Clothes implements Mans_Clothing, Women_Clothing {
    public TeeShirt(int clothesSize, int clothesPrise, String clothesColor) {
        super(clothesSize, clothesPrise, clothesColor);
    }

    @Override
    public String toPutOnClothesOnMan() {
        return "На мужчину надели футболку.";
    }

    @Override
    public String toPutOnClothingOnWoman() {
        return "На женщину надели футболку.";
    }
}
