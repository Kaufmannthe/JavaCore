package by.TMSTasks.Objects.Task9_OnlineStore;

public class Category {
    private String categoryName;
    private int[] product;

    public String getCategoryName() {
        return categoryName;
    }

    public int[] getProduct() {
        return product;
    }

    public Category(String categoryName, int[] product) {
        this.categoryName = categoryName;
        this.product = product;
    }
}

