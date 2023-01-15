public class Bed extends Place{
    public Bed(){
        name = "кровать";
        loc = "в кровати";
    }

    @Override
    void changes(People people) {
        people.hp += 500;
        people.calmness += 300;
        people.mood = Mood.Happy;
    }
}
