package HW1.Task_5;

public class VisualParameters {
    private String color;
    private int transparency;
    private int cutting;

    public VisualParameters() {
    }

    public VisualParameters(String color, int transparency, int cutting) {
        this.color = color;
        this.transparency = transparency;
        this.cutting = cutting;
    }

    @Override
    public String toString() {
        return "VisualParameters{" +
                "color='" + color + '\'' +
                ", transparency=" + transparency +
                ", cutting=" + cutting +
                '}';
    }
}
