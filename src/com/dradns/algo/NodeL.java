package com.dradns.algo;

public class NodeL {
    private Integer value;
    private NodeL next;

    public NodeL(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }

    public NodeL getNext(){
        return this.next;
    }

    public void setNextNode(NodeL node){
        this.next = node;
    }
}
