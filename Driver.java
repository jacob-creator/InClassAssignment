public class Driver {

    public static void main(String[] args) {
        char[] lowerCase = new char[27];
        char[] upperCase = new char[27];
        int i = 1;
        int c = 97;
        while (c <= 122) {
            lowerCase[i] = (char) c;
            upperCase[i] = (char) (c - 32);
            c++;
            i++;
        }

        int[] numbers = new int[27];
        StringBuilder output = new StringBuilder();
        i = 1;
        while (i < 27) {
            numbers[i] = i;
            output.append("| ").append(String.format("%-2s", numbers[i])).append(" ").append(lowerCase[i]).append(" ").append(upperCase[i]).append(" |\n");
            i++;
        }
        System.out.print(output);
    }
}