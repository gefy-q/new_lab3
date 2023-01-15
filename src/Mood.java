public enum Mood {
    Happy("счастливое"),
    Sad("подавленное"),
    Frightened("испуганное"),
    Tired("уставшее");

    private String title;

    Mood(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
