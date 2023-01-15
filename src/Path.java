public class Path extends Place{
    public Path(){
        name = "тропинка";
        loc = "на тропинке";
    }
    @Override
    void changes(People people) {
        people.hp -= 50;
    }
}
