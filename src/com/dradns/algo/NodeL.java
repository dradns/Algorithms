package com.dradns.algo;

public class NodeL {
    private Integer value = null;
    private NodeL next;

    public Integer getValue(){
        return this.value;
    }

    public void setValue(int number){
        this.value = number;
    }

    public void setNextNode(NodeL node){
        this.next = node;
    }
}
