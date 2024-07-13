public class strings {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.indexOf("o"));
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // write a code that separate each letter from a word
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        String n = "Hello World";
        System.out.println(n.substring(5));
        System.out.println(n.substring(4,8));
    }
}
