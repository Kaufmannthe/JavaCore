package by.TMSTasks.Objects.Task4_ENUM_Clothes.ClothesPackage;

import by.TMSTasks.Objects.Task4_ENUM_Clothes.Clothes;
import by.TMSTasks.Objects.Task4_ENUM_Clothes.Mans_Clothing;
import by.TMSTasks.Objects.Task4_ENUM_Clothes.Women_Clothing;

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
