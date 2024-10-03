package Strings;
class MutableString {
    private StringBuilder content;

    public MutableString(String content) {
        this.content = new StringBuilder(content);
    }

    public void setValue(String newValue) {
        this.content.replace(0, this.content.length(), newValue);
    }

    public String getValue() {
        return this.content.toString();
    }

    @Override
    public String toString() {
        return content.toString();
    }
    public static void main(String[] args) {
        MutableString ms = new MutableString("Hello");
        System.out.println(ms); // Output: Hello

        ms.setValue("Hello, Java!");
        System.out.println(ms); // Output: Hello, Java!
    }

}

