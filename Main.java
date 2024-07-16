public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        // System.out.println(sll.head.value);
        sll.insertLinkedList(6, 0);
        sll.insertLinkedList(7, 2);
        sll.insertLinkedList(10, 9);
        System.out.println(sll.head.value);
        System.out.println(sll.head.next.value);
        System.out.println(sll.head.next.next.value);
        System.out.println(sll.head.next.next.next.value);
    }
    
}
