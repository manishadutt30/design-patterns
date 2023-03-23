import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Set.*;

public class Main {

    Node head;
    private int size;

    public Main(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add operation in LinkedList - first/last
    public void addFirst(String data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = newnode;
            return ;
        }

        newnode.next = head;
        head = newnode;
    }

    //addLast
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode = newNode;
        size++;
    }

    //print LinkedList
    public void printList(){
        if (head == null){
            System.out.println("LinkedList is null");
        }

        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("LinkedList is null");
            size--;
            return;
        }

        head = head.next;
    }

    //deleteLast
    public void deleteLast(){
        if(head == null){
            System.out.println("LinkedList is null");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }

        secondNode.next =null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        long l=2;
        long r=8;
        long result = 0;
        for(long i=0; i<l; i++){
            result = result^i;
        }
        long check = l+r;
       while(l<=r){
            result = result^(result^l);
            l++;
        }

       System.out.println(result);

    }
}