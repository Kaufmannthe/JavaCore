package by.TMSTasks.lesson7_Strings.Task5;

public class textReplacer {
    public static void main(String[] args) {
        myText oopText = new myText(new StringBuilder("Object-oriented programming is a programming language model organized around objects rather than").append(
                " \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."));
        oopText.replacer();
    }
}
