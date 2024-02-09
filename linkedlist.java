/*package whatever //do not write package name here */

import java.io.*;

class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    
    public void insertEnd(int new_data){
        Node new_node=new Node(new_data);
        if(head == null){
            head=new_node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        return;
    }
    
    public void insertFront(int new_data){
        Node new_node=new Node(new_data);
        if(head == null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    
    public void deleteFront(){
       head=head.next; 
    }
    
	public static void main (String[] args) {
		LinkedList list =new LinkedList();
		list.insertEnd(1);
		list.insertEnd(5);
		list.insertEnd(2);
		list.insertEnd(4);
		list.insertEnd(3);
		list.insertFront(10);
		list.insertFront(11);
		list.insertFront(12);
		list.print();
		list.deleteFront();
		list.deleteFront();
		System.out.println("");
		list.print();
	}
}
