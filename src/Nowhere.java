public class Nowhere extends Place {
    public Nowhere() {
        name = "нигде";
        loc = "неизвестно где";
    }

    @Override
    void changes(People people) {
        people.hp += 50;
    }
}
