public class DuplicateChar {
    public static void main(String[] args) {
        String str = "ravindra";

        // Count occurrences of each character in the string
        
        int[] charCount = new int[255]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Print duplicate characters along with their counts
        System.out.println("Duplicate characters in the string \"" + str + "\":");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " - " + charCount[i] + " times");
            }
        }
    }
}