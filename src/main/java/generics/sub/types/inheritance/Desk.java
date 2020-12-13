package generics.sub.types.inheritance;

public class Desk implements Item{

    private final String name;

    public Desk(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
