package generics;

public class GenericRoom<T> {

    private T item;

    public GenericRoom(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}
