package pl.migibud.workbook.myownlinkedlist;

import java.util.LinkedList;

public class MyOwnLinkedList {

    public static class Node{
        private Node next;
        private String inputString;

        public Node(String inputString,Node next) {
            this.inputString = inputString;
            this.next = next;
        }

        public String getInputString() {
            return inputString;
        }

        public Node getNext() {
            return next;
        }
    }

    Node first;
    Node last;

    public MyOwnLinkedList() {
        first = new Node(null,null);
        last=first;
    }

    public boolean add(String input){
        last.next=new Node(input,null);
        last=last.next;
        return true;
    }

    public boolean contains(String text){
        Node n = first.next;
        while (n!=null){
            if (n.inputString.equals(text)){
                return true;
            }
            n=n.next;
        }
        return false;
    }

    public void insert(String input){
        Node node = new Node(input,null);

        if(last ==null){
            last = node;
        }
        else {
            Node n = last;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node n = first.next;
        while (n!=null){
            System.out.println(n.inputString);
            n=n.next;
        }
    }


}

class Main{

    public static void main(String[] args) {

        MyOwnLinkedList list = new MyOwnLinkedList();
        list.add("Piotr");
        list.add("Ania");
        list.add("Basia");
        list.add("Kasia");
        boolean piotr = list.contains("Piotr");
        System.out.println(piotr);
        list.show();
/*        System.out.println(list.last.getInputString());
        System.out.println(list.first.getNext().getInputString());*/

    }

}
