package yaowu.linkedlist;

public class SingleLinkedNode {
    public int no;
    public String name;
    public String nickName;
    public SingleLinkedNode next;

    public SingleLinkedNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "SingleLinkedNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
