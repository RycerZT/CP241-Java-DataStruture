public class DoubleLinkedList implements ListADT{
    Object e;
    DoubleMyNode first,current;
    int size;
    public DoubleLinkedList(){
        List();
    }

    @Override
    public void List() {
        first=current=null;
    }

    @Override
    public void insert(Object e) throws Exception {
        DoubleMyNode p = new DoubleMyNode(e,null);
        if (isEmpty()){
            first=p;
            current=p;
        }else {
            p.setNextNode(current.getNextNode());
            current.setNextNode(p);
            p.setPreviousNode(current);
            if(p.getNextNode() != null){
                p.getNextNode().setPreviousNode(p);
            }
            current=p;
        }

    }

    @Override
    public Object retrieve() throws Exception {
       if (isEmpty()){
           throw new Exception("List is empty");
       }else{
           return current.getData();
       }
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public void delete() throws Exception {
        DoubleMyNode previous;
        if (isEmpty()){
            throw new Exception("List is empty");
        }else{
            previous=first;
            if(previous==current && current.getNextNode()==null){
                first=current=null;
            } else if (previous==current && current.getNextNode()==null) {
                first=first.getNextNode();
                current=first;

            }else {
                while (previous.getNextNode() != current){
                    previous = previous.getNextNode();
                }
                previous.setNextNode(current.getNextNode());
                current=first;
            }
        }

    }

    @Override
    public void update(Object e) throws Exception {
        if (isEmpty()){
            throw new Exception("List is empty");
        }else {
            current.setData(e);
        }

    }

    @Override
    public void findFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        }else {
            current = first;
        }
    }

    @Override
    public void findNext() throws Exception {
        if (isEmpty()){
            throw new Exception("List is empty");
        }else if (current.getNextNode() == null){
            throw new Exception("Not have a next node");
        }else {
            current = current.getNextNode();
        }
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean findKey(Object tKey) {
        return this.equals(tKey);
    }
}
