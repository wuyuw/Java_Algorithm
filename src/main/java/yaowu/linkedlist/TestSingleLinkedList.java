package yaowu.linkedlist;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        SingleLinkedNode node1 = new SingleLinkedNode(1, "宋江", "及时雨");
        SingleLinkedNode node2 = new SingleLinkedNode(2, "吴用", "智多星");
        SingleLinkedNode node3 = new SingleLinkedNode(2, "林冲", "豹子头");
        SingleLinkedNode node4 = new SingleLinkedNode(2, "鲁智深", "花和尚");

        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);

        // 遍历
        list.list();

    }
}
