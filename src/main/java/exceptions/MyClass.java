package exceptions;

import lombok.Data;

import java.util.List;

@Data
public class MyClass implements MyInterface {

    int myInt;
    String myString;
    Double myDouble;

    @Override
    public void doSomething() {
        System.out.println("do Something");
    }

    @SuppressWarnings("unchecked")
    public static void addToList(List list, String string) {
        list.add(string);
    }
}
