public class LinkedStack implements MyStack{
    Object e;
    MyNode top;

    public LinkedStack(){
        MyStack();
    }


    @Override
    public void MyStack() {
        top = null;
    }

    @Override
    public void push(Object e) throws Exception {
        if(full()){
            throw new Exception("StackOverflow");
        }
        MyNode newNode = new MyNode(e);
        newNode.setNextNode(top);
        top = newNode;
    }

    @Override
    public Object pop() throws Exception {
        if (empty()){
            throw  new Exception("Stack empty");
        }
        Object object = top.getData();
        top = top.getNextNode();
        return object;
    }

    @Override
    public Object top() throws Exception {
        if (empty()){
            throw new Exception("Stack empty");
        }
        return top.getData();
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public void clear() {
        top = null;

    }
}
