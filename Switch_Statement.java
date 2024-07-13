public class Switch_Statement {
    public static void main(String[] args) {
        int i = 6;
        switch (i){
            case 1: // case 1: means i = 1, 1 == 6 which is false, so it won't execute the body
                System.out.println("code 1");
                break;

            case 5: // case 5: means i = 5, 5 == 6 which is also false, so it won't execute as well
                System.out.println("code 5");
                break;

            default: // default means if all conditions get false and none of then won't get true, then the default block will get executed
                System.out.println("default condition");
        }
    }
}
