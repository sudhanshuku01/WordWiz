import java.util.Scanner;
import java.util.List;

public class DictionaryApp {

    public static void main(String[] args) {

        Trie trie = new Trie();
        DictionaryLoader.loadDictionary("English_Dictionary.json", trie);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();

        if (trie.search(word)) {
            System.out.println("The word exists in the dictionary.");
        } else {
            System.out.println("The word does not exist in the dictionary.");
            System.out.println("Suggestions:");
            List<String> suggestions = trie.getSuggestions(word, 10);
            for (String suggestion : suggestions) {
                System.out.println("- " + suggestion);
            }
        }

        scanner.close();

    }
}
