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
       ArrayList<Integer> A = new ArrayList<>();
       A.add(1);
       A.add(2);
       A.add(3);
       A.add(7);
       A.add(1);
       A.add(2);
       A.add(3);

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        even.add(A.get(0));
        odd.add(0);

        for(int i=1; i<A.size(); i++){
            if(i%2 == 0){
                even.add(even.get(i-1)+A.get(i));
            }else{
                even.add(even.get(i-1));
            }
        }

        for(int i=1; i<A.size(); i++){
            if(i%2 == 1){
                odd.add(odd.get(i-1)+A.get(i));
            }else{
                odd.add(odd.get(i-1));
            }
        }

        int count=0;
        if(even.get(A.size()-1) - even.get(0) == odd.get(A.size()-1) - odd.get(0)){
            count++;
        }

        for(int i=1; i<A.size(); i++){
            int oddValue = odd.get(i-1) + even.get(A.size()-1) - even.get(i);
            int evenValue = even.get(i-1) + odd.get(A.size() -1) - odd.get(i);

            if(oddValue == evenValue){
                count++;
            }
        }

        System.out.println(count);
    }
}