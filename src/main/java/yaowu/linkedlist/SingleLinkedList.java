package yaowu.linkedlist;

public class SingleLinkedList {
    private SingleLinkedNode head = new SingleLinkedNode(0, "", "");

    public void add(SingleLinkedNode node) {
        SingleLinkedNode temp = head;
        while(true) {
            if (temp.next == null) {
                temp.next = node;
                break;
            }
            temp = temp.next;
        }
    }

    public void list(){
        SingleLinkedNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            temp = temp.next;
        }
    }


}
