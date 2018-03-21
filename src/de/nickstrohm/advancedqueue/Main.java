package de.nickstrohm.advancedqueue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.enqueue();
        queue.dequeue();
        queue.enqueue();
        queue.dequeue();
        queue.enqueue();
        System.out.println(queue.write());
    }

    public static <T extends Object> String strJoin(T[] aArr, String sSep) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = aArr.length; i < il; i++) {
            if (i > 0)
                sbStr.append(sSep);
            sbStr.append(aArr[i].toString());
        }
        return sbStr.toString();
    }
}
