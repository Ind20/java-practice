package problems;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}
