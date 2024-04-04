
import java.util.HashMap;

public class WordCount{
    public static void main(String[] args) {
        // Your input string
        String str = "Hello, I am Ravindra Kamble from Pune. I would like to play chess. Pune is a good city. ";

        // Remove Starting and ending whitespace (spaces)
        str = str.trim();
        System.out.println(str);
        
        // Initialize a HashMap to store word frequencies.
        // storing data in (Key, Value) pairs accessible by an index of another type, like an Integer. 
        // Each key corresponds to a value, allowing insertion of duplicate keys to replace existing elements.
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Count the number of occurrences of each word
        for (String word : words) {
            // Remove punctuation marks from the word
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Increment the count of the word in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        System.out.println("Word frequencies:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }

        // Print the total number of words
        System.out.println("Total number of words: " + words.length);
    }
}