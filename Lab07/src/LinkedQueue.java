
public class LinkedQueue implements QueueADT{
    Object e;
    MyNode head = null;
    MyNode tail = null;
    public LinkedQueue(){
        Queue();
    }



    @Override
    public void Queue() {
        head = tail = null;
    }

    @Override
    public void enqueue(Object e) throws Exception {
        MyNode node = new MyNode(e);
        if(isEmpty()){
            head = tail = node;
        }else {
            node.setNextNode(tail.getNextNode());
            tail.setNextNode(node);
            tail = node;
        }
    }

    @Override
    public Object dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }else {
            Object e = head.getData();
            head = head.getNextNode();
            return e;
        }
    }

    @Override
    public Object front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }else{
            return head.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
    }

    @Override
    public int length() {
        MyNode p = head;
        int c=0;
        if(isEmpty()){
            return c=0;
        }else {
            if (head == tail) {
                c++;
            } else {
                while (p.getNextNode() != tail) {
                    p = p.getNextNode();
                    c++;
                }

            }
            return c;
        }
    }
}
