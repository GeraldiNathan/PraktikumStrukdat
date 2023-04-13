package Modul3.Praktikum.Kegiatan2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

//
public class Queue {

    //ArrayList<String> queueLength = new ArrayList<String>();
    int queueLength = 4;
    int items[] = new int[queueLength];
    int peek = -1;
    int back = -1;

    boolean isFull(){
        if(back == queueLength -1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(peek == -1 && back == -1){
            return true;
        } else {
            return false;
        }
    }

    void enQueue(int itemValue) {
        if(isFull()){
            System.out.println("Queue is full");
        } else if(peek == -1 && back == -1){
            peek = back = 0;
            items[back] = itemValue;
        } else{
            back++;
            items[back] = itemValue;
        }
    }

    void deQueue(){

        Deque<String> deque = new ArrayDeque<>();
        if(isEmpty()){
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (peek == back){
            peek = back = -1;
        } else {
            peek++;
        }
    }

    void display(){
        int i;

        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            for(i = peek; i <= back; i++){
                System.out.println(items[i]);
            }
        }
    }

    void peak(){
        System.out.println("Peek value is: " + items[peek]);
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enQueue(2);
        myQueue.enQueue(1);
        myQueue.enQueue(3);
        myQueue.enQueue(4);


        myQueue.display();

        myQueue.peak();
    }
}
