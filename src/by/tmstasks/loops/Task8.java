package by.tmstasks.loops;

public class Task8 {
    public static void main(String[] args) {
    for(int i = 1; i <= 4; i++){
        for (int o = 1; o <= i; o++){
            System.out.print(" *");
        }
        System.out.println();
    }
        System.out.println();
    for (int q = 4; q >= 1 ; q--){
        for (int w = q; w >= 1; w--){
            System.out.print(" *");
        }
        System.out.println(" ");
    }

    }
}