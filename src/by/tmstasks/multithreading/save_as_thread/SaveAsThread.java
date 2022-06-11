package by.tmstasks.multithreading.save_as_thread;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveAsThread implements Runnable {

    private ArrayList<Integer> list;

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public SaveAsThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        String output = "src/by/tmstasks/multithreading/save_as_thread/result.txt";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output, true));
            bufferedWriter.write(Thread.currentThread().getName() + ": ");
            for (Integer integer : this.list) {
                bufferedWriter.write(integer.toString());
                System.out.print(integer);
                Thread.sleep(500);
            }
            System.out.println("\n"+ Thread.currentThread().getName() + " stop.");
            bufferedWriter.write("\n");
            bufferedWriter.close();

        } catch (IOException e) {
            System.err.println("Error");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}



