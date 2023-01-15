public interface HumanCondition {

    default String CalmnessCondition(int calmness){
        if (calmness > 900) {
            return "Cпокойствие";
        }
        if (calmness > 700) {
            return "Легкое беспокойство";
        }
        if (calmness > 500) {
            return "Беспокойство";
        }
        if (calmness > 200) {
            return "Испуг";
        }
        else {
            return "Паническую аттаку";
        }
    }

    public String HpCondition();
    public String MoodCondition();
}
