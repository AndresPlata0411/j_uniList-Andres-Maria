package com.uninorte;

public class Node {
    private int index;
    private Object data;
    private Node nextNode;
    private Node prevNode;

    public Node(int index, Object data){
        this.index = index;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public int getIndex() {
        return index;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node node){
        this.prevNode = node;
    }

    public void setNextNode(Node node){
        this.nextNode = node;
    }

    public void setData(int index, Object element) {
        
        //throw new UnsupportedOperationException("Unimplemented method 'setData'");
        this.data = element;
    }
}
