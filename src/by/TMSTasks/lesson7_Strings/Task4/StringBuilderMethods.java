package by.TMSTasks.lesson7_Strings.Task4;

public class StringBuilderMethods {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public StringBuilderMethods(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sumOfIntegers(){
        StringBuilder sum = new StringBuilder("Сумма чисел ").append(this.a).append(" и ").append(this.b).append(
                " = ").append(this.a + this.b).append("\n");
        int equalsSingDeleting = sum.indexOf("="); // поиск индекса символа "=".

        StringBuilder sumAfterDeleting = sum.deleteCharAt(equalsSingDeleting); // удаление этого символа.

        StringBuilder sumAfterInsert = sumAfterDeleting.insert(equalsSingDeleting,"равно"); //добавление слова "равно" по месту нахождения символа "="
        System.out.print(sumAfterInsert); //Task 2
    }

    public void decreaseOfIntegers(){
        StringBuilder decrease = new StringBuilder("Разница чисел ").append(this.a).append(" и ").append(this.b).append(
                " = ").append(a - b);

        int equalsSingDeleting = decrease.indexOf("="); //поиск индекса символа "=".

        System.out.println(decrease.replace(equalsSingDeleting,equalsSingDeleting + 1,"равно")); //Task 3
       /*Замена символа "=" на слово "равно" путём указания в сигнатуре того индекса, по которому определён вход символа, тот же индекс + 1
                и указания слова "равно".*/
    }

    public void multiplicationOfIntegers(){
        StringBuilder multiplication = new StringBuilder("Произведение чисел ").append(this.a).append(" и ").append(this.b).append(
                " = ").append(this.a * this.b);
        System.out.println(multiplication);
    }
    public void stringDeleteChar(){

    }
}
