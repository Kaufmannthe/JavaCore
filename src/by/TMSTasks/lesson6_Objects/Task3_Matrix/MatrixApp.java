package by.TMSTasks.lesson6_Objects.Task3_Matrix;

public class MatrixApp {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(3,3);           //Создание объектов "Матрица"

        System.out.println("Вывод двух матриц на экран: ");
        matrix1.matrixCreate();
        System.out.println();               //Вывод на экран сгенерированных матриц
        matrix2.matrixCreate();
        System.out.println();


        System.out.print("Сумма двух матриц: ");
        matrix1.matrixSum(matrix2.array);           //Сложение матриц
        System.out.println();

        System.out.print("Умножение первой матрицы: ");
        matrix1.matrixMultiply(2);
        System.out.print("\n" +"Умножение второй матрицы: ");
        matrix2.matrixMultiply(2);
    }
}
