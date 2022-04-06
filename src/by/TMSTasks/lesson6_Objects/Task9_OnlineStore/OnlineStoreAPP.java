package by.TMSTasks.lesson6_Objects.Task9_OnlineStore;

public class OnlineStoreAPP {
    public static void main(String[] args) {
            Product computerMouse = new Product("Компьютерная мышь",25,4.2);
            Product pencil = new Product("Карандаш",0.5,4.6);
            Product tomatoJuice = new Product("Томатный сок",2.5,4);
            Product masterAndMargarita = new Product("Книга: Мастер и Маргарита",15,4.9);

            Product[] products ={computerMouse,pencil,tomatoJuice,masterAndMargarita};

            User user = new User("kaufmann","541241");

        System.out.println("В вашей корзине следующие товары:" + "\n");
            for (Product product:products){
                product.productInfo();
            }


    }
}
