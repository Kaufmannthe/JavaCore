package by.TMSTasks.lesson6_Objects.Task3_Matrix;

import java.util.Random;

public class Matrix {
    Random r = new Random();
    int [][] array;
    private     int lines;
    private     int columns;

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Matrix(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
        this.array = new int [lines][columns];
    }

    public void matrixCreate(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = r.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            
        }
        
    }
    public void matrixSum(int [][] matrix){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(matrix[i][j] + array[i][j] + " ");
            }
        }
    }
    public void matrixMultiply(int multiplyValue){
        for (int[] arrays: array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(arrays[i] * multiplyValue + " ");
            }
        }
    }
}
