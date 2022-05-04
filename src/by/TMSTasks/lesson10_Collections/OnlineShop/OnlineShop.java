package by.TMSTasks.lesson10_Collections.OnlineShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OnlineShop {
    static List<Product> productList = new ArrayList<>();


    public OnlineShop() {
    }

    public void addProduct(Product product) {
        productList.add(product); //Метод принимает товар класса Product.
    }

    public void mainMenu() throws IOException {
        String intro = """
                Добро пожаловать в магазин

                1.Добавить товар.
                2.Вывести список товаров.
                3.Изменить товар
                4.Удалить товар.
                5.Выход из программы.""";
        System.out.println(intro);
        System.out.println("_________________________________");
        System.out.print("Выберите действие: ");

        try (Scanner scannerForIntro = new Scanner(System.in)) {
            int introCheck = scannerForIntro.nextInt();
            switch (introCheck) {
                case 1 -> toMakeAProduct();
                case 2 -> shopInfo();
                case 3 -> changeProduct();          //Свитч кейсы для перехода в разделы.
                case 4 -> removerProduct();
                case 5 -> shopClose();
                default -> {
                    String error = "Ошибка. Укажите цифру пункта из указанных ниже.";
                    System.err.println(error);
                    mainMenu();
                    //Консольное меню. Переход в раздел осуществляется вводом цифры, которая указана слева.
                    //При указании цифры, которая не соответствует ни одному из разделов появляется ошибка и программа
                    //направляет Вас назад в это меню.
                }
            }

        } catch (InputMismatchException e) {
            String criticalError = "Критическая ошибка. Перезапустите программу и используйте целые числа для перехода в разделы.";
            System.err.println(criticalError);
            //Из всех испробованных способов только данный работает. В другом случае, например, если мы хотим выдать ошибку,
            //а потом вернуться назад в главное меню, случается ошибка рантайма.
        }
    }

    public void changeProduct() throws IOException {
        Scanner scannerForChangeProductInt = new Scanner(System.in);
        BufferedReader bufferedReaderForChangeProduct = new BufferedReader(new InputStreamReader(System.in));

        shortcutShopInfo();
        System.out.println("\nВведите ID товара, который хотите изменить.");
        int idToEdit = scannerForChangeProductInt.nextInt();

        for (Product product : productList) {
            int searchingID = product.getProductID();
            if (idToEdit == searchingID) {
                //Цикл проверяет наличие товара со схожим айдишником. Если товар с указанным айдишником существует, то
                //программа покажет консольное меню с параметрами, которые можно изменить.
                String result = """
                        Объект найден. Выберите элемент, который необходимо изменить:

                        1.ID товара.
                        2.Имя товара.
                        3.Цена товара.
                        4.Вернуться в главное меню.""";

                String info = "ID " + product.getProductID() + ", название: " +
                        product.getProductName() + ", цена: " + product.getProductPrice() + " рублей, индекс: " +
                        productList.indexOf(product);

                System.out.println(result); //Вывод консольного меню.
                System.out.println(info); //Вывод найденного товара.
                int changeProduct = scannerForChangeProductInt.nextInt();
                if (changeProduct == 1) {
                    System.out.println("\nВведите новый ID товара:\n ");
                    product.setProductID(scannerForChangeProductInt.nextInt()); //Установка нового значения айдишника.
                    System.out.println("ID товара успешно изменено.\n");
                    toContinue();
                }

                if (changeProduct == 2) {
                    System.out.println("\nВведите новое имя товара:\n ");
                    product.setProductName(bufferedReaderForChangeProduct.readLine()); //Установка нового значения названия товара.
                    System.out.println("Имя товара успешно изменено.\n");
                    toContinue();
                }

                if (changeProduct == 3) {
                    System.out.println("\nВведите новую цену товара:\n ");
                    product.setProductPrice(scannerForChangeProductInt.nextDouble()); //Установка новой цены товара.
                    System.out.println("Цена товара успешно изменена.\n");
                    toContinue();
                }

                if (changeProduct == 4) {
                    System.out.println("\nВозврат в главное меню.\n"); //По консольному меню возврат в главное меню.
                    mainMenu();
                }

                if (changeProduct > 4 || changeProduct < 0) {
                    System.err.println("\nОшибка ввода. Возврат.\n");
                    changeProduct();
                    //Вывод ошибки, если указано число, которое не соответствует ни одному из пунктов. Возврат к редактору.
                }

            }
        }
    }

    public void shopClose() {
        System.out.println("\nОкончание работы.\n"); //Метод для окончания работы программы.
    }

    public void shortcutShopInfo() {
        System.out.println("\nАктуальный список товаров.");
        for (Product product : productList) {
            String info = "ID " + product.getProductID() + ", название: " +
                    product.getProductName() + ", цена: " + product.getProductPrice() + " рублей, индекс: " +
                    productList.indexOf(product);
            System.out.println(info);
            //Уменьшенный по функционалу вариант вывода списка товаров. Предназначен для отображения изменений в других методах.
        }
    }

    public void shopInfo() throws IOException {
        System.out.println("\nАктуальный список товаров.");
        for (Product product : productList) {
            String info = "ID " + product.getProductID() + ", название: " +
                    product.getProductName() + ", цена: " + product.getProductPrice() + " рублей, индекс: " +
                    productList.indexOf(product);
            System.out.println(info);
            //Полноценная версия списка товаров с возможностью сортировки по цене и айдишнику.
            //Предназначен для перехода из главного меню.
        }
        String sortingShopInfo = "\nТовары могут быть отсортированы по цене и ID.\n" +
                "Введите 'Цена' для сортировки по цене.\nВведите 'ID' для сортировки по цене\n" +
                "Введите 'Назад' для возврата в главное меню.\n"; //Консольное меню.
        BufferedReader bufferedReaderForShopInfo = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(sortingShopInfo);
        String sortingShopInfoString = bufferedReaderForShopInfo.readLine();

        if (sortingShopInfoString.equalsIgnoreCase("Цена")) { //Сортировка по цене.
            sortByPrice();
        }

        if (sortingShopInfoString.equalsIgnoreCase("ID")) { //Сортировка по айдишнику.
            sortByID();
        }

        if (sortingShopInfoString.equalsIgnoreCase("Назад")) { //Возврат в главное меню.
            mainMenu();
        }
        if (!sortingShopInfoString.equalsIgnoreCase("Цена")
                && !sortingShopInfoString.equalsIgnoreCase("ID")
                && !sortingShopInfoString.equalsIgnoreCase("Назад")) {

            String error = "Ошибка ввода. повторите попытку.";
            System.err.println(error);
            shopInfo();
            //Вывод ошибки, если указано слово, которое не соответствует ни одному из пунктов.
            //Возврат к списку товаров.
        }
        toContinue();
    }


    public void toContinue() throws IOException {
        System.out.println();
        BufferedReader bufferedReaderShopInfo = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы хотите продолжить? Да/Нет");
        String stringShopInfo = bufferedReaderShopInfo.readLine();
        if (stringShopInfo.equalsIgnoreCase("Да")) {
            System.out.println();
            mainMenu();
        }
        if (stringShopInfo.equalsIgnoreCase("Нет")) {
            System.out.println();
            shopClose();
            //Метод, который направлен на уточнение у пользователя о желании продолжать работать.
            //Ввод команд через консоль.
        }
    }


    public void toMakeAProduct() throws IOException {
        String rules = """

                Добавление товара

                Правила добавления товара: ID товара - целое число, Цена товара - целое число/дробное число, Имя товара - буквы латиницы/буквы кириллицы.
                Далее/Назад""";
        BufferedReader bufferedReaderShopInfo = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(rules); //Вывод правил, по которым необходимо создавать товар.
        String rulesCheck = bufferedReaderShopInfo.readLine();
        if (rulesCheck.equalsIgnoreCase("Далее")) {

            Scanner scannerForNumbers = new Scanner(System.in);
            BufferedReader bufferedReaderToMakeAProduct = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Введите ID товара: ");
            int ID = scannerForNumbers.nextInt();   //Ввод УНИКАЛЬНОГО айдишника товара.
            for (Product products : productList) {

                int idToMakeAProduct = products.getProductID();
                if (ID == idToMakeAProduct) { //Совпадение найдено.
                    System.out.println("\nТовар с указанным ID уже существует. Попробуйте заново.");
                    String info = "\nID: " + products.getProductID() + ", Имя товара: " + products.getProductName() + "," +
                            " Цена товара: " +
                            products.getProductPrice();
                    System.out.println(info);
                    toContinue();

                    //Первоначальная проверка. Если указанный айдишник существует, то программа выбрасывает ошибку, что
                    //товар с указанным айдишником существует. Возврат к созданию продукта.
                    // Если айдишник новый, то программа продолжает работу.
                }
            }
            {
                //Если указанный айдишник новый.

                System.out.print("Введите Цену товара: ");
                double priceProduct = scannerForNumbers.nextDouble();   //Ввод цены товара.

                System.out.print("Введите Имя товара: ");
                String productName = bufferedReaderToMakeAProduct.readLine();   //Ввода имени товара

                Product product = new Product(ID, productName, priceProduct);   //Создание товара из указанных данных.
                addProduct(product);
                System.out.println("\nТовар успешно добавлен.\n");

                System.out.println("Актуальный список продуктов.");
                shortcutShopInfo();
                toContinue();//Вывод списка товаров для подтверждения успешного добавления товара.

            }
        }
        if (rulesCheck.equalsIgnoreCase("Назад")) {
            mainMenu();     //Возврат в меню, если пользователь ввёл "Назад"
        } else {
            System.err.println("Ошибка ввода. Попробуйте заново.");
            toMakeAProduct();   //Ошибка, если какие-то данные были указаны неверно. Возврат к созданию товара.
        }
    }

    public void removerProduct() throws IOException {
        Scanner scannerToRemoverAProduct = new Scanner(System.in);
        shortcutShopInfo();
        System.out.println("Введите ID товара, который хотите удалить.");
        int intToRemoverAProduct = scannerToRemoverAProduct.nextInt(); //Указываем айди товара, который хотим удалить.
        Iterator<Product> iterator = productList.iterator();

        while (iterator.hasNext()) {
            //Поиск товаров по айдишнику с помощью Итератора.

            int intToRemoveAProduct = iterator.next().getProductID();
            if (intToRemoveAProduct == intToRemoverAProduct) {
                //В случае нахождения совпадения удаляет товар.
                iterator.remove();
                System.out.println("\nТовар успешно удалён\n");
                shortcutShopInfo();
                toContinue();

            }
            if (!iterator.hasNext()) {
                System.err.println("\nТовар по указанному ID не найден.\n");
                toContinue();
                //Если товар с указанным айдишником отсутвуте выдаёт ошибку и уточняет о дальнейшей работе
                //, если пользователь соглаен, то возвращает на главное меню.
            }

        }
    }

    public void sortByPrice() {
        productList.sort(Product.CompareByPrice);
        for (Product product : productList) {
            String info = "ID " + product.getProductID() + ", название: " +
                    product.getProductName() + ", цена: " + product.getProductPrice() + " рублей, индекс: " +
                    productList.indexOf(product);
            System.out.println(info);
            //Метод для сортировки товаров по стоимости.
        }
    }

    public void sortByID() {
        productList.sort(Product.CompareByID);
        for (Product product : productList) {
            String info = "ID " + product.getProductID() + ", название: " +
                    product.getProductName() + ", цена: " + product.getProductPrice() + " рублей, индекс: " +
                    productList.indexOf(product);
            System.out.println(info);
            //Метод для сортировки по айди.
        }

    }
}

