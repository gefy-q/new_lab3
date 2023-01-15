public enum Object {
    BRANCH("ветка"),
    HEART("сердце"),
    BONE("кость"),
    NEEDLE("иглы"),
    GOUND("земля");

    private String title;

    Object(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
