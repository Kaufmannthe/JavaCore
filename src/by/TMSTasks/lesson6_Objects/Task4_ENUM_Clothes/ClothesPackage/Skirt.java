package by.TMSTasks.lesson6_Objects.Task4_ENUM_Clothes.ClothesPackage;

import by.TMSTasks.lesson6_Objects.Task4_ENUM_Clothes.Clothes;
import by.TMSTasks.lesson6_Objects.Task4_ENUM_Clothes.Women_Clothing;

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
