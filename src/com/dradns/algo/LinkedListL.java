package com.dradns.algo;

import java.util.Objects;

public class LinkedListL {
    private NodeL first;
    private NodeL last;

    public LinkedListL(){
    }

    public void addFirst(int number){
        //если ноды нет - создать ноду И выставить значение
        if (Objects.isNull(first)){
            first = new NodeL();
            first.setValue(number);
        }//если нода есть, но значение нулл, выставить значение на требуемое
        else if (first.getValue() == null){
            first.setValue(number);
        }//если и нода есть и значение в ней есть тогда:
        //1. создать новую ноду
        //2. выставить в ней значение на требуемое
        //3. выставить в ней некcт на старую ноду
        //4. выставить новую как фёрст
        else {
            NodeL temp = new NodeL();
            temp.setValue(number);
            temp.setNextNode(first);
            first = temp;
        }
    }

    public void addLast(){

    }

    public void deleteFirst(){

    }

    public void deleteLast(){

    }

    public void contains(){

    }

    public void indexOf(){

    }
}
