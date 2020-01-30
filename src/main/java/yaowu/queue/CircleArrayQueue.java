package yaowu.queue;

public class CircleArrayQueue {
    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.front = 0;
        this.rear = 0;
    }

    public int size(){
        return (rear + maxSize - front) % maxSize;
    }

    public void showQueue() {
        if (isEmpty()){
            System.out.println("队列为空！");
            return;
        }
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d] = %d \n", i % maxSize, arr[i % maxSize]);
        }
    }

    public void addQueue(int num) {
        if (this.isFull()){
            System.out.println("队列已满...");
            return;
        }
        this.arr[rear] = num;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue(){
        if (this.isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        int value = this.arr[front];
        front = (front + 1) % maxSize;
        return value;

    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arr[front];
    }

}
