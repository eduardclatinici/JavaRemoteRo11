package generics.exercises;

import generics.sub.types.Carpet;

public class Application {
    public static void main(String[] args) {
        MyGenericClass<Object> myGenericClass = new MyGenericClass<>();
        myGenericClass.addElementToList("myString");
        myGenericClass.addElementToList(1);
        myGenericClass.addElementToList(1.053234);
        Carpet carpet = new Carpet("blue", "round", 76.432);
        myGenericClass.addElementToList(carpet);
        myGenericClass.printAllElements();
        System.out.println();
        System.out.println(myGenericClass.toString());
    }
}
