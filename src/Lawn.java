public class Lawn extends Place{
    public Lawn(){
        name = "лужайка";
        loc = "на лужайке";
    }
    @Override
    void changes(People people) {
        people.hp += 50;
    }
}
