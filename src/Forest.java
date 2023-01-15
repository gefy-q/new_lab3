public class Forest extends Place{
    public Forest(){
        name = "лес";
        loc = "в лесу";
    }
    @Override
    void changes(People people) {
        people.calmness -= 100;
        if (people.hp < 400) {
            people.mood = Mood.Tired;
        }
        if (people.calmness < 500) {
            people.mood = Mood.Frightened;
        }
    }
}
