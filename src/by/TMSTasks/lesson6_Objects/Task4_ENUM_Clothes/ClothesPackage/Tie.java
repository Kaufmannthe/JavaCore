package by.TMSTasks.lesson6_Objects.Task4_ENUM_Clothes.ClothesPackage;

import by.TMSTasks.lesson6_Objects.Task4_ENUM_Clothes.Clothes;
import by.TMSTasks.lesson6_Objects.Task4_ENUM_Clothes.Mans_Clothing;

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
