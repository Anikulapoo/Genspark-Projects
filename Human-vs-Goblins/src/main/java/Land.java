public class Land {

    private Object hasCreature; //stores Human or Goblin

    public Land() {
    }

    @Override
    public String toString() {
        return getHasCreature() == null ? "_" : hasCreature.toString();
    }

    public Object getHasCreature() {
        return hasCreature;
    }

    public void setHasCreature(Object hasCreature) {
        this.hasCreature = hasCreature;
    }

    public void removeCreature() {
        this.hasCreature = null;
    }

}
