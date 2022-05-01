package com.dradns.algo;

import java.util.Objects;

public class LinkedListL {
    private NodeL first;
    private NodeL last;

    public LinkedListL(){
    }

    public void addFirst(int number){
        if (Objects.isNull(first)){
            first = new NodeL(number);
            last = first;
        }else{
            NodeL temp = new NodeL(number);
            temp.setNextNode(first);
            first = temp;
        }
    }

    public void addLast(int number){
        if (Objects.isNull(first)){
            first = new NodeL(number);
            last = first;
        }else{
            NodeL temp = new NodeL(number);
            last.setNextNode(temp);
            last = temp;
        }
    }

    public int deleteFirst(){
        if (Objects.isNull(first)){
            return 0;
        }else{
            first = first.getNext();
            return 0;
        }
    }

    public int deleteLast(){
        if (Objects.isNull(first)){
            return 0;
        }else if (first == last){
            first = null;
            return 0;
        }
        else{
            NodeL temp = first;
            while (temp.getNext() != null){
                if (temp.getNext() == last){
                    last = temp;
                    last.setNextNode(null);
                    break;
                }
                temp = temp.getNext();
            }
            return 0;
        }
    }

    public boolean contains(int number){
        if (Objects.isNull(first)){
            return false;
        }else{
            NodeL temp = first;
            while (temp != null){
                if (temp.getValue() == number)
                    return true;
                temp = temp.getNext();
            }
            return false;
        }
    }

    public int indexOf(int number){
        if (Objects.isNull(first)){
            return -1;
        }else{
            int counter = 1;
            NodeL temp = first;
            while (temp != null){
                if (number == temp.getValue())
                    return counter;
                counter++;
                temp = temp.getNext();
            }
            return -1;
        }
    }

    public void printContent(){
        int counter = 0;
        System.out.println(Objects.toString(first) + " its FIRST");
        System.out.println(Objects.toString(last) + " its LAST");
        System.out.println(counter + " its COUNTER");
        System.out.println("===========");

        NodeL temp = first;

        while (temp != null){
            counter++;
            System.out.println(first.getValue() + " its FIRST VALUE");
            System.out.println(last.getValue() + " its LAST VALUE");
            System.out.println(temp.getValue() + " its TEMP VALUE");
            System.out.println(counter + " its COUNTER");
            temp = temp.getNext();
        }
    }

    public void printOnlyValues(){
        int counter = 0;
        NodeL temp = first;

        while (temp != null){
            counter++;
            System.out.println(temp.getValue() + " its TEMP VALUE");
            temp = temp.getNext();
        }
        System.out.println("\n");
        System.out.println(counter + " its TOTAL COUNTER");
    }
}
