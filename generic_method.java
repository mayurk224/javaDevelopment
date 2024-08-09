public class generic_method {

//    public static void welcome(String name){
//        System.out.println("Welcome "+name);
//    }
//    public static void welcome(int i){
//        System.out.println("Welcome "+i);
//    }
//    public static void welcome(long l){
//        System.out.println("Welcome "+l);
//    }
//    public static void welcome(double d){
//        System.out.println("Welcome "+d);
//    }
//    public static void welcome(short sh){
//        System.out.println("Welcome "+sh);
//    }
//    public static void welcome(char ch){
//        System.out.println("Welcome "+ch);
//    }
//    public static void welcome(boolean b){
//        System.out.println("Welcome "+b);
//    }

    // to overcome this code redundancy, we will use generic
    // with this <T> type generic now you can pass any type of data with this method
    public static <T> void welcome(T t){
        System.out.println("welcome "+t);
    }

    public static void main(String[] args) {
        welcome("Master");
        welcome(12);
        welcome(true);
    }
}
