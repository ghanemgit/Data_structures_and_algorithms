package CodeChallenges.Challenge10;

public class Queue<T> {

    Node front;
    Node back;

    public Queue() {
        front = back = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    //insert an element at the end of the queue
    public void enqueue(T value){

        Node newNode = new Node();
        newNode.data = value;

        if (isEmpty()){
        front = back = newNode;
        } else {
            back.next = newNode;//Add the newNode value to our created linked list
            back = newNode;//move the back pointer to make it pointer to new node value
        }


    }

    //Removes the node from the front of the queue
    public T dequeue(){

        T deletedValue;
        Node deletedPointer;//create new pointer to stay at the element we want to delete it
        deletedPointer = front;//put the new pointer at the beginning of queue

        if (isEmpty()){
            System.err.println("The queue is empty");
            return null;
        }
        //If the queue has one element give null value to two pointers and java will automatically delete it by garbage collector
        else if (front == back){
            front = back = null;
            deletedValue = (T) front.data;
        }

        else {
            front = front.next;//move the pointer a step forward
            deletedValue = (T) deletedPointer.data;
            deletedPointer = null;
        }
        return deletedValue;
    }

    // return the Value of the node located at the front of the queue
    public T peek(){

        if (isEmpty()){
            System.err.println("The queue is empty");
            return null;
        }else {
            return (T) front.data;
        }

    }

    //Print all element of queue.
    public String printAll() {

        String str = "";
        Node newNode = front;
        if (isEmpty()) {
            str += "The queue is empty";
        } else {
            str += "Your queue is => ";
            while (newNode != null) {
                str += "{ " + newNode.data + " } => ";
                newNode = newNode.next;
            }
            str += "null";

        }
        return str;
    }
}
