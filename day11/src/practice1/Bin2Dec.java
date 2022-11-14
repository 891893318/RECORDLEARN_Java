package practice1;

/**
 * @author 89189
 */
public class Bin2Dec {
    public static int parseBinary(String binaryString) {
        int value = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch == '0' || ch == '1') {
                value = value * 2 + binaryString.charAt(i) - '0';
            } else {
                throw new NumberFormatException("Illegal character: " + ch);
            }
        }

        return value;
    }
}
