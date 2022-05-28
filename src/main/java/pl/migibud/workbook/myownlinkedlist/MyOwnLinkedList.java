package pl.migibud.workbook.myownlinkedlist;

import java.util.Locale;

public class MyOwnLinkedList {

    private static class Node{
        Node next;
        String inputString;
    }

    Node head;

    public void insert(String input){
        Node node = new Node();
        node.inputString = input;

        if(head==null){
            head = node;
        }
        else {
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while (node.next!=null){
            System.out.println(node.inputString);
            node=node.next;
        }
        System.out.println(node.inputString);
    }


}

class Main{

    public static void main(String[] args) {

        MyOwnLinkedList list = new MyOwnLinkedList();
        list.insert("Piotr");
        list.insert("Ania");
        list.insert("Basia");
        list.insert("Kasia");
        list.show();

    }

}
