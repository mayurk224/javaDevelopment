public class method_overloading {
    // what is method overloading?
    // method overloading means method can have the same name / return type but have different number/type of parameters,
    // or have the same name but different return type and different parameter

    public static int add(int x, int y){
        return x + y;
    }

    public static int add(int x, int y, int z){
        return x + y + z;
    }

    public static double add(double x, double y){
        return x + y;
    }

    public static double add(int x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(5.5,4.8));
        System.out.println(add(5,3));
        System.out.println(add(5,9,7));
        System.out.println(add(8,9.8));
//        System.out.println(add(8,6.8,9.5));
    }
}
