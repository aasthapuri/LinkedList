package com.company;

public class Linkedlist{
    static Node head;
    static int size;
    static class Node {
        public Node next;
        int data;
    }
    public static void add(int data){
        Node node = new Node();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            Node input=head;
            if(input.next!=null){
                input=input.next;
            }
            input.next=node;
        }
        size++;
    }
    public static void addatStart(int data){
        Node node = new Node();
        node.data=data;
        node.next=head;
        head=node;
        size++;
    }
    public static void removefromStart(){
        if(isEmpty())
            return;
        head=head.next;
        size--;
    }
    private static boolean isEmpty() {
        return head==null;
    }
    public static void at(int index,int data){
        if(index==0){
            add(data);
        }
        Node node = new Node();
        node.data=data;
        Node input=head;
        for(int i=0;i<index-1;i++){
            input=input.next;
        }
        node.next=input.next;
        input.next=node;
    }
    public static void delete(int index){
       Node delete=head;
       Node n;
       if(index==0){
           head=head.next;
       }
       else {
           delete=delete.next;
       }
       n=delete.next;
       delete.next=n.next;
    }
    public void show(){
        Node input = head;
        while(input!=null){
            System.out.println(input.data);
            input=input.next;
        }
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        addatStart(1);
        list.add(3);
        list.add(4);
        list.at(1,2);
        list.at(4,5);
        list.show();
        System.out.println("Befor removal: "+list.getSize());
        removefromStart();
        System.out.println("After first removal: "+list.getSize());
        list.show();
        removefromStart();
        System.out.println("After second removal: "+list.getSize());
        list.show();
    }
}

