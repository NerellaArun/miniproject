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

    // Optional: for manual testing
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Is Palindrome: " + isPalindrome(input));
        System.out.println("Reversed: " + reverseString(input));
        System.out.println(findVowels(input));
    }
}
