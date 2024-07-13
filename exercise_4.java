public class exercise_4 {
    // write code that converts string number to integer and vise versa
    public static void main(String[] args) {
        String a = "10";
        String b = "4";

        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);

        System.out.println(i+j);
        System.out.println(a+b);

        String x = String.valueOf(i);
        String y = String.valueOf(j);

        System.out.println(x+y);
    }
}
