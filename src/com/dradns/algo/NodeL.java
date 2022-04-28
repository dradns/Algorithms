package com.dradns.algo;

public class NodeL {
    private int value;
    private NodeL next;

    public NodeL(){
        setValue(Integer.parseInt(null));
        setNextNode(null);
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int number){
        this.value = number;
    }

    public void setNextNode(NodeL node){
        next = node;
    }
}
