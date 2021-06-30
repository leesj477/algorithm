package me.seungjun;

//문제, 정렬된 연결 리스트에서 중복되는 모든 노드 제거하는 코드를 작성하라.
//        예) 1 -> 2 -> 2 -> 3   =>  1 -> 3


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question1 {
    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        Question1 list = new Question1();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(3));
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(5));


        list.removeDuplicates();

        list.print();

    }

    private void removeDuplicates(){
        LinkedNode current = this.head;
        LinkedNode prev = this.head;
        System.out.println("current = " + current);
        System.out.println("current.number = " + current.number);

        // 1->2->2->2->3->3->4
        //              cu
        //            next
        // prev      prev.next
        Set<Integer> numberSet = new HashSet<>();


        while(current != null){

            LinkedNode next = current;


            while(next!=null && next.number == current.number){

                next = next.next;
            }


                prev.next = next;
                current = next;

            if(current != null && current.next != null && current.number != current.next.number){
                prev= current;
            }
//
//            current.next = next;
//            current = current.next;
        }


    }

    private void removeDuplicates1() {
       LinkedNode current = this.head;
        while (current != null) {
          LinkedNode temp = current;
            while (temp != null && temp.number == current.number) {
                temp = temp.next;
            }

            current.next = temp;
            current = current.next;
        }
    }


    private void print() {
        LinkedNode nodeToPrint = this.head;
        while(nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }




}
