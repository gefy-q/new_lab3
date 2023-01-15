public class Pasco extends People implements HumanActions, HumanCondition, ObjectActions{
    public Pasco(){
        name = "Паскоу";
        System.out.println("Персонаж " + name + " создан.");
    }

    @Override
    public void disappear() {
        loc = new Nowhere();
        System.out.println("Персонаж " + name + " исчез.");
    }

    @Override
    public void look(People people) {
        if (equals(people)){
            System.out.println(name + " не может оглянулся на себя");
        }
        else {
            System.out.println(name + " оглянулся на " + people);
            people.calmness -= 200;
            System.out.println(people + " чувствовал " + people.getCalmness());
        }
    }

    @Override
    public void stay() {
        System.out.println(name + " стоял " + loc);
    }

    @Override
    public void go(Place place) {
        System.out.println(name + " переместился и теперь находится " + place);
        loc = place;
        hp -= 100;
    }

    @Override
    public void freeze() {
        System.out.println(name + " замер " + loc.loc);
        calmness += 50;
    }

    @Override
    public void feel() {

    }

    @Override
    public void think(String thought) {
        System.out.println(name + " подумал, что " + thought);
    }

    @Override
    public void be() {
        System.out.println(name + " сейчас находится " + loc.loc);
    }

    @Override
    public void wince() {
        System.out.println(name + " поморщился.");
        mood = Mood.Tired;
        calmness += 50;
        hp -= 50;
    }

    @Override
    public String HpCondition() {
        if (hp > 900) {
            return " полон сил.";
        } else if (hp > 600) {
            return " все еще бодр.";
        } else if (hp > 400) {
            return " немного устал.";
        } else if (hp > 200) {
            return " устал.";
        } else if (hp > 100) {
            return " при смерти.";
        } else {
            hp += 500;
            return " то, что мертво умереть не может.хехе.";
        }
    }

    @Override
    public String MoodCondition() {
        return "полумертвое и " + mood.getTitle();
    }

    @Override
    public void shrink(Object object) {
        System.out.println(object.getTitle() + " " + name + " сжалось от ужаса.");
        mood = Mood.Frightened;
        calmness -= 100;
    }

    @Override
    public void stickOut(Object object) {
        System.out.println(object.getTitle() + " торчит наружу из " + name);
        hp -= 200;
        mood = Mood.Sad;
    }

    @Override
    public void pierce(Object object) {
        System.out.println(object.getTitle() + " вонзилась в плечо " + name + ".");
        hp -= 300;
        mood = Mood.Sad;
        calmness -= 200;
    }

    @Override
    public void stick(Object object) {
        System.out.println(object.getTitle() + " липла к " + name + ".");
        hp -= 100;
        mood = Mood.Sad;
        calmness -= 100;
    }
}
