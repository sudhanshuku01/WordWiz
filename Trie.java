import java.util.ArrayList;
import java.util.List;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node = node.getChildren().computeIfAbsent(c, k -> new TrieNode());
        }
        node.setEndOfWord(true);
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node = node.getChildren().get(c);
            if (node == null) {
                return false;
            }
        }
        return node.isEndOfWord();
    }

    // Get suggestions for words that start with the given prefix
    public List<String> getSuggestions(String prefix, int maxSuggestions) {
        List<String> suggestions = new ArrayList<>();
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            node = node.getChildren().get(c);
            if (node == null) {
                return suggestions; // No suggestions if prefix not found
            }
        }
        collectSuggestions(node, prefix, suggestions, maxSuggestions);
        return suggestions;
    }

    // Helper method to collect words from a given Trie node
    private void collectSuggestions(TrieNode node, String prefix, List<String> suggestions, int maxSuggestions) {
        if (suggestions.size() >= maxSuggestions) {
            return;
        }
        if (node.isEndOfWord()) {
            suggestions.add(prefix);
        }
        for (char c : node.getChildren().keySet()) {
            collectSuggestions(node.getChildren().get(c), prefix + c, suggestions, maxSuggestions);
        }
    }
}
