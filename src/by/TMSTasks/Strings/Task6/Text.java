package by.TMSTasks.Strings.Task6;

public class Text {
    public static void main(String[] args) {
        TextMethod dasha = new TextMethod(new StringBuilder("Даша"));
        TextMethod java = new TextMethod(new StringBuilder("Java"));
        TextMethod online = new TextMethod(new StringBuilder("Online"));

        TextMethod[]textMethods = {dasha,java,online};

        for (TextMethod textMethod:textMethods){
            textMethod.findAMiddle();
        }
    }
}
