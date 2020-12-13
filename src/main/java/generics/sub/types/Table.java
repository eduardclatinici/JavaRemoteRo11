package generics.sub.types;

public class Table {
    double length;
    double width;

    public Table(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computeArea(){
        return length * width;
    }

    public void printTableProperties(){
        System.out.println("length: "+ length + ", width:"+ width+", area:" + computeArea());
    }
}
