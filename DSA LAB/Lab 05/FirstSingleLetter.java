public class FirstSingleLetter {
    public static char firstSingleLetter(String text) {
        int n = text.length();

        for (int i = 0; i < n; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return currentChar;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String input = "ALGORITHM";
        char result = firstSingleLetter(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
