public class StringCompression {

    public static String compressString(String text) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int index = 0; index < text.length(); index++) {

            if (index < text.length() - 1 && text.charAt(index) == text.charAt(index + 1)) {
                count++;
            } else {
                result.append(text.charAt(index)).append(count);
                count = 1;
            }
        }

    
}
