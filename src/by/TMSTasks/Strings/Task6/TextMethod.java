package by.TMSTasks.Strings.Task6;

public class TextMethod {
    private StringBuilder stringBuilder;

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public TextMethod() {
    }

    public TextMethod(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }
    public void findAMiddle(){
        int stringLength = this.stringBuilder.length();
        int theMiddleOfString = stringLength / 2;
        StringBuilder result = new StringBuilder("Середина строки: ").append(this.stringBuilder.charAt(theMiddleOfString)).append(
                this.stringBuilder.charAt(theMiddleOfString + 1));
        System.out.println(result);
    }
}
