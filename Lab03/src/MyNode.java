public class MyNode {
    private Student data;
    private MyNode nextNode;
    MyNode(Student object){
        this(object, null);
    }
    MyNode(Student object, MyNode node){
        data = object;
        nextNode = node;
    }
    public void setNextNode(MyNode node){
        nextNode = node;
    }
    public Student getData(){
        return  data;
    }
    public MyNode getNextNode(){
        return nextNode;
    }
}
