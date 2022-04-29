package by.TMSTasks.lesson7_Strings;

/*Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
        последнего вхождения сивола(B)*/

public class Task1 {
    public static void main(String[] args) {
    StringBuffer stringBuffer = new StringBuffer("We are learning Java String's!");
        int a = stringBuffer.indexOf("e");
        int b = stringBuffer.lastIndexOf("e");
        System.out.println(stringBuffer.substring(a,b));
    }
}
