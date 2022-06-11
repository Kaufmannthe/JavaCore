package by.tmstasks.lambda;

public class Lambda {
    public static void main(String[] args) {
    Calculator calculatorPlus = ((x, y) -> x + y);
    Calculator calculatorMinus = ((x, y) -> x - y);             //Примеры.
    Calculator calculatorDivision = ((x, y) -> x/y);
    Calculator calculatorMultiplication = ((x, y) -> x * y);

    int result = calculatorPlus.calculate(20,30) + calculatorMultiplication.calculate(10,2) +
            calculatorDivision.calculate(20,2) + calculatorMinus.calculate(30,20);

        System.out.println(result);

    }
    @FunctionalInterface
    public interface Calculator{        //Функциональный интерфейс, который реализует Лямбда.
        int calculate (int x, int y);
    }
}




