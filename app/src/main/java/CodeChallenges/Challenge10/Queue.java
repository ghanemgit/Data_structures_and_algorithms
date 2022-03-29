package CodeChallenges.Challenge10;

public class Queue {

    Node front;
    Node back;

    public Queue() {
        front = back = null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getBack() {
        return back;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public boolean isEmpty(){
        return front == null;
    }

    //insert an element at the end of the queue
    public void enqueue(int value){

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
    public int dequeue(){

        int deletedValue;
        Node deletedPointer;//create new pointer to stay at the element we want to delete it
        deletedPointer = front;//put the new pointer at the beginning of queue

        if (isEmpty()){
            System.err.println("The queue is empty");
            return 0;
        }
        //If the queue has one element give null value to two pointers and java will automatically delete it by garbage collector
        else if (front == back){
            front = back = null;
            deletedValue = front.data;
        }

        else {
            front = front.next;//move the pointer a step forward
            deletedValue =  deletedPointer.data;
            deletedPointer = null;
        }
        return deletedValue;
    }

    // return the Value of the node located at the front of the queue
    public int peek(){

        if (isEmpty()){
            System.err.println("The queue is empty");
            return 0;
        }else {
            return front.data;
        }

    }
    public boolean isFound(int value) {
        boolean found = false;

        Node newNode = front;
        if (isEmpty()) {
            return found;
        } else {

            while (newNode != null) {
                if (newNode.data == value)
                found = true;
                newNode = newNode.next;
            }


        }
        return found;
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

    public String reverseAndPrintAll() {

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
