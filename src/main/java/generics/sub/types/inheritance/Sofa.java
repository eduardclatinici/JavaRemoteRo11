package generics.sub.types.inheritance;

public class Sofa implements Item{

    private final String name;

    public Sofa(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
