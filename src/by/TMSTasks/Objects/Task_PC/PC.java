package by.TMSTasks.Objects.Task_PC;

import java.util.Random;
import java.util.Scanner;

public class PC {
    private String cpu;
    private int ram;
    private int hdd;
    int cycles;

    public PC() {
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    void systemInfo(){
        System.out.println("Процессор: " + getCpu() +
                "\n" + "Оперативная память: " + getRam() +
                "\n" + "Жесткий диск: " + getHdd());     }   //Method 1



    void turnOnPC(){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int randomValue = r.nextInt(0,2);
        System.out.println("Введите значение от 0 до 1 для включения компьютера: ");
        int inputValue = s.nextInt();
        if (randomValue == inputValue){
            System.out.println("Компьютер включён");
            turnOffPc();
        }if (randomValue != inputValue) {
            System.out.println("Ошибка ввода");
        }

    }

    void turnOffPc(){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int randomValue = r.nextInt(0,2);
        System.out.println("Введите значение от 0 до 1 для выключения компьютера");
        int inputValue = s.nextInt();
        if (randomValue == inputValue){
            System.out.println("Компьютер выключен");
        }else {
            System.out.println("Ошибка ввода");
        }
    }

    public static void main(String[] args) {


        PC myPC = new PC();
        myPC.setRam(8);
        myPC.setHdd(1000);
        myPC.cycles = 3;
        myPC.setCpu("Intel Core i5 8540");

        myPC.systemInfo();

        for (int i = 0; i <= myPC.cycles; i++) {
            myPC.turnOnPC();
            if (i == myPC.cycles){
                System.out.println("Компьютер сгорел. Превышение ресурсов");
            }
        }
    }

}