import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false; // If lengths don't match, not an anagram

        int[] charCount = new int[26]; // Array to store character frequencies

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++; // Increase count for character in `a`
            charCount[b.charAt(i) - 'a']--; // Decrease count for character in `b`
        }

        for (int count : charCount) {
            if (count != 0) return false; // If any count is nonzero, they are not anagrams
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        if (isAnagram(a, b)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
