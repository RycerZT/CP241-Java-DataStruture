public class MyNode {
    private Object data;
    MyNode nextNode;
    MyNode(Object objecct){
        this(objecct, null);
    }
    MyNode(Object object,MyNode node){
        data = object;
        nextNode = node;
    }
    public  void  setNextNode(MyNode node){
        nextNode =node;
    }
    public MyNode getNextNode(){
        return nextNode;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
