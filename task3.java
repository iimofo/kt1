import java.util.Arrays;
public class Task3 {
    public static String getCommonPrefix(String[] array) {
        if (array == null || array.length == 0) {
            return "";
        }

        Arrays.sort(array); // Sort the array lexically
        String first = array[0];
        String last = array[array.length - 1];
        int minLength = Math.min(first.length(), last.length());
        StringBuilder prefix = new StringBuilder();

        // Iterate through characters of the first and last strings
        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) == last.charAt(i)) {
                prefix.append(first.charAt(i)); // Append common characters to the prefix
            } else {
                break; // Stop when characters don't match
            }
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        System.out.print(getCommonPrefix(new String[] {"flower", "flow", "flight"}));
    }
}
