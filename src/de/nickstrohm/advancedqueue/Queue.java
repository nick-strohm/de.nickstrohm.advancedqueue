package de.nickstrohm.advancedqueue;

public class Queue {
    private Item head;

    public Queue() {
    }

    public Item getHead() {
        return this.head; // Gibt das Element head zurück
    }

    public Item getTail() {         // Holt sich das Element am Ende der Schlange.
        Item next = this.getHead(); // Holt sich das Element am Kopf der Schlange.

        if (next == null) {
            return null; // Wenn das Objekt null ist, null zurückgeben.
        }

        while(next.getNext() != null) { // Solange das nächste Element von next nicht null ist.
            next = next.getNext();      // Next wird gleich dem nächsten Element gesetzt.
        }

        return next; // Gibt das letzte Element der Schlange zurück.
    }

    public void enqueue() {
        if (this.getHead() == null) {       // Wenn der Kopf der Schlange noch nicht gesetzt wurde.
            this.head = new Item(1);        // Setze den Kopf der Schlange mit neuem Element.
            return;                         // Methode verlassen.
        }

        Item item = this.getTail();         // Holt sich das letzte Element der Schlange.
        item.setNext(new Item(item.getNumber() + 1));   // Fügt ein neues Element ans Ende der Schlange hinzu.
    }

    public Item dequeue() {
        Item head = this.getHead(); // Holt sich den Kopf der Schlange
        this.head = head.getNext(); // Setzt den Kopf der Schlange auf das nächste Element.
        return head;                // Gibt den letzten Kopf zurück
    }

    public String write() {
        Item next = this.getHead(); // Holt sich den Kopf der Schlange

        if (next == null) {         // Wenn next leer ist und damit die Schlange nicht existiert
            return "";              // Leerer String zurück geben
        }

        StringBuilder out = new StringBuilder("" + next.getNumber()); // Erstellt ein neuen StringBuilder
                                                                      // mit der ersten Nummer der Schlange

        while(next.getNext() != null) {     // Solange nächstes Element von next nicht null ist.
            next = next.getNext();          // Setze next auf nächstes Element.

            out.append(", ").append(next.getNumber());  // Hänge ", Nummer" an StringBuilder an
        }

        return out.toString();  // Gebe Wert von StringBuilder zurück.
    }
}
