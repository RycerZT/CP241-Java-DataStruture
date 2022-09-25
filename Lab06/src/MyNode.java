public class MyNode {
    private Object data;
    MyNode nextNode;

    MyNode(Object object){
        this(object, null);
    }
    MyNode(Object object, MyNode node){
        data = object;
        nextNode = node;
    }

    public void setNextNode(MyNode nextNode) {
        this.nextNode = nextNode;
    }

    public MyNode getNextNode() {
        return nextNode;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public Object getData(){
        return data;
    }
}
