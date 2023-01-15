public class Hill extends Place{
    public Hill(){
        name = "холм";
        loc = "на холме";
    }
    @Override
    void changes(People people) {
        people.hp += 50;
    }
}
