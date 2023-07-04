package stringPrograms;

public class ReverseWords {

	public static void main(String[] args) {
        String sentence = "Hello, world! How are you?";
        String reversed = reverseWords(sentence);
        System.out.println(reversed);
    }

    public static String reverseWords(String sentence) {
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split("\\s+");
        // Reverse the order of the words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }
}
