public class assigning_variables {
    public static void main(String[] args) {
        int x;
        double y;
        y = 2+3; // int value can be assigned as double. Java promotes the integer into double
        //x = 3.4 * 2.9; // double value cannot be assigned as int
        x = (int) (3.4 * 2.9); // casting double value to int by truncating the decimal value
        System.out.println(x);

        int a, b, c;
        // assignment variable is done from right to left

        a = b = c = 2*5 + 4; // means : a = (b = (c = 2*5 +4));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
