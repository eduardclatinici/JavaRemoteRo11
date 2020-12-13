package generics.sub.types;

public class Carpet {
    String color;
    String shape;
    Double area;

    public Carpet(String color, String shape, Double area) {
        this.color = color;
        this.shape = shape;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", area=" + area +
                '}';
    }
}
