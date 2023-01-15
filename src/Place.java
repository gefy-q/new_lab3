
abstract class Place {
    protected String name;
    protected String loc;


    public String getName() {
        return name;
    }
    public String getLoc() {
        return loc;
    }

    void changes(People people){
        people.hp += 10;
    }
}

