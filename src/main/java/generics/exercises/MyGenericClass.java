package generics.exercises;

import java.util.ArrayList;
import java.util.List;

public class MyGenericClass<T extends Object> {
    List<T> myList;

    public MyGenericClass() {
        this.myList = new ArrayList<>();
    }

    public void addElementToList(T element) {
        myList.add(element);
    }

    public void printAllElements() {
        for (T t : myList) {
            System.out.println(t);
        }
        //myList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "MyGenericClass{" +
                "myList=" + myList +
                '}';
    }
}
