public class MethodOverloading {
    public static int add(int x, int y) {
        System.out.println("First add method include two integer parameters");
        return x*y;
    }

    public static void add(double x, double y) {
        System.out.println("second add method include two double parameters");
    }

    public static void add(int x, int y, int z) {
        System.out.println("third add method include three integer parameters");
    }

    public static void main(String[] args) {
        add(3,6);
        add(5.0, 9.0);
        add(3,7,8);
        System.out.println(add(4,6));
    }
}
