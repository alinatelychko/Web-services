package HW1.Task_5;

public class Gem {
    private String name;
    private String preciousness;
    private String origin;
    private VisualParameters visualParameters;
    private double value;

    public Gem() {
    }

    public Gem(String name, String preciousness, String origin, VisualParameters visualParameters, double value) {
        this.name = name;
        this.preciousness = preciousness;
        this.origin = origin;
        this.visualParameters = visualParameters;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Gem{" +
                "name='" + name + '\'' +
                ", preciousness='" + preciousness + '\'' +
                ", origin='" + origin + '\'' +
                ", visualParameters=" + visualParameters +
                ", value=" + value +
                '}';
    }
}
