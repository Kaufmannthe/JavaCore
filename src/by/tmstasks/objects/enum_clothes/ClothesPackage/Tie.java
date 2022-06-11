package by.tmstasks.objects.enum_clothes.ClothesPackage;

import by.tmstasks.objects.enum_clothes.Clothes;
import by.tmstasks.objects.enum_clothes.Mans_Clothing;

public class Tie extends Clothes implements Mans_Clothing {
    public Tie(int clothesSize, int clothesPrise, String clothesColor) {
        super(clothesSize, clothesPrise, clothesColor);
    }

    @Override
    public String toPutOnClothesOnMan() {
        return "Мужчине завязали галстук";
    }

    @Override
    public String toPutOnClothingOnWoman() {
        return null;
    }
}
