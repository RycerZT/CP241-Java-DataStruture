public class ArrayStack implements MyStack{
    private int total;
    private Object s[];
    int top;

    public ArrayStack(){
        MyStack();
    }

    @Override
    public void MyStack() {
        top = -1;
        total = 50;
        s = new Object[total];
    }

    @Override
    public void push(Object e) throws Exception {
        if (full()){
            throw new Exception("Stack Overflow");
        }
        top = top +1;
        s[top] = e;
    }




    @Override
    public Object pop() throws Exception {
        if(empty()){
            throw new Exception("Stack empty");
        }
        Object object = s[top];
        top = top -1;

        return object;
    }

    @Override
    public Object top() throws Exception {
        if (empty()){
            throw new Exception("Stack empty");
        }

        return s[top];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public boolean full() {
        return top == total -1;
    }

    @Override
    public void clear() {
        top = top-1;
    }
}
