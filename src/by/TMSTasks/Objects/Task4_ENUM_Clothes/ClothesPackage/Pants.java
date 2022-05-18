package by.TMSTasks.Objects.Task4_ENUM_Clothes.ClothesPackage;

import by.TMSTasks.Objects.Task4_ENUM_Clothes.Clothes;
import by.TMSTasks.Objects.Task4_ENUM_Clothes.Mans_Clothing;
import by.TMSTasks.Objects.Task4_ENUM_Clothes.Women_Clothing;

public class Pants extends Clothes implements Mans_Clothing, Women_Clothing {
    public Pants(int clothesSize, int clothesPrise, String clothesColor) {
        super(clothesSize, clothesPrise, clothesColor);
    }

    @Override
    public String toPutOnClothesOnMan() {
        return "На мужчину надели штаны.";
    }

    @Override
    public String toPutOnClothingOnWoman() {
        return "На женщину надели штаны";
    }
}
