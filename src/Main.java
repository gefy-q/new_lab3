public class Main {
    public static void main(String[] args) {
        Pasco pasco = new Pasco();
        Luis luis = new Luis();
        House house = new House();
        Nowhere nowhere = new Nowhere();
        System.out.println(luis.getLoc());
        luis.disappear();
        print(luis.getLoc());
    }
    public static void print(String message) {
        System.out.println(message);
    }
}
