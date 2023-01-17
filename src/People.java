import java.util.Random;

abstract class People {
    protected String name;
    protected Mood mood = Mood.Happy;

    protected int hp = 1000;
    protected int calmness = 1000;
    protected Place loc = new Nowhere();

    public String getName() {
        return name;
    }

    public String getLoc() {
        return name + " находится сейчас " + loc.getLoc();
    }

    public Mood getMood() {
        return mood;
    }

    public int getCalmness() {
        return calmness;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Персонаж " + this.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }


    protected int rand() {
        Random random = new Random();
        return random.nextInt(2);
    }

}
