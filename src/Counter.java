public class Counter {

    private String input;

    public Counter() {
    }

    public Counter(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public int countCharacters() {
        if (this.input == null || this.input.isEmpty()) return 0;
        return input.length();
    }

    public int countWords() {
        if (this.input == null || this.input.isEmpty()) return 0;
        return input.split("\\s+").length;
    }

    public int countParagraphs() {
        if (this.input == null || this.input.isEmpty()) return 0;
        return input.toString().split("\r\r").length;
    }
}
