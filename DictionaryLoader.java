import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DictionaryLoader {
    public static void loadDictionary(String filePath, Trie trie) {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            for (Object key : jsonObject.keySet()) {
                String word = (String) key;
                trie.insert(word.toLowerCase());
            }
            System.out.println("Dictionary loaded successfully.");
        } catch (IOException | ParseException e) {
            System.out.println("Error loading dictionary: " + e.getMessage());
        }
    }
}
