package Modul3.latihan1;

public class Stack{
        private int maxSize;
        private long[] stackArray;
        private int top;
        public Stack(int a){
            maxSize = 5;
            stackArray = new long[maxSize];
            top = -1;
        }
        public void push (long j){
            stackArray[++top] = j;
        }
        public long pop(){
            return stackArray[top--];
        }
        public long peek(){
            return stackArray[top];
        }
        public boolean isEmpty(){
            return(top == -1);
        }
        public boolean isFull(){
            return (top == maxSize-1);
        }

        public class main{
            public static void main(String[] args) {
                Stack theStack = new Stack(10);
                theStack.push(9);
                theStack.push(30);
                theStack.push(10);
                theStack.push(100);

                while (!theStack.isEmpty()){
                    long value = theStack.pop();
                    System.out.println(value);
                    System.out.println(" ");
                }
                System.out.println("");
            }
        }
    }
