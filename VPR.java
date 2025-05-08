public class VPR {

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String normalized = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }

    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static String findVowels(String str) {
        if (str == null) return "Vowels:  (Count: 0)";
        StringBuilder vowels = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowels.append(ch);
            }
        }
        return "Vowels: " + vowels + " (Count: " + vowels.length() + ")";
    }

    // ✅ Optional: manual testing
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome(input));
        System.out.println("Reversed: " + reverseString(input));
        System.out.println(findVowels(input));
        
        // Run basic internal tests (JUnit-style)
        runTests();
    }

    // ✅ Internal tests without needing JUnit
    public static void runTests() {
        System.out.println("\nRunning Tests...");

        assert isPalindrome("Madam");
        assert isPalindrome("A man, a plan, a canal, Panama");
        assert !isPalindrome("Hello");

        assert reverseString("Hello").equals("olleH");
        assert reverseString("123").equals("321");

        assert findVowels("Hello").equals("Vowels: eo (Count: 2)");
        assert findVowels("Rhythm").equals("Vowels:  (Count: 0)");

        System.out.println("All tests passed.");
    }
}
