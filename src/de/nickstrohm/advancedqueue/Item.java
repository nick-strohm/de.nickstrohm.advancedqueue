package de.nickstrohm.advancedqueue;

public class Item {
    private int number;
    private Item next;

    public Item(int number) {
        this.number = number;
    }

    public Item getNext() {
        return this.next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public int getNumber() {
        return number;
    }
}
