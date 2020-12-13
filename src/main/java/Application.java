import generics.GenericRoom;
import generics.InterfaceRoom;
import generics.sub.types.Carpet;
import generics.sub.types.Table;
import generics.sub.types.inheritance.Desk;
import generics.sub.types.inheritance.Item;
import generics.sub.types.inheritance.Sofa;

public class Application {
    public static void main(String[] args) {
        Desk desk = new Desk("my desk");
        Sofa sofa = new Sofa("my sofa");

        InterfaceRoom interfaceRoom = new InterfaceRoom(desk);
        interfaceRoom.printItem();
        interfaceRoom.setItem(sofa);
        interfaceRoom.printItem();

        System.out.println();

        GenericRoom<Item> genericRoom = new GenericRoom<>(desk);
        System.out.println(genericRoom.getItem().getName());
        genericRoom.setItem(sofa);
        System.out.println(genericRoom.getItem().getName());

        GenericRoom<Desk> deskGenericRoom = new GenericRoom<>(desk);
        System.out.println(deskGenericRoom.getItem().getName());

        System.out.println();

        GenericRoom<String> myStringGenericRoom = new GenericRoom<>("this item is actually my string");
        System.out.println(myStringGenericRoom.getItem());

        System.out.println();

        GenericRoom<Integer> myIntegerGenericRoom = new GenericRoom<>(24);
        System.out.println(myIntegerGenericRoom.getItem());

        System.out.println();

        GenericRoom<Carpet> carpetGenericRoom = new GenericRoom<>(new Carpet("blue", "round", 77.9));
        GenericRoom<Table> tableGenericRoom = new GenericRoom<>(new Table(2, 6.78));

        System.out.println(carpetGenericRoom.getItem().toString());
        tableGenericRoom.getItem().printTableProperties();

    }
}
