public class House extends Place {
    public House() {
        name = "дом";
        loc = "в доме";
    }
    @Override
    void changes(People people) {
        people.hp += 200;
        people.calmness += 100;
        people.mood = Mood.Happy;
    }
}
