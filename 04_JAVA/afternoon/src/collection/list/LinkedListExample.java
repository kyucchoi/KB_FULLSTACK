package collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // LinkedList 가 제일 유리한 케이스
        linkedList.addFirst(0);

        // 둘이 동일한 케이스
        linkedList.addLast(6);
        linkedList.add(3, 22);

        System.out.println("linkedList = " + linkedList);

        int firstElement = linkedList.getFirst();
        int lastElement = linkedList.getLast();
        int midElement = linkedList.get(4);
    }
}
