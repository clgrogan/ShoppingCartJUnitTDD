package src.main.models;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

    public void addItem(Item item) {
        this.items.add(new Item(item));
    }

    public boolean contains(Item item) {
        return this.items.contains(item);
    }

}
