package generics;

import generics.sub.types.inheritance.Item;

public class InterfaceRoom {
    private Item item;

    public InterfaceRoom(Item item) {
        this.item = item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void printItem() {
        System.out.println(item.getName());
    }
}
