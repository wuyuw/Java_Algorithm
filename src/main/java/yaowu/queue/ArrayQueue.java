package yaowu.queue;

public class ArrayQueue {
    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    public void showQueue() {
        if (isEmpty()){
            System.out.println("队列为空！");
            return;
        }
        for (int i = 0; i < this.arr.length; i++) {
            System.out.printf("arr[%d] = %d \n", i, arr[i]);
        }
    }

    public void addQueue(int num) {
        if (this.isFull()){
            System.out.println("队列已满...");
        }
        rear++;
        this.arr[rear] = num;
    }

    public int getQueue(){
        if (this.isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        front++;
        return this.arr[front];
    }

    public boolean isFull() {
        return this.rear == this.maxSize - 1;
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arr[front + 1];
    }

}
