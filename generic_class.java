public class generic_class {
    // creating our own generic class
    private static class generic<T>{
        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }

    public static void main(String[] args) {
        generic<String> gen = new generic<>();

        gen.setT("Hello");

        System.out.println(gen.getT());
    }
}
