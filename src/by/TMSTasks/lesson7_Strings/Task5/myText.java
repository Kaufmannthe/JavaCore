package by.TMSTasks.lesson7_Strings.Task5;

public class myText {
        private StringBuilder stringBuilder;

    public myText() {
    }

    public myText(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void replacer() {
        int oopValue = "Object-oriented programming".length();
        int indexFinding = this.stringBuilder.indexOf("Object-oriented programming", oopValue + 1);
        StringBuilder replacedText = this.stringBuilder.replace(indexFinding, indexFinding + oopValue, "OOP");
        System.out.println(replacedText);
    }
}
