public class Main {
    public static void main(String[] args) {
        Pasco pasco = new Pasco();
        Luis luis = new Luis();
        System.out.println(luis.getLoc());
        luis.disappear();
        luis.look(luis);
        print(luis.getLoc());
        pasco.go(new House());
        luis.go(new Lawn());
        luis.look(pasco);
        luis.freeze();
        pasco.look(luis);
        luis.feel();
        luis.shrink(Object.HEART);
        luis.feel();
        pasco.fallDown();
        pasco.feel();
        luis.go(new Path());
        luis.go(new Forest());
        luis.pierce(Object.BRANCH);
        luis.think("Я иду в лес следом за мертвецом, я иду следом за мертвецом на кладбище домашних животных, и это не сон. Господи, миленький, это не сон. Это все происходит на самом деле.");
        luis.feel();
        luis.be();
        pasco.hit(luis);
        luis.hit(pasco);
    }
    public static void print(String message) {
        System.out.println(message);
    }
}



















