public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.addText("Abdulaziz Abdulloh");
        editor.newLine();
        editor.upperCase();
        editor.lowerCase();
        editor.delete();
        editor.clear();
        editor.show();
        editor.showHistory();
    }
}
class Editor {
    private String[] words;
    private final StringBuilder history;
    private int index;

    public Editor() {
        words = new String[10];
        history = new StringBuilder();
    }

    public void addText(String str) {
        addToWords(str);
        addToWords("addText() ");
    }

    public void newLine() {
        addToWords("\n");
        addToHistory("newLine()");
    }
    public void upperCase() {
        int lastIndex = index-1;
        words[lastIndex] = words[lastIndex].toUpperCase();
        addToHistory("upperCase() ");
    }
    public void lowerCase() {
        int lastIndex = index-1;
        words[lastIndex]=words[lastIndex].toLowerCase();
        addToHistory("lowerCase()");
    }
    public void delete() {
        words[--index]=null;
        addToHistory("delete()");
    }
    public void clear() {
        words = new String[10];
        addToHistory("clear()");
    }
    public void show() {
        for (int i = 0; i < index; i++) {
            System.out.println(words[i] + " ");
        }
        addToHistory("show()");
    }
    public void showHistory() {
        addToHistory("showHistory()");
        System.out.println("\n"+history);
    }
    private void addToWords(String str) {
        if (index == words.length) resize();
        words[index++]=str;
    }
    private void addToHistory(String str) {
        history.append(str).append("\n");
    }
    private void resize() {
        int size = words.length+(words.length>>1);
        String[] newArray = new String[size];

        for (int i = 0; i < words.length; i++) {
            newArray[i]=words[i];
        }
        words = newArray;
    }

}