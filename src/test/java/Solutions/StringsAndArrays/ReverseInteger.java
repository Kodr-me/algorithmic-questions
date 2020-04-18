package Solutions.StringsAndArrays;

public class ReverseInteger {
    public int reverse(int x) {

        String string = String.valueOf(x);

        if (string.length() == 1) return Integer.parseInt(string);

        StringBuilder sb = new StringBuilder();

        boolean zeroesEnded = false;

        for (int i = string.length() - 1; i >= 0; i--) {

            char c = string.charAt(i);
            // if we encounter a - in the start of the num we append at the start of sb
            if (c == '-' && i == 0) {
                sb.insert(0, c);
                continue;
            } else if (c == '0' && !zeroesEnded) {
                continue; // not append zeroes at the tail
            } else if (c != '0') {
                zeroesEnded = true;
            }

            sb.append(c);
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e ) {
            return 0;
        }
    }
}
